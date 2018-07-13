package filmarks.domain;

import filmarks.dbflute.exbhv.FavoriteBhv;
import filmarks.dbflute.exbhv.PostBhv;
import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.Post;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FavoriteRepository {

    @Autowired
    FavoriteBhv favoriteBhv;

    @Autowired
    PostBhv postBhv;

    public OptionalEntity<Favorite> findByUserIdAndAlbumId(int userId, int albumId) {
        return favoriteBhv.selectEntity(cb -> {
            cb.query().setUserId_Equal(userId);
            cb.query().setAlbumId_Equal(albumId);
        });
    }

    public Favorite save(Favorite favorite) {
        favoriteBhv.insert(favorite);
        Post post = new Post();
        post.setTargetId(favorite.getFavoriteId());
        post.setTargetType("Favorite");
        post.setUserId(favorite.getUserId());
        post.setCreatedAt(favorite.getFavoriteCreatedAt());
        postBhv.insert(post);
        return favorite;
    }

    public void delete(Favorite favorite) {
        favoriteBhv.delete(favorite);
    }
}
