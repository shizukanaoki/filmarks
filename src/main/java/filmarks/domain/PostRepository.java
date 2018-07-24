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
}
