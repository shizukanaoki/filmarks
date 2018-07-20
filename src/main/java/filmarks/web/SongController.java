package filmarks.web;

import filmarks.dbflute.exbhv.SongBhv;
import filmarks.dbflute.exentity.Song;
import filmarks.web.form.LyricsRecommendationForm;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SongController {

    @Autowired
    SongBhv songBhv;

    @RequestMapping("/songs/{songId}")
    public ModelAndView show(@ModelAttribute("form") LyricsRecommendationForm form, @PathVariable int songId, ModelAndView mav) {
        OptionalEntity<Song> songOptionalEntity = songBhv.selectEntity(songCB -> {
            songCB.query().setSongId_Equal(songId);
            songCB.setupSelect_Album().withArtist();
        });
        songOptionalEntity.alwaysPresent(song -> {
            songBhv.loadLyricsRecommendation(song, cb -> {
                cb.setupSelect_User();
            });
            mav.addObject("song", song);
        });
        mav.setViewName("song/show");
        return mav;
    }
}
