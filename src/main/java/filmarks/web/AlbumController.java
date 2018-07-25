package filmarks.web;

import filmarks.dbflute.exbhv.AlbumBhv;
import filmarks.dbflute.exbhv.FavoriteBhv;
import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.User;
import filmarks.service.AlbumService;
import filmarks.web.form.CommentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * アルバム関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class AlbumController {
    @Autowired
    private AlbumBhv albumBhv;

    @Autowired
    private UserBhv userBhv;

    @Autowired
    private FavoriteBhv favoriteBhv;

    @Autowired
    AlbumService albumService;

    @RequestMapping(value = {"/", "/albums"}, method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView index(@AuthenticationPrincipal User user, ModelAndView mav) {
        mav.addObject("user", user);
        List<Album> albums = albumService.findAlbums();
        mav.addObject("albums", albums);
        mav.setViewName("album/index");
        return mav;
    }

    @RequestMapping(value = "/albums/{albumId}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView show(@ModelAttribute("commentForm") CommentForm commentForm, @PathVariable int albumId, @AuthenticationPrincipal User user, ModelAndView mav) {
        Album album = albumService.findOne(albumId);
        boolean isFollowing = album.getFavoriteList().stream().anyMatch(favorite -> user.getUserId().equals(favorite.getUserId()));
        mav.addObject("album", album);
        mav.addObject("isFollowing", isFollowing);
        mav.addObject("user", user);
        mav.setViewName("album/show");
        return mav;
    }
}
