package filmarks.web;

import filmarks.dbflute.exentity.User;
import filmarks.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView form(@ModelAttribute("formmodel") User user, ModelAndView mav) {
        mav.setViewName("user/form");
        return mav;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute("formmodel") User user) {
        userRepository.save(user);
        return new ModelAndView("redirect:/login");
    }
}
