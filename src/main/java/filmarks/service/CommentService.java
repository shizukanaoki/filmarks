package filmarks.service;

import filmarks.dbflute.exentity.Comment;
import filmarks.dbflute.exentity.Post;
import filmarks.domain.CommentRepository;
import filmarks.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Commentに関係する操作を担当するクラス
 *
 * @author naoki.shizuka
 */
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    @Transactional
    public Comment create(Comment comment) {
        commentRepository.save(comment);
        Post post = new Post();
        post.setTargetId(comment.getCommentId());
        post.setTargetType("Comment");
        post.setUserId(comment.getUserId());
        post.setCreatedAt(comment.getCommentCreatedAt());
        postRepository.save(post);
        return comment;
    }
}
