package filmarks.web;

import filmarks.dbflute.cbean.FavoriteCB;
import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.User;
import filmarks.service.FavoriteService;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author naoki.shizuka
 */

@Controller
public class FavoriteController {

    @Autowired
    FavoriteService favoriteService;

    @Autowired
    UserBhv userBhv;

    @RequestMapping(value = "albums/{albumID}/favorites", method = RequestMethod.POST)
    public ModelAndView create(@PathVariable int albumID, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();
        favoriteService.create(new Favorite(user.getUserId(), albumID));
        return new ModelAndView("redirect:/albums/" + String.valueOf(albumID));
    }

    @RequestMapping(value = "albums/{albumID}/favorites", method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable int albumID, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();
        OptionalEntity<Favorite> favoriteOptionalEntity = favoriteService.loadFavoriteByUserIdAndAlbumId(user.getUserId(), albumID);
        favoriteOptionalEntity.ifPresent(favorite -> favoriteService.delete(favorite));
        return new ModelAndView("redirect:/albums/" + String.valueOf(albumID));
    }

    @RequestMapping("/favorites")
    public ModelAndView index(ModelAndView mav, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();
        userBhv.loadFavorite(user, FavoriteCB::setupSelect_Album);
        List<Album> albums = user.getFavoriteList().stream().map(favorite -> favorite.getAlbum().get()).collect(Collectors.toList());
        mav.addObject("albums", albums);
        mav.setViewName("favorite/index");
        return mav;
    }
}