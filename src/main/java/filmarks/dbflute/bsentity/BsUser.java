package filmarks.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import filmarks.dbflute.allcommon.DBMetaInstanceHandler;
import filmarks.dbflute.exentity.*;

/**
 * The entity of USER as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     ID
 *
 * [column]
 *     ID, USERNAME, PASSWORD
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
 *     
 *
 * [referrer table]
 *     COMMENT, PICK, RELATIONSHIP
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     commentList, pickList, relationshipByFollowerIdList, relationshipByFollowingIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String username = entity.getUsername();
 * String password = entity.getPassword();
 * entity.setId(id);
 * entity.setUsername(username);
 * entity.setPassword(password);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity {

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

    /** USERNAME: {NotNull, VARCHAR(100)} */
    protected String _username;

    /** PASSWORD: {NotNull, VARCHAR(100)} */
    protected String _password;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "USER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** COMMENT by USER_ID, named 'commentList'. */
    protected List<Comment> _commentList;

    /**
     * [get] COMMENT by USER_ID, named 'commentList'.
     * @return The entity list of referrer property 'commentList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Comment> getCommentList() {
        if (_commentList == null) { _commentList = newReferrerList(); }
        return _commentList;
    }

    /**
     * [set] COMMENT by USER_ID, named 'commentList'.
     * @param commentList The entity list of referrer property 'commentList'. (NullAllowed)
     */
    public void setCommentList(List<Comment> commentList) {
        _commentList = commentList;
    }

    /** PICK by USER_ID, named 'pickList'. */
    protected List<Pick> _pickList;

    /**
     * [get] PICK by USER_ID, named 'pickList'.
     * @return The entity list of referrer property 'pickList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Pick> getPickList() {
        if (_pickList == null) { _pickList = newReferrerList(); }
        return _pickList;
    }

    /**
     * [set] PICK by USER_ID, named 'pickList'.
     * @param pickList The entity list of referrer property 'pickList'. (NullAllowed)
     */
    public void setPickList(List<Pick> pickList) {
        _pickList = pickList;
    }

    /** RELATIONSHIP by FOLLOWER_ID, named 'relationshipByFollowerIdList'. */
    protected List<Relationship> _relationshipByFollowerIdList;

    /**
     * [get] RELATIONSHIP by FOLLOWER_ID, named 'relationshipByFollowerIdList'.
     * @return The entity list of referrer property 'relationshipByFollowerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Relationship> getRelationshipByFollowerIdList() {
        if (_relationshipByFollowerIdList == null) { _relationshipByFollowerIdList = newReferrerList(); }
        return _relationshipByFollowerIdList;
    }

    /**
     * [set] RELATIONSHIP by FOLLOWER_ID, named 'relationshipByFollowerIdList'.
     * @param relationshipByFollowerIdList The entity list of referrer property 'relationshipByFollowerIdList'. (NullAllowed)
     */
    public void setRelationshipByFollowerIdList(List<Relationship> relationshipByFollowerIdList) {
        _relationshipByFollowerIdList = relationshipByFollowerIdList;
    }

    /** RELATIONSHIP by FOLLOWING_ID, named 'relationshipByFollowingIdList'. */
    protected List<Relationship> _relationshipByFollowingIdList;

    /**
     * [get] RELATIONSHIP by FOLLOWING_ID, named 'relationshipByFollowingIdList'.
     * @return The entity list of referrer property 'relationshipByFollowingIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Relationship> getRelationshipByFollowingIdList() {
        if (_relationshipByFollowingIdList == null) { _relationshipByFollowingIdList = newReferrerList(); }
        return _relationshipByFollowingIdList;
    }

    /**
     * [set] RELATIONSHIP by FOLLOWING_ID, named 'relationshipByFollowingIdList'.
     * @param relationshipByFollowingIdList The entity list of referrer property 'relationshipByFollowingIdList'. (NullAllowed)
     */
    public void setRelationshipByFollowingIdList(List<Relationship> relationshipByFollowingIdList) {
        _relationshipByFollowingIdList = relationshipByFollowingIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
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
        if (_commentList != null) { for (Comment et : _commentList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "commentList")); } } }
        if (_pickList != null) { for (Pick et : _pickList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pickList")); } } }
        if (_relationshipByFollowerIdList != null) { for (Relationship et : _relationshipByFollowerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "relationshipByFollowerIdList")); } } }
        if (_relationshipByFollowingIdList != null) { for (Relationship et : _relationshipByFollowingIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "relationshipByFollowingIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_username));
        sb.append(dm).append(xfND(_password));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_commentList != null && !_commentList.isEmpty())
        { sb.append(dm).append("commentList"); }
        if (_pickList != null && !_pickList.isEmpty())
        { sb.append(dm).append("pickList"); }
        if (_relationshipByFollowerIdList != null && !_relationshipByFollowerIdList.isEmpty())
        { sb.append(dm).append("relationshipByFollowerIdList"); }
        if (_relationshipByFollowingIdList != null && !_relationshipByFollowingIdList.isEmpty())
        { sb.append(dm).append("relationshipByFollowingIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public User clone() {
        return (User)super.clone();
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
     * [get] USERNAME: {NotNull, VARCHAR(100)} <br>
     * ??
     * @return The value of the column 'USERNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUsername() {
        checkSpecifiedProperty("username");
        return _username;
    }

    /**
     * [set] USERNAME: {NotNull, VARCHAR(100)} <br>
     * ??
     * @param username The value of the column 'USERNAME'. (basically NotNull if update: for the constraint)
     */
    public void setUsername(String username) {
        registerModifiedProperty("username");
        _username = username;
    }

    /**
     * [get] PASSWORD: {NotNull, VARCHAR(100)} <br>
     * ?????
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] PASSWORD: {NotNull, VARCHAR(100)} <br>
     * ?????
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }
}
