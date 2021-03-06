package filmarks.web;


import filmarks.dbflute.exentity.Album;
import filmarks.dbflute.exentity.Artist;
import filmarks.dbflute.exentity.LyricsRecommendation;
import filmarks.dbflute.exentity.Song;
import filmarks.dbflute.exentity.User;
import filmarks.service.LyricsRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LyricsRecommendation関係のページを扱うコントローラー
 */
@Controller
public class LyricsController {

    @Autowired
    private LyricsRecommendationService lyricsRecommendationService;

    @RequestMapping("/lyrics")
    public ModelAndView index(@AuthenticationPrincipal User loginUser, ModelAndView mav) {
        mav.addObject("user", loginUser);
        List<LyricsRecommendation> recommendations = lyricsRecommendationService.findAll();
        List<Map<String, String>> posts = new ArrayList<>();

        recommendations.forEach(recommendation -> {
            User user = recommendation.getUser().get();
            Song song = recommendation.getSong().get();
            Album album = song.getAlbum().get();
            Artist artist = album.getArtist().get();

            Map<String, String> post = new HashMap<>();
            post.put("content", recommendation.getLyrics());
            post.put("artist_name", artist.getArtistName());
            post.put("album_title", album.getAlbumTitle());
            post.put("album_id", String.valueOf(album.getAlbumId()));
            post.put("song_title", song.getSongTitle());
            post.put("song_id", String.valueOf(song.getSongId()));
            post.put("file_name", "/image/album/" + album.getImageFileName());
            post.put("user_id", String.valueOf(user.getUserId()));
            post.put("username", user.getUsername());

            posts.add(post);
        });

        mav.addObject("posts", posts);
        mav.setViewName("lyrics/index");
        return mav;
    }
}
