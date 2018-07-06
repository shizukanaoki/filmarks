package filmarks.web;

import filmarks.dbflute.exentity.User;
import filmarks.service.UserService;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users/{id}")
    public ModelAndView show (@PathVariable int id, ModelAndView mav) {
        try {
            User user = userService.findOne(id);
            List<User> followings = user.getRelationshipByFollowingIdList().stream()
                    .map(following -> following.getUserByFollowerId().get())
                    .collect(Collectors.toList());
            List<User> followers = user.getRelationshipByFollowerIdList().stream()
                    .map(follower -> follower.getUserByFollowingId().get())
                    .collect(Collectors.toList());
            mav.addObject("user", user);
            mav.addObject("followings", followings);
            mav.addObject("followers", followers);
            mav.setViewName("user/show");
            return mav;
        } catch (EntityAlreadyDeletedException e) {
            mav.setViewName("error/404");
            return mav;
        }
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView form(@ModelAttribute("formmodel") User user, ModelAndView mav) {
        mav.setViewName("user/new");
        return mav;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute("formmodel") User user) {
        userService.create(user);
        return new ModelAndView("redirect:/login");
    }
}
