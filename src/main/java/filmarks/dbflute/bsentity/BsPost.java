package filmarks.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
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
 *     POST_ID, TARGET_ID, TARGET_TYPE, USER_ID
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
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
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
 * entity.setPostId(postId);
 * entity.setTargetId(targetId);
 * entity.setTargetType(targetType);
 * entity.setUserId(userId);
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

    /** TARGET_ID: {NotNull, INT(10)} */
    protected Integer _targetId;

    /** TARGET_TYPE: {NotNull, INT(10)} */
    protected Integer _targetType;

    /** USER_ID: {NotNull, INT(10)} */
    protected Integer _userId;

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

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_postId));
        sb.append(dm).append(xfND(_targetId));
        sb.append(dm).append(xfND(_targetType));
        sb.append(dm).append(xfND(_userId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
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
     * [get] TARGET_ID: {NotNull, INT(10)} <br>
     * @return The value of the column 'TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getTargetId() {
        checkSpecifiedProperty("targetId");
        return _targetId;
    }

    /**
     * [set] TARGET_ID: {NotNull, INT(10)} <br>
     * @param targetId The value of the column 'TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTargetId(Integer targetId) {
        registerModifiedProperty("targetId");
        _targetId = targetId;
    }

    /**
     * [get] TARGET_TYPE: {NotNull, INT(10)} <br>
     * @return The value of the column 'TARGET_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getTargetType() {
        checkSpecifiedProperty("targetType");
        return _targetType;
    }

    /**
     * [set] TARGET_TYPE: {NotNull, INT(10)} <br>
     * @param targetType The value of the column 'TARGET_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setTargetType(Integer targetType) {
        registerModifiedProperty("targetType");
        _targetType = targetType;
    }

    /**
     * [get] USER_ID: {NotNull, INT(10)} <br>
     * ????ID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {NotNull, INT(10)} <br>
     * ????ID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }
}
