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

@Controller
public class UserFollowingController {

    @Autowired
    UserService userService;

    @Autowired
    UserFollowingService userFollowingService;

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
}
