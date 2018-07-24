package filmarks.service;

import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.Post;
import filmarks.domain.FavoriteRepository;
import filmarks.domain.PostRepository;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Favoriteに関係する操作を担当するクラス
 *
 * @author naoki.shizuka
 */
@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Autowired
    private PostRepository postRepository;

    public OptionalEntity<Favorite> loadFavoriteByUserIdAndAlbumId(int userId, int albumId) {
        return favoriteRepository.findByUserIdAndAlbumId(userId, albumId);
    }

    @Transactional
    public Favorite create(Favorite favorite) {
        favoriteRepository.save(favorite);
        Post post = new Post();
        post.setTargetId(favorite.getFavoriteId());
        post.setTargetType("Favorite");
        post.setUserId(favorite.getUserId());
        post.setCreatedAt(favorite.getFavoriteCreatedAt());
        postRepository.save(post);
        return favorite;
    }

    public void delete(Favorite favorite) {
        favoriteRepository.delete(favorite);
    }
}
