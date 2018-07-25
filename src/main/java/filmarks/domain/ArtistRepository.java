package filmarks.domain;

import filmarks.dbflute.exbhv.ArtistBhv;
import filmarks.dbflute.exentity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtistRepository {

    @Autowired
    private ArtistBhv artistBhv;

    public List<Artist> findByScope(List<Integer> ids) {
        return artistBhv.selectList(artistCB -> {
            artistCB.query().addOrderBy_ArtistId_Asc();
            artistCB.query().setArtistId_InScope(ids);
        });
    }
}
