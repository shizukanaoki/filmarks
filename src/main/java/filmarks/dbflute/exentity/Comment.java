package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsComment;
import filmarks.web.form.CommentForm;

import java.math.BigDecimal;

/**
 * The entity of COMMENT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class Comment extends BsComment {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public Comment(){}

    public Comment(CommentForm form) {
        this.setUserId(form.getUserID());
        this.setAlbumId(form.getAlbumID());
        this.setContent(form.getContent());
        this.setRate(new BigDecimal(Float.toString(form.getRate())));
    }
}
