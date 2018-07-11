package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsComment;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * The entity of COMMENT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */

@NoArgsConstructor
public class Comment extends BsComment {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public Comment(int userID, int albumID, String content, BigDecimal rate) {
        this.setUserId(userID);
        this.setAlbumId(albumID);
        this.setContent(content);
        this.setRate(rate);
    }
}
