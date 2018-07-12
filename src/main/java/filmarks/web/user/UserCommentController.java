package filmarks.web.user;

import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.User;
import filmarks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserCommentController {

    @Autowired
    private UserBhv userBhv;

    @Autowired
    private UserService userService;

    @RequestMapping("/users/{userId}/comments")
    public ModelAndView index(@PathVariable int userId, ModelAndView mav) {
        User user = userService.findOne(userId);
        userBhv.loadComment(user, cb -> {
            cb.setupSelect_Album();
        });
        mav.addObject("user", user);
        mav.setViewName("/user/comment/index");
        return mav;
    }
}
