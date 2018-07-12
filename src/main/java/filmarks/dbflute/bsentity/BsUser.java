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
 *     USER_ID
 *
 * [column]
 *     USER_ID, USERNAME, PASSWORD
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     COMMENT, FAVORITE, USER_FOLLOWING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     commentList, favoriteList, userFollowingByFollowerIdList, userFollowingByFollowingIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String username = entity.getUsername();
 * String password = entity.getPassword();
 * entity.setUserId(userId);
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
    /** USER_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _userId;

    /** USERNAME: {UQ, NotNull, VARCHAR(100)} */
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
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param username : UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(String username) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("username");
        setUsername(username);
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

    /** FAVORITE by USER_ID, named 'favoriteList'. */
    protected List<Favorite> _favoriteList;

    /**
     * [get] FAVORITE by USER_ID, named 'favoriteList'.
     * @return The entity list of referrer property 'favoriteList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Favorite> getFavoriteList() {
        if (_favoriteList == null) { _favoriteList = newReferrerList(); }
        return _favoriteList;
    }

    /**
     * [set] FAVORITE by USER_ID, named 'favoriteList'.
     * @param favoriteList The entity list of referrer property 'favoriteList'. (NullAllowed)
     */
    public void setFavoriteList(List<Favorite> favoriteList) {
        _favoriteList = favoriteList;
    }

    /** USER_FOLLOWING by FOLLOWER_ID, named 'userFollowingByFollowerIdList'. */
    protected List<UserFollowing> _userFollowingByFollowerIdList;

    /**
     * [get] USER_FOLLOWING by FOLLOWER_ID, named 'userFollowingByFollowerIdList'.
     * @return The entity list of referrer property 'userFollowingByFollowerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserFollowing> getUserFollowingByFollowerIdList() {
        if (_userFollowingByFollowerIdList == null) { _userFollowingByFollowerIdList = newReferrerList(); }
        return _userFollowingByFollowerIdList;
    }

    /**
     * [set] USER_FOLLOWING by FOLLOWER_ID, named 'userFollowingByFollowerIdList'.
     * @param userFollowingByFollowerIdList The entity list of referrer property 'userFollowingByFollowerIdList'. (NullAllowed)
     */
    public void setUserFollowingByFollowerIdList(List<UserFollowing> userFollowingByFollowerIdList) {
        _userFollowingByFollowerIdList = userFollowingByFollowerIdList;
    }

    /** USER_FOLLOWING by FOLLOWING_ID, named 'userFollowingByFollowingIdList'. */
    protected List<UserFollowing> _userFollowingByFollowingIdList;

    /**
     * [get] USER_FOLLOWING by FOLLOWING_ID, named 'userFollowingByFollowingIdList'.
     * @return The entity list of referrer property 'userFollowingByFollowingIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserFollowing> getUserFollowingByFollowingIdList() {
        if (_userFollowingByFollowingIdList == null) { _userFollowingByFollowingIdList = newReferrerList(); }
        return _userFollowingByFollowingIdList;
    }

    /**
     * [set] USER_FOLLOWING by FOLLOWING_ID, named 'userFollowingByFollowingIdList'.
     * @param userFollowingByFollowingIdList The entity list of referrer property 'userFollowingByFollowingIdList'. (NullAllowed)
     */
    public void setUserFollowingByFollowingIdList(List<UserFollowing> userFollowingByFollowingIdList) {
        _userFollowingByFollowingIdList = userFollowingByFollowingIdList;
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
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_commentList != null) { for (Comment et : _commentList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "commentList")); } } }
        if (_favoriteList != null) { for (Favorite et : _favoriteList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "favoriteList")); } } }
        if (_userFollowingByFollowerIdList != null) { for (UserFollowing et : _userFollowingByFollowerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userFollowingByFollowerIdList")); } } }
        if (_userFollowingByFollowingIdList != null) { for (UserFollowing et : _userFollowingByFollowingIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userFollowingByFollowingIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
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
        if (_favoriteList != null && !_favoriteList.isEmpty())
        { sb.append(dm).append("favoriteList"); }
        if (_userFollowingByFollowerIdList != null && !_userFollowingByFollowerIdList.isEmpty())
        { sb.append(dm).append("userFollowingByFollowerIdList"); }
        if (_userFollowingByFollowingIdList != null && !_userFollowingByFollowingIdList.isEmpty())
        { sb.append(dm).append("userFollowingByFollowingIdList"); }
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
     * [get] USER_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] USERNAME: {UQ, NotNull, VARCHAR(100)} <br>
     * ??
     * @return The value of the column 'USERNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUsername() {
        checkSpecifiedProperty("username");
        return _username;
    }

    /**
     * [set] USERNAME: {UQ, NotNull, VARCHAR(100)} <br>
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
