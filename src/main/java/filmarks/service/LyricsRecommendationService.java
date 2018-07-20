package filmarks.service;

import filmarks.dbflute.exentity.LyricsRecommendation;
import filmarks.domain.LyricsRecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LyricsRecommendationService {

    @Autowired
    LyricsRecommendationRepository lyricsRecommendationRepository;

    public LyricsRecommendation create(LyricsRecommendation lyricsRecommendation) {
        lyricsRecommendationRepository.save(lyricsRecommendation);
        return lyricsRecommendation;
    }

    public List<LyricsRecommendation> findAll() {
        return lyricsRecommendationRepository.findAll();
    }
}
