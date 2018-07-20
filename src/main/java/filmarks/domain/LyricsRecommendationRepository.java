package filmarks.domain;

import filmarks.dbflute.exbhv.LyricsRecommendationBhv;
import filmarks.dbflute.exentity.LyricsRecommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LyricsRecommendationRepository {

    @Autowired
    LyricsRecommendationBhv lyricsRecommendationBhv;

    public LyricsRecommendation save(LyricsRecommendation lyricsRecommendation) {
        lyricsRecommendationBhv.insert(lyricsRecommendation);
        return lyricsRecommendation;
    }
}
