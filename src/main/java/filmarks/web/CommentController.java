package filmarks.web;

import filmarks.dbflute.exentity.Comment;
import filmarks.dbflute.exentity.User;
import filmarks.service.CommentService;
import filmarks.web.form.CommentForm;
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

import java.time.LocalDateTime;

/**
 * コメント関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "albums/{albumId}/comments", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute("commentForm") @Validated CommentForm commentForm, BindingResult result, @PathVariable int albumId, @AuthenticationPrincipal User user, RedirectAttributes redirectAttributes) {
        if (!result.hasErrors()) {
            Comment comment = new Comment();
            comment.setAlbumId(albumId);
            comment.setUserId(user.getUserId());
            comment.setContent(commentForm.getContent());
            comment.setRate(commentForm.getRate());
            comment.setCommentCreatedAt(LocalDateTime.now());
            commentService.create(comment);
        } else {
            redirectAttributes.addFlashAttribute("errors", result.getAllErrors());
        }
        return new ModelAndView("redirect:/albums/" + albumId);
    }
}
