package filmarks.web;

import filmarks.dbflute.exentity.Comment;
import filmarks.dbflute.exentity.User;
import filmarks.service.CommentService;
import filmarks.web.form.CommentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping("albums/{albumId}/comments")
    public ModelAndView create(@ModelAttribute("form") CommentForm commentForm, @PathVariable int albumId, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();
        Comment comment = new Comment(user.getId(), albumId, commentForm.getContent(), commentForm.getRate());
        commentService.create(comment);
        return new ModelAndView("redirect:/");
    }
}
