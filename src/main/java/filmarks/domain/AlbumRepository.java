package filmarks.domain;

import filmarks.dbflute.exbhv.AlbumBhv;
import filmarks.dbflute.exentity.Album;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlbumRepository {

    @Autowired
    private AlbumBhv albumBhv;

    public List<Album> findAlbums() {
        ListResultBean<Album> albums = albumBhv.selectList(cb -> {
            cb.query().addOrderBy_AlbumId_Asc();
        });
        return albums;
    }

    public Album findOne(int albumId) {
        Album album = albumBhv.selectByPK(albumId).get();
        albumBhv.loadFavorite(album, cb -> {
            cb.addOrderBy_PK_Desc();
        });
        albumBhv.loadSong(album, cb -> {
            cb.addOrderBy_PK_Asc();
        });
        albumBhv.loadComment(album, cb -> {
            cb.setupSelect_User();
        });
        return album;
    }

    public List<Album> findByScope(List<Integer> ids) {
        return albumBhv.selectList(cb -> {
            cb.query().setArtistId_InScope(ids);
        });
    }
}
