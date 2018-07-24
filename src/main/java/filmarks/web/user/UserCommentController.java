package filmarks.web.user;

import filmarks.dbflute.exentity.User;
import filmarks.service.UserFollowingService;
import filmarks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 特定のユーザーのコメントページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class UserCommentController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserFollowingService userFollowingService;

    @RequestMapping(value = "/users/{userId}/comments", method = RequestMethod.GET)
    public ModelAndView index(@AuthenticationPrincipal User loginUser, @PathVariable int userId, ModelAndView mav) {
        mav.addObject("loginUser", loginUser);
        User user = userService.findOne(userId);
        mav.addObject("user", user);
        boolean isFollowing = userFollowingService.isFollowing(loginUser.getUserId(), user.getUserId());
        mav.addObject("isFollowing", isFollowing);
        mav.setViewName("/user/comment/index");
        return mav;
    }
}
