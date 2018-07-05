package filmarks.web;

import filmarks.dbflute.exentity.Comment;
import filmarks.service.CommentService;
import filmarks.web.form.CommentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping("albums/{id}/comments/new")
    public ModelAndView form(@ModelAttribute("form") CommentForm form, ModelAndView mav) {
        mav.setViewName("comment/new");
        return mav;
    }

    @RequestMapping("/comments")
    public ModelAndView create(@ModelAttribute("form") CommentForm commentForm) {
        Comment comment = new Comment(commentForm);
        commentService.create(comment);
        return new ModelAndView("redirect:/");
    }
}
