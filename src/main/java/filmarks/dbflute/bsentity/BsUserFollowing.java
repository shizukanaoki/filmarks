package filmarks.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import filmarks.dbflute.allcommon.DBMetaInstanceHandler;
import filmarks.dbflute.exentity.*;

/**
 * The entity of USER_FOLLOWING as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     ID
 *
 * [column]
 *     ID, FOLLOWING_ID, FOLLOWER_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     userByFollowerId, userByFollowingId
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * Integer followingId = entity.getFollowingId();
 * Integer followerId = entity.getFollowerId();
 * entity.setId(id);
 * entity.setFollowingId(followingId);
 * entity.setFollowerId(followerId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserFollowing extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _id;

    /** FOLLOWING_ID: {UQ+, NotNull, INT(10), FK to USER} */
    protected Integer _followingId;

    /** FOLLOWER_ID: {+UQ, IX, NotNull, INT(10), FK to USER} */
    protected Integer _followerId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "USER_FOLLOWING";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param followingId : UQ+, NotNull, INT(10), FK to USER. (NotNull)
     * @param followerId : +UQ, IX, NotNull, INT(10), FK to USER. (NotNull)
     */
    public void uniqueBy(Integer followingId, Integer followerId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("followingId");
        __uniqueDrivenProperties.addPropertyName("followerId");
        setFollowingId(followingId);setFollowerId(followerId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my FOLLOWER_ID, named 'userByFollowerId'. */
    protected OptionalEntity<User> _userByFollowerId;

    /**
     * [get] USER by my FOLLOWER_ID, named 'userByFollowerId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByFollowerId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUserByFollowerId() {
        if (_userByFollowerId == null) { _userByFollowerId = OptionalEntity.relationEmpty(this, "userByFollowerId"); }
        return _userByFollowerId;
    }

    /**
     * [set] USER by my FOLLOWER_ID, named 'userByFollowerId'.
     * @param userByFollowerId The entity of foreign property 'userByFollowerId'. (NullAllowed)
     */
    public void setUserByFollowerId(OptionalEntity<User> userByFollowerId) {
        _userByFollowerId = userByFollowerId;
    }

    /** USER by my FOLLOWING_ID, named 'userByFollowingId'. */
    protected OptionalEntity<User> _userByFollowingId;

    /**
     * [get] USER by my FOLLOWING_ID, named 'userByFollowingId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByFollowingId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUserByFollowingId() {
        if (_userByFollowingId == null) { _userByFollowingId = OptionalEntity.relationEmpty(this, "userByFollowingId"); }
        return _userByFollowingId;
    }

    /**
     * [set] USER by my FOLLOWING_ID, named 'userByFollowingId'.
     * @param userByFollowingId The entity of foreign property 'userByFollowingId'. (NullAllowed)
     */
    public void setUserByFollowingId(OptionalEntity<User> userByFollowingId) {
        _userByFollowingId = userByFollowingId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUserFollowing) {
            BsUserFollowing other = (BsUserFollowing)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userByFollowerId != null && _userByFollowerId.isPresent())
        { sb.append(li).append(xbRDS(_userByFollowerId, "userByFollowerId")); }
        if (_userByFollowingId != null && _userByFollowingId.isPresent())
        { sb.append(li).append(xbRDS(_userByFollowingId, "userByFollowingId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_followingId));
        sb.append(dm).append(xfND(_followerId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userByFollowerId != null && _userByFollowerId.isPresent())
        { sb.append(dm).append("userByFollowerId"); }
        if (_userByFollowingId != null && _userByFollowingId.isPresent())
        { sb.append(dm).append("userByFollowingId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserFollowing clone() {
        return (UserFollowing)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] FOLLOWING_ID: {UQ+, NotNull, INT(10), FK to USER} <br>
     * ????ID
     * @return The value of the column 'FOLLOWING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFollowingId() {
        checkSpecifiedProperty("followingId");
        return _followingId;
    }

    /**
     * [set] FOLLOWING_ID: {UQ+, NotNull, INT(10), FK to USER} <br>
     * ????ID
     * @param followingId The value of the column 'FOLLOWING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFollowingId(Integer followingId) {
        registerModifiedProperty("followingId");
        _followingId = followingId;
    }

    /**
     * [get] FOLLOWER_ID: {+UQ, IX, NotNull, INT(10), FK to USER} <br>
     * ?????ID
     * @return The value of the column 'FOLLOWER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFollowerId() {
        checkSpecifiedProperty("followerId");
        return _followerId;
    }

    /**
     * [set] FOLLOWER_ID: {+UQ, IX, NotNull, INT(10), FK to USER} <br>
     * ?????ID
     * @param followerId The value of the column 'FOLLOWER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFollowerId(Integer followerId) {
        registerModifiedProperty("followerId");
        _followerId = followerId;
    }
}
