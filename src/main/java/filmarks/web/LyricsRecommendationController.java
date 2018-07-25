package filmarks.web;

import filmarks.dbflute.exentity.LyricsRecommendation;
import filmarks.dbflute.exentity.User;
import filmarks.service.LyricsRecommendationService;
import filmarks.validator.LyricsValidator;
import filmarks.web.form.LyricsRecommendationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LyricsRecommendationController {

    @Autowired
    LyricsRecommendationService lyricsRecommendationService;

    @Autowired
    LyricsValidator lyricsValidator;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(lyricsValidator);
    }

    @RequestMapping("/songs/{songId}/lyricsRecommendation")
    public ModelAndView create(@ModelAttribute("form") @Validated LyricsRecommendationForm form, BindingResult result, @PathVariable int songId, @AuthenticationPrincipal User user) {
        if (result.hasErrors()) {
            return new ModelAndView("redirect:/songs/" + songId);
        } else {
            LyricsRecommendation recommendation = new LyricsRecommendation();
            recommendation.setSongId(songId);
            recommendation.setUserId(user.getUserId());
            recommendation.setLyrics(form.getLyrics());
            lyricsRecommendationService.create(recommendation);
            return new ModelAndView("redirect:/songs/" + songId);
        }
    }
}
