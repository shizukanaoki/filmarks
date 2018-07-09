package filmarks.web;

import filmarks.dbflute.cbean.FavoriteCB;
import filmarks.dbflute.exbhv.FavoriteBhv;
import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.User;

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
    FavoriteBhv favoriteBhv;

    @Autowired
    UserBhv userBhv;

    @RequestMapping(value = "albums/{albumID}/favorites", method = RequestMethod.POST)
    public ModelAndView create(@PathVariable int albumID, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();
        favoriteBhv.insert(new Favorite(user.getUserId(), albumID));
        return new ModelAndView("redirect:/albums/" + String.valueOf(albumID));
    }

    @RequestMapping("/favorites")
    public ModelAndView index(ModelAndView mav, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();
        userBhv.loadFavorite(user, FavoriteCB::setupSelect_Album);
        List<Album> albums = user.getFavoriteList().stream().map(favorite -> favorite.getAlbum().get()).collect(Collectors.toList());
        albums.get(0).getTitle();
        mav.addObject("albums", albums);
        mav.setViewName("favorite/index");
        return mav;
    }
}
