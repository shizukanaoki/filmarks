package filmarks.web;

import filmarks.dbflute.exentity.User;
import filmarks.dbflute.exentity.UserFollowing;
import filmarks.service.UserFollowingService;
import filmarks.service.UserService;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * フォロー関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class UserFollowingController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserFollowingService userFollowingService;

    @RequestMapping(value = "/users/{userId}/followings", method = RequestMethod.GET)
    public ModelAndView followings(@PathVariable int userId, @AuthenticationPrincipal User loginUser, ModelAndView mav) {
        User user = userService.findOne(userId);
        mav.addObject("user", user);
        boolean isFollowing = userFollowingService.isFollowing(loginUser.getUserId(), user.getUserId());
        mav.addObject("isFollowing", isFollowing);
        List<User> followings = userService.findFollowings(userId);
        mav.addObject("followings", followings);
        mav.setViewName("user/userFollowing/followings");
        return mav;
    }

    @RequestMapping(value = "/users/{userId}/followers", method = RequestMethod.GET)
    public ModelAndView followers(@PathVariable int userId, @AuthenticationPrincipal User loginUser, ModelAndView mav) {
        User user = userService.findOne(userId);
        mav.addObject("user", user);
        boolean isFollowing = userFollowingService.isFollowing(loginUser.getUserId(), user.getUserId());
        mav.addObject("isFollowing", isFollowing);
        List<User> followers = userService.findFollowers(userId);
        mav.addObject("followers", followers);
        mav.setViewName("user/userFollowing/followers");
        return mav;
    }

    @RequestMapping(value = "/relationships/{followerId}", method = RequestMethod.POST)
    public ModelAndView create(@PathVariable int followerId, @AuthenticationPrincipal User following) {
        try {
            User follower = userService.findOne(followerId);
            UserFollowing userFollowing = new UserFollowing();
            userFollowing.setFollowerId(follower.getUserId());
            userFollowing.setFollowingId(following.getUserId());
            userFollowingService.create(userFollowing);
            return new ModelAndView("redirect:/users/" + follower.getUserId());
        } catch (EntityAlreadyDeletedException e) {
            return new ModelAndView("redirect:/");
        }
    }

    @RequestMapping(value = "/relationships/{followerId}", method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable int followerId, @AuthenticationPrincipal User following) {
        try {
            UserFollowing userFollowing = userFollowingService.loadUserFollowingByFollowingAndFollowerId(following.getUserId(), followerId);
            userFollowingService.delete(userFollowing);
            return new ModelAndView("redirect:/users/" + followerId);
        } catch (EntityAlreadyDeletedException e) {
            return new ModelAndView("redirect:/");
        }
    }
}
