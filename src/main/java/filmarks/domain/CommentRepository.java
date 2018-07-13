package filmarks.domain;

import filmarks.dbflute.exbhv.CommentBhv;
import filmarks.dbflute.exbhv.PostBhv;
import filmarks.dbflute.exentity.Comment;
import filmarks.dbflute.exentity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {

    @Autowired
    private CommentBhv commentBhv;

    @Autowired
    private PostBhv postBhv;

    public Comment save(Comment comment) {
        commentBhv.insert(comment);
        Post post = new Post();
        post.setTargetId(comment.getCommentId());
        post.setTargetType("Comment");
        post.setUserId(comment.getUserId());
        post.setCreatedAt(comment.getCommentCreatedAt());
        postBhv.insert(post);
        return comment;
    }
}
