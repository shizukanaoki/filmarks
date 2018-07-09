package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsFavorite;
import lombok.NoArgsConstructor;

/**
 * The entity of FAVORITE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */

@NoArgsConstructor
public class Favorite extends BsFavorite {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public Favorite(int userID, int albumID) {
        this.setUserId(userID);
        this.setAlbumId(albumID);
    }
}
