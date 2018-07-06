package filmarks.web;

import filmarks.dbflute.exbhv.AlbumBhv;
import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.Comment;
import filmarks.dbflute.exentity.User;
import filmarks.service.CommentService;
import filmarks.web.form.CommentForm;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class CommentController {

    @Autowired
    AlbumBhv albumBhv;

    @Autowired
    CommentService commentService;

    @RequestMapping("albums/{albumId}/comments")
    public ModelAndView create(@ModelAttribute("commentForm") @Validated CommentForm commentForm, BindingResult result, @PathVariable int albumId, Principal principal, ModelAndView mav) {
        ModelAndView res;
        if (!result.hasErrors()) {
            Authentication auth = (Authentication) principal;
            User user = (User) auth.getPrincipal();
            Comment comment = new Comment(user.getId(), albumId, commentForm.getContent(), commentForm.getRate());
            commentService.create(comment);
            res = new ModelAndView("redirect:/");
        } else {
            mav.setViewName("album/show");
            OptionalEntity<Album> albumOptionalEntity = albumBhv.selectEntity(cb -> cb.query().setId_Equal(albumId));
            albumOptionalEntity.ifPresent(album -> {
                albumBhv.loadComment(album, commentCB-> {
                    commentCB.setupSelect_User();
                });
                mav.addObject("album", album);
                mav.setViewName("album/show");
            }).orElse(() -> {
                mav.setViewName("error/404");
            });
            res = mav;
        }
        return res;
    }
}
