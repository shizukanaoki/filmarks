package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsRelationship;
import lombok.NoArgsConstructor;

/**
 * The entity of RELATIONSHIP.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */

@NoArgsConstructor
public class Relationship extends BsRelationship {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public Relationship(int followingID, int followerID) {
        this.setFollowingId(followingID);
        this.setFollowerId(followerID);
    }
}
