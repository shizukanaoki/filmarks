package filmarks.web;

import filmarks.dbflute.cbean.CommentCB;
import filmarks.dbflute.exbhv.AlbumBhv;
import filmarks.dbflute.exbhv.FavoriteBhv;
import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.Artist;
import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.User;
import filmarks.service.RecommendService;
import filmarks.web.form.CommentForm;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class AlbumController {
    @Autowired
    AlbumBhv albumBhv;

    @Autowired
    UserBhv userBhv;

    @Autowired
    FavoriteBhv favoriteBhv;

    @Autowired
    RecommendService recommendService;

    @RequestMapping(value = {"/", "/albums"})
    @ResponseBody
    public ModelAndView index(ModelAndView mav, @AuthenticationPrincipal User user) {
        List<Artist> recommendedArtists = recommendService.findRecommendedArtists(user);
        List<Integer> artistIds = recommendedArtists.stream()
                .map(Artist::getArtistId)
                .collect(Collectors.toList());
        ListResultBean<Album> albums = albumBhv.selectList(cb -> {
            cb.query().setArtistId_InScope(artistIds);
        });
        Collections.shuffle(albums);
        albumBhv.loadComment(albums, cb -> {});
        mav.addObject("albums", albums);
        mav.setViewName("album/index");
        return mav;
    }

    @RequestMapping("/albums/{albumId}")
    @ResponseBody
    public ModelAndView show(@ModelAttribute("commentForm") CommentForm commentForm, @PathVariable int albumId, ModelAndView mav, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();

        OptionalEntity<Album> albumOptionalEntity = albumBhv.selectByPK(albumId);
        albumOptionalEntity.alwaysPresent(album -> {
            albumBhv.loadComment(album, CommentCB::setupSelect_User);
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
