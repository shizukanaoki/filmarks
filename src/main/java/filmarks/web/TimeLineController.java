package filmarks.web;

import filmarks.dbflute.exentity.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author naoki.shizuka
 */
@Controller
public class TimeLineController {

    @RequestMapping("/timeline")
    public ModelAndView show(@AuthenticationPrincipal User user, ModelAndView mav) {
        mav.addObject("user", user);
        mav.setViewName("/timeline/show");
        return mav;
    }
}
