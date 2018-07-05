package filmarks.service;

import filmarks.dbflute.exentity.Comment;
import filmarks.domain.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment create(Comment comment) {
        commentRepository.save(comment);
        return comment;
    }
}
