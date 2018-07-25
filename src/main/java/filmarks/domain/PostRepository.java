package filmarks.domain;

import filmarks.dbflute.exbhv.PostBhv;
import filmarks.dbflute.exentity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * PostのCRUDを担当するクラス
 *
 * @author naoki.shizuka
 */
@Repository
public class PostRepository {

    @Autowired
    private PostBhv postBhv;

    public Post save(Post post) {
        postBhv.insert(post);
        return post;
    }

    public void delete(int postId) {
        Post post = postBhv.selectByPK(postId).get();
        postBhv.delete(post);
    }

    public Post findOne(int targetId, String targetType, int userId) {
        Post post = postBhv.selectEntity(cb -> {
            cb.query().setTargetId_Equal(targetId);
            cb.query().setTargetType_Equal(targetType);
            cb.query().setUserId_Equal(userId);
        }).get();
        return post;
    }
}
