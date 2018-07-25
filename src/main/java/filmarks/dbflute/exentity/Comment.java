package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsComment;
import filmarks.domain.Postable;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The entity of COMMENT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class Comment extends BsComment implements Postable {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    @Override
    public String getContent() {
        return super.getContent();
    }

    @Override
    public Album getRelatedAlbum() {
        return getAlbum().get();
    }

    @Override
    public String getDescription() {
        return "コメントしました";
    }

    public int getDisplayRate() {
        return getRate().divide(new BigDecimal(2.0), 0, RoundingMode.HALF_UP).intValue();
    }
}
