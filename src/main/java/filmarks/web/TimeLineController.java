package filmarks.web;

import filmarks.dbflute.exentity.Post;
import filmarks.dbflute.exentity.User;
import filmarks.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * タイムライン関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class TimeLineController {

    @Autowired
    PostService postService;

    @RequestMapping("/timeline")
    public ModelAndView show(@AuthenticationPrincipal User user, ModelAndView mav) {
        List<Post> posts = postService.findPostListByUserId(user.getUserId());
        mav.addObject("posts", posts);
        mav.addObject("user", user);
        mav.setViewName("/timeline/show");
        return mav;
    }
}
