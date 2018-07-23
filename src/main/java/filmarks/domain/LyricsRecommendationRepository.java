package filmarks.domain;

import filmarks.dbflute.exbhv.LyricsRecommendationBhv;
import filmarks.dbflute.exentity.LyricsRecommendation;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LyricsRecommendationRepository {

    @Autowired
    LyricsRecommendationBhv lyricsRecommendationBhv;

    public LyricsRecommendation save(LyricsRecommendation lyricsRecommendation) {
        lyricsRecommendationBhv.insert(lyricsRecommendation);
        return lyricsRecommendation;
    }

    public List<LyricsRecommendation> findAll() {
        ListResultBean<LyricsRecommendation> lyricsRecommendations = lyricsRecommendationBhv.selectList(cb -> {
            cb.query().addOrderBy_Id_Desc();
            cb.setupSelect_User();
            cb.setupSelect_Song().withAlbum().withArtist();
        });
        return lyricsRecommendations;
    }
}
