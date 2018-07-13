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
 * The entity of POST as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     POST_ID
 *
 * [column]
 *     POST_ID, TARGET_ID, TARGET_TYPE, USER_ID, CREATED_AT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     POST_ID
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
 *     user
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer postId = entity.getPostId();
 * Integer targetId = entity.getTargetId();
 * Integer targetType = entity.getTargetType();
 * Integer userId = entity.getUserId();
 * java.time.LocalDateTime createdAt = entity.getCreatedAt();
 * entity.setPostId(postId);
 * entity.setTargetId(targetId);
 * entity.setTargetType(targetType);
 * entity.setUserId(userId);
 * entity.setCreatedAt(createdAt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPost extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** POST_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _postId;

    /** TARGET_ID: {UQ+, NotNull, INT(10)} */
    protected Integer _targetId;

    /** TARGET_TYPE: {+UQ, NotNull, INT(10)} */
    protected Integer _targetType;

    /** USER_ID: {IX, NotNull, INT(10), FK to USER} */
    protected Integer _userId;

    /** CREATED_AT: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _createdAt;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "POST";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_postId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param targetId : UQ+, NotNull, INT(10). (NotNull)
     * @param targetType : +UQ, NotNull, INT(10). (NotNull)
     */
    public void uniqueBy(Integer targetId, Integer targetType) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("targetId");
        __uniqueDrivenProperties.addPropertyName("targetType");
        setTargetId(targetId);setTargetType(targetType);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my USER_ID, named 'user'. */
    protected OptionalEntity<User> _user;

    /**
     * [get] USER by my USER_ID, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my USER_ID, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<User> user) {
        _user = user;
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
        if (obj instanceof BsPost) {
            BsPost other = (BsPost)obj;
            if (!xSV(_postId, other._postId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _postId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_postId));
        sb.append(dm).append(xfND(_targetId));
        sb.append(dm).append(xfND(_targetType));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_createdAt));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Post clone() {
        return (Post)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] POST_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'POST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPostId() {
        checkSpecifiedProperty("postId");
        return _postId;
    }

    /**
     * [set] POST_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param postId The value of the column 'POST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPostId(Integer postId) {
        registerModifiedProperty("postId");
        _postId = postId;
    }

    /**
     * [get] TARGET_ID: {UQ+, NotNull, INT(10)} <br>
     * @return The value of the column 'TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getTargetId() {
        checkSpecifiedProperty("targetId");
        return _targetId;
    }

    /**
     * [set] TARGET_ID: {UQ+, NotNull, INT(10)} <br>
     * @param targetId The value of the column 'TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTargetId(Integer targetId) {
        registerModifiedProperty("targetId");
        _targetId = targetId;
    }

    /**
     * [get] TARGET_TYPE: {+UQ, NotNull, INT(10)} <br>
     * @return The value of the column 'TARGET_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getTargetType() {
        checkSpecifiedProperty("targetType");
        return _targetType;
    }

    /**
     * [set] TARGET_TYPE: {+UQ, NotNull, INT(10)} <br>
     * @param targetType The value of the column 'TARGET_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setTargetType(Integer targetType) {
        registerModifiedProperty("targetType");
        _targetType = targetType;
    }

    /**
     * [get] USER_ID: {IX, NotNull, INT(10), FK to USER} <br>
     * ????ID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, NotNull, INT(10), FK to USER} <br>
     * ????ID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] CREATED_AT: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'CREATED_AT'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedAt() {
        checkSpecifiedProperty("createdAt");
        return _createdAt;
    }

    /**
     * [set] CREATED_AT: {NotNull, DATETIME(19)} <br>
     * @param createdAt The value of the column 'CREATED_AT'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        registerModifiedProperty("createdAt");
        _createdAt = createdAt;
    }
}
