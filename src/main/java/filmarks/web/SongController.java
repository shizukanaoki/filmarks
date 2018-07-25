package filmarks.web;

import filmarks.dbflute.exentity.Song;
import filmarks.dbflute.exentity.User;
import filmarks.service.SongService;
import filmarks.web.form.LyricsRecommendationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Song関係のページを扱うコントローラー
 */
@Controller
public class SongController {

    @Autowired
    SongService songService;

    @RequestMapping("/songs/{songId}")
    public ModelAndView show(@ModelAttribute("form") LyricsRecommendationForm form, @PathVariable int songId, @AuthenticationPrincipal User user, ModelAndView mav) {
        mav.addObject("user", user);
        Song song = songService.findOne(songId);
        mav.addObject("song", song);
        mav.setViewName("song/show");
        return mav;
    }
}
