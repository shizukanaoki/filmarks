package filmarks.web;

import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.User;
import filmarks.service.UserFollowingService;
import filmarks.service.UserService;
import filmarks.web.form.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ユーザー関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserFollowingService userFollowingService;

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public ModelAndView show (@AuthenticationPrincipal User loginUser, @PathVariable int userId, ModelAndView mav) {
        mav.addObject("loginUser", loginUser);
        User user = userService.findOne(userId);
        mav.addObject("user", user);
        boolean isFollowing = userFollowingService.isFollowing(loginUser.getUserId(), user.getUserId());
        mav.addObject("isFollowing", isFollowing);
        List<Album> albums = user.getFavoriteList().stream()
                .map(favorite -> favorite.getAlbum().get())
                .collect(Collectors.toList());
        mav.addObject("albums", albums);
        mav.setViewName("user/show");
        return mav;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView form(@ModelAttribute("userForm") UserForm userForm, ModelAndView mav) {
        mav.setViewName("user/new");
        return mav;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute("userForm") @Validated UserForm userForm, BindingResult result, RedirectAttributes redirectAttributes) {
        if (!result.hasErrors()) {
            User user = new User();
            user.setUsername(userForm.getUsername());
            user.setPassword(userForm.getPassword());
            userService.create(user);
            return new ModelAndView("redirect:/login");
        } else {
            redirectAttributes.addFlashAttribute("errors", result.getAllErrors());
        }
        return new ModelAndView("redirect:/signup");
    }
}
