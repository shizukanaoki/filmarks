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
 * The entity of FAVORITE as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     FAVORITE_ID
 *
 * [column]
 *     FAVORITE_ID, USER_ID, ALBUM_ID, FAVORITE_CREATED_AT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FAVORITE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ALBUM, USER
 *
 * [referrer table]
 *     POST
 *
 * [foreign property]
 *     album, user
 *
 * [referrer property]
 *     postList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer favoriteId = entity.getFavoriteId();
 * Integer userId = entity.getUserId();
 * Integer albumId = entity.getAlbumId();
 * java.time.LocalDateTime favoriteCreatedAt = entity.getFavoriteCreatedAt();
 * entity.setFavoriteId(favoriteId);
 * entity.setUserId(userId);
 * entity.setAlbumId(albumId);
 * entity.setFavoriteCreatedAt(favoriteCreatedAt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsFavorite extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FAVORITE_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _favoriteId;

    /** USER_ID: {UQ+, NotNull, INT(10), FK to USER} */
    protected Integer _userId;

    /** ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM} */
    protected Integer _albumId;

    /** FAVORITE_CREATED_AT: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _favoriteCreatedAt;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "FAVORITE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_favoriteId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param userId : UQ+, NotNull, INT(10), FK to USER. (NotNull)
     * @param albumId : +UQ, IX, NotNull, INT(10), FK to ALBUM. (NotNull)
     */
    public void uniqueBy(Integer userId, Integer albumId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("userId");
        __uniqueDrivenProperties.addPropertyName("albumId");
        setUserId(userId);setAlbumId(albumId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ALBUM by my ALBUM_ID, named 'album'. */
    protected OptionalEntity<Album> _album;

    /**
     * [get] ALBUM by my ALBUM_ID, named 'album'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'album'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Album> getAlbum() {
        if (_album == null) { _album = OptionalEntity.relationEmpty(this, "album"); }
        return _album;
    }

    /**
     * [set] ALBUM by my ALBUM_ID, named 'album'.
     * @param album The entity of foreign property 'album'. (NullAllowed)
     */
    public void setAlbum(OptionalEntity<Album> album) {
        _album = album;
    }

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
    /** POST by TARGET_ID, named 'postList'. */
    protected List<Post> _postList;

    /**
     * [get] POST by TARGET_ID, named 'postList'.
     * @return The entity list of referrer property 'postList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Post> getPostList() {
        if (_postList == null) { _postList = newReferrerList(); }
        return _postList;
    }

    /**
     * [set] POST by TARGET_ID, named 'postList'.
     * @param postList The entity list of referrer property 'postList'. (NullAllowed)
     */
    public void setPostList(List<Post> postList) {
        _postList = postList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsFavorite) {
            BsFavorite other = (BsFavorite)obj;
            if (!xSV(_favoriteId, other._favoriteId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _favoriteId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_album != null && _album.isPresent())
        { sb.append(li).append(xbRDS(_album, "album")); }
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        if (_postList != null) { for (Post et : _postList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "postList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_favoriteId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_albumId));
        sb.append(dm).append(xfND(_favoriteCreatedAt));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_album != null && _album.isPresent())
        { sb.append(dm).append("album"); }
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (_postList != null && !_postList.isEmpty())
        { sb.append(dm).append("postList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Favorite clone() {
        return (Favorite)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FAVORITE_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'FAVORITE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFavoriteId() {
        checkSpecifiedProperty("favoriteId");
        return _favoriteId;
    }

    /**
     * [set] FAVORITE_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param favoriteId The value of the column 'FAVORITE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFavoriteId(Integer favoriteId) {
        registerModifiedProperty("favoriteId");
        _favoriteId = favoriteId;
    }

    /**
     * [get] USER_ID: {UQ+, NotNull, INT(10), FK to USER} <br>
     * ????ID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {UQ+, NotNull, INT(10), FK to USER} <br>
     * ????ID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM} <br>
     * ????ID
     * @return The value of the column 'ALBUM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAlbumId() {
        checkSpecifiedProperty("albumId");
        return _albumId;
    }

    /**
     * [set] ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM} <br>
     * ????ID
     * @param albumId The value of the column 'ALBUM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAlbumId(Integer albumId) {
        registerModifiedProperty("albumId");
        _albumId = albumId;
    }

    /**
     * [get] FAVORITE_CREATED_AT: {NotNull, DATETIME(19)} <br>
     * ??
     * @return The value of the column 'FAVORITE_CREATED_AT'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getFavoriteCreatedAt() {
        checkSpecifiedProperty("favoriteCreatedAt");
        return _favoriteCreatedAt;
    }

    /**
     * [set] FAVORITE_CREATED_AT: {NotNull, DATETIME(19)} <br>
     * ??
     * @param favoriteCreatedAt The value of the column 'FAVORITE_CREATED_AT'. (basically NotNull if update: for the constraint)
     */
    public void setFavoriteCreatedAt(java.time.LocalDateTime favoriteCreatedAt) {
        registerModifiedProperty("favoriteCreatedAt");
        _favoriteCreatedAt = favoriteCreatedAt;
    }
}
