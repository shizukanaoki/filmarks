package filmarks.web;

import filmarks.dbflute.exbhv.AlbumBhv;
import filmarks.dbflute.exbhv.FavoriteBhv;
import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.User;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class AlbumController {
    @Autowired
    AlbumBhv albumBhv;

    @Autowired
    UserBhv userBhv;

    @Autowired
    FavoriteBhv favoriteBhv;

    @RequestMapping(value = {"/", "/albums"})
    @ResponseBody
    public ModelAndView index(ModelAndView mav) {
        ListResultBean<Album> albums = albumBhv.selectList(cb -> cb.query().addOrderBy_AlbumId_Asc());
        mav.addObject("albums", albums);
        mav.setViewName("album/index");
        return mav;
    }

    @RequestMapping("/albums/{id}")
    @ResponseBody
    public ModelAndView show(@PathVariable int id, ModelAndView mav, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();

        OptionalEntity<Album> albumOptionalEntity = albumBhv.selectByPK(id);
        albumOptionalEntity.alwaysPresent(album -> {
            OptionalEntity<Favorite> favoriteOptionalEntity = favoriteBhv.selectEntity(favoriteCB -> {
                favoriteCB.query().setUserId_Equal(user.getUserId());
                favoriteCB.query().setAlbumId_Equal(album.getAlbumId());
            });
            mav.addObject("favoriteOptionalEntity", favoriteOptionalEntity);
            mav.addObject("album", album);
            mav.setViewName("album/show");
        });
        return mav;
    }
}
