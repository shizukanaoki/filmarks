package filmarks.web;

import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.User;
import filmarks.service.FavoriteService;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.time.LocalDateTime;

/**
 * お気に入り関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @RequestMapping(value = "albums/{albumID}/favorites", method = RequestMethod.POST)
    public ModelAndView create(@PathVariable int albumID, Principal principal) {
        Authentication auth = (Authentication)principal;
        User user = (User)auth.getPrincipal();
        Favorite favorite = new Favorite();
        favorite.setUserId(user.getUserId());
        favorite.setAlbumId(albumID);
        favorite.setFavoriteCreatedAt(LocalDateTime.now());
        favoriteService.create(favorite);
        return new ModelAndView("redirect:/albums/" + String.valueOf(albumID));
    }

    @RequestMapping(value = "albums/{albumID}/favorites", method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable int albumID, @AuthenticationPrincipal User user) {
        OptionalEntity<Favorite> favoriteOptionalEntity = favoriteService.loadFavoriteByUserIdAndAlbumId(user.getUserId(), albumID);
        favoriteOptionalEntity.ifPresent(favorite -> favoriteService.delete(favorite));
        return new ModelAndView("redirect:/albums/" + String.valueOf(albumID));
    }
}
