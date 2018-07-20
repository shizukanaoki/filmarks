package filmarks.web;

import filmarks.dbflute.exentity.LyricsRecommendation;
import filmarks.service.LyricsRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LyricsController {

    @Autowired
    LyricsRecommendationService lyricsRecommendationService;

    @RequestMapping("/lyrics")
    public ModelAndView index(ModelAndView mav) {
        List<LyricsRecommendation> recommendations = lyricsRecommendationService.findAll();
        mav.addObject("recommendations", recommendations);
        mav.setViewName("lyrics/index");
        return mav;
    }
}
