package filmarks.web;

import filmarks.dbflute.exentity.Relationship;
import filmarks.dbflute.exentity.User;
import filmarks.service.RelationShipService;
import filmarks.service.UserService;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class RelationshipController {

    @Autowired
    UserService userService;

    @Autowired
    RelationShipService relationShipService;

    @RequestMapping(value = "/relationships/{id}", method = RequestMethod.POST)
    public ModelAndView create(@PathVariable int id, Principal principal, ModelAndView mav) {
        try {
            User follower = userService.findOne(id);
            Authentication auth = (Authentication) principal;
            User following = (User) auth.getPrincipal();
            relationShipService.create(new Relationship(following.getId(), follower.getId()));
            mav.setViewName("user/show");
            mav.addObject("user", follower);
            return mav;
        } catch (EntityAlreadyDeletedException e) {
            mav.setViewName("error/404");
            return mav;
        }
    }
}
