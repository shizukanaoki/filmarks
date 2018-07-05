package filmarks.domain;

import filmarks.dbflute.exbhv.CommentBhv;
import filmarks.dbflute.exentity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {

    @Autowired
    CommentBhv commentBhv;

    public Comment save(Comment comment) {
        commentBhv.insert(comment);
        return comment;
    }
}
