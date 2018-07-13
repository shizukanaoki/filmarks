package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsComment;
import filmarks.domain.Postable;

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
}
