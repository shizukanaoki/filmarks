package filmarks.web;

import filmarks.dbflute.exbhv.AlbumBhv;
import filmarks.dbflute.exbhv.FavoriteBhv;
import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.Comment;
import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.User;
import filmarks.service.CommentService;
import filmarks.web.form.CommentForm;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

/**
 * コメント関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class CommentController {

    @Autowired
    private AlbumBhv albumBhv;

    @Autowired
    private FavoriteBhv favoriteBhv;

    @Autowired
    private CommentService commentService;

    @RequestMapping("albums/{albumId}/comments")
    public ModelAndView create(@ModelAttribute("commentForm") @Validated CommentForm commentForm, BindingResult result, @PathVariable int albumId, @AuthenticationPrincipal User user, ModelAndView mav) {
        ModelAndView res;
        if (!result.hasErrors()) {
            Comment comment = new Comment();
            comment.setAlbumId(albumId);
            comment.setUserId(user.getUserId());
            comment.setContent(commentForm.getContent());
            comment.setRate(commentForm.getRate());
            comment.setCommentCreatedAt(LocalDateTime.now());
            commentService.create(comment);
            res = new ModelAndView("redirect:/albums/" + albumId);
        } else {
            mav.setViewName("album/show");
            OptionalEntity<Album> albumOptionalEntity = albumBhv.selectEntity(cb -> cb.query().setAlbumId_Equal(albumId));
            albumOptionalEntity.ifPresent(album -> {
                albumBhv.loadComment(album, commentCB-> {
                    commentCB.setupSelect_User();
                });
                OptionalEntity<Favorite> favoriteOptionalEntity = favoriteBhv.selectEntity(favoriteCB -> {
                    favoriteCB.query().setUserId_Equal(user.getUserId());
                    favoriteCB.query().setAlbumId_Equal(album.getAlbumId());
                });
                mav.addObject("favoriteOptionalEntity", favoriteOptionalEntity);
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
