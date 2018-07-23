package filmarks.web.user;

import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.User;
import filmarks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 特定のユーザーのコメントページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class UserCommentController {

    @Autowired
    private UserBhv userBhv;

    @Autowired
    private UserService userService;

    @RequestMapping("/users/{userId}/comments")
    public ModelAndView index(@AuthenticationPrincipal User loginUser, @PathVariable int userId, ModelAndView mav) {
        mav.addObject("loginUser", loginUser);
        userBhv.loadUserFollowingByFollowingId(loginUser, cb -> {});
        User user = userService.findOne(userId);
        userBhv.loadComment(user, cb -> {
            cb.setupSelect_Album();
        });
        mav.addObject("user", user);
        mav.setViewName("/user/comment/index");
        return mav;
    }
}
