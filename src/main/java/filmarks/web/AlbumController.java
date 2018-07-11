package filmarks.web;

import filmarks.dbflute.exbhv.AlbumBhv;
import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.Album;
import filmarks.web.form.CommentForm;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlbumController {
    @Autowired
    AlbumBhv albumBhv;

    @Autowired
    UserBhv userBhv;

    @RequestMapping(value = {"/", "/albums"})
    @ResponseBody
    public ModelAndView index(ModelAndView mav) {
        ListResultBean<Album> albums = albumBhv.selectList(cb -> cb.query().addOrderBy_Id_Asc());
        albumBhv.loadComment(albums, cb -> {});
        mav.addObject("albums", albums);
        mav.setViewName("album/index");
        return mav;
    }

    @RequestMapping("/albums/{albumId}")
    @ResponseBody
    public ModelAndView show(@ModelAttribute("commentForm") CommentForm commentForm, @PathVariable int albumId, ModelAndView mav) {
        OptionalEntity<Album> albumOptionalEntity = albumBhv.selectByPK(albumId);
        albumOptionalEntity.ifPresent(album -> {
            albumBhv.loadComment(album, commentCB -> {
                commentCB.setupSelect_User();
            });
            mav.addObject("album", album);
            mav.setViewName("album/show");
        }).orElse(() -> {
            mav.setViewName("error/404");
        });
        return mav;
    }
}
