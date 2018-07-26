package filmarks.web;

import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.Artist;
import filmarks.dbflute.exentity.User;
import filmarks.service.AlbumService;
import filmarks.service.RecommendService;
import filmarks.web.form.CommentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * アルバム関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class AlbumController {

    @Autowired
    private RecommendService recommendService;

    @Autowired
    private AlbumService albumService;

    @RequestMapping(value = {"/", "/albums"})
    @ResponseBody
    public ModelAndView index(ModelAndView mav, @AuthenticationPrincipal User user) {
        mav.addObject("user", user);
        List<Artist> recommendedArtists = recommendService.findRecommendedArtists(user);
        List<Integer> artistIds = recommendedArtists.stream()
                .map(Artist::getArtistId)
                .collect(Collectors.toList());
        List<Album> albums;
        if (recommendedArtists.isEmpty()) {
            albums = albumService.findAlbums();
        } else {
            albums = albumService.findAlbumsByScope(artistIds);
        }

        Collections.shuffle(albums);

        if (albums.size() >= 100) {
            albums = albums.subList(0,  99);
        }
        
        mav.addObject("albums", albums);
        mav.setViewName("album/index");
        return mav;
    }

    @RequestMapping(value = "/albums/{albumId}", method = RequestMethod.GET)
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
