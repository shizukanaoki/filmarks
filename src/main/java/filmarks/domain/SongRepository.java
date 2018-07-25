package filmarks.domain;

import filmarks.dbflute.exbhv.SongBhv;
import filmarks.dbflute.exentity.Song;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {

    @Autowired
    private SongBhv songBhv;

    public Song findOne(int songId) throws EntityAlreadyDeletedException {
        Song song = songBhv.selectEntity(cb -> {
            cb.query().setAlbumId_Equal(songId);
            cb.setupSelect_Album().withArtist();
        }).get();
        songBhv.loadLyricsRecommendation(song, cb -> {
            cb.setupSelect_User();
        });
        return song;
    }
}
