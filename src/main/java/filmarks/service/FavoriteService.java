package filmarks.service;

import filmarks.dbflute.exbhv.PostBhv;
import filmarks.dbflute.exentity.Favorite;
import filmarks.domain.FavoriteRepository;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Favoriteに関係する操作を担当するクラス
 *
 * @author naoki.shizuka
 */
@Service
public class FavoriteService {

    @Autowired
    FavoriteRepository favoriteRepository;

    @Autowired
    PostBhv postBhv;

    public OptionalEntity<Favorite> loadFavoriteByUserIdAndAlbumId(int userId, int albumId) {
        return favoriteRepository.findByUserIdAndAlbumId(userId, albumId);
    }

    public Favorite create(Favorite favorite) {
        favoriteRepository.save(favorite);
        return favorite;
    }

    public void delete(Favorite favorite) {
        favoriteRepository.delete(favorite);
    }
}
