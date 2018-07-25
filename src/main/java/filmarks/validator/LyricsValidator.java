package filmarks.validator;

import filmarks.dbflute.exentity.Song;
import filmarks.service.SongService;
import filmarks.web.form.LyricsRecommendationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LyricsValidator implements Validator {

    @Autowired
    SongService songService;

    @Override
    public boolean supports(Class<?> clazz) {
        return LyricsRecommendationForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LyricsRecommendationForm form = (LyricsRecommendationForm) target;
        String lyrics = form.getLyrics().replaceAll("\\r\\n|\\r|\\n", "");
        Song song = songService.findOne(form.getSongId());

        if (!song.getSongLyrics().replaceAll("\\r\\n|\\r|\\n", " ").contains(lyrics)) {
            errors.rejectValue("lyrics", "LyricsValidator.LyricsRecommendationForm.lyrics", "入力した値は歌詞に含まれていません");
        }
    }
}
