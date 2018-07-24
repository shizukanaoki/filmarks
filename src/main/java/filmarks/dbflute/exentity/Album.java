package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsAlbum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * The entity of ALBUM.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class Album extends BsAlbum {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public BigDecimal getAvgRate() {
        List<Comment> commentList = this.getCommentList();
        if (commentList.size() == 0) {
            return BigDecimal.valueOf(0);
        }

        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < commentList.size(); i++) {
            sum = sum.add(commentList.get(i).getRate());
        }
        return sum.divide(BigDecimal.valueOf(commentList.size()), 2, BigDecimal.ROUND_HALF_UP);
    }

    public int getDisplayRate() {
        return getAvgRate().divide(new BigDecimal(2.0), 0, RoundingMode.HALF_UP).intValue();
    }
}
