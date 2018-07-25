package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsFavorite;
import filmarks.domain.Postable;

/**
 * The entity of FAVORITE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */

public class Favorite extends BsFavorite implements Postable {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public Album getRelatedAlbum() {
        return getAlbum().get();
    }

    @Override
    public String getDescription() {
        return "お気に入りしました";
    }
}
