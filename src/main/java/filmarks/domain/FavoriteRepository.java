package filmarks.domain;

import filmarks.dbflute.exbhv.FavoriteBhv;
import filmarks.dbflute.exentity.Favorite;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * FavoriteのCRUDを担当するクラス
 *
 * @author naoki.shizuka
 */
@Repository
public class FavoriteRepository {

    @Autowired
    private FavoriteBhv favoriteBhv;

    public List<Favorite> findAll() {
        return favoriteBhv.selectList(cb -> {
            cb.setupSelect_Album();
        });
    }

    public OptionalEntity<Favorite> findByUserIdAndAlbumId(int userId, int albumId) {
        return favoriteBhv.selectEntity(cb -> {
            cb.query().setUserId_Equal(userId);
            cb.query().setAlbumId_Equal(albumId);
        });
    }

    public Favorite save(Favorite favorite) {
        favoriteBhv.insert(favorite);
        return favorite;
    }

    public void delete(Favorite favorite) {
        favoriteBhv.delete(favorite);
    }
}
