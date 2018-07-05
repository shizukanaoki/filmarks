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
 * The entity of COMMENT as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     ID
 *
 * [column]
 *     ID, USER_ID, ALBUM_ID, CONTENT, RATE
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
 *     ALBUM, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     album, user
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * Integer userId = entity.getUserId();
 * Integer albumId = entity.getAlbumId();
 * String content = entity.getContent();
 * java.math.BigDecimal rate = entity.getRate();
 * entity.setId(id);
 * entity.setUserId(userId);
 * entity.setAlbumId(albumId);
 * entity.setContent(content);
 * entity.setRate(rate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsComment extends AbstractEntity implements DomainEntity {

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

    /** USER_ID: {IX, NotNull, INT(10), FK to USER} */
    protected Integer _userId;

    /** ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM} */
    protected Integer _albumId;

    /** CONTENT: {NotNull, TEXT(65535)} */
    protected String _content;

    /** RATE: {NotNull, FLOAT(12)} */
    protected java.math.BigDecimal _rate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "COMMENT";
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsComment) {
            BsComment other = (BsComment)obj;
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
        if (_album != null && _album.isPresent())
        { sb.append(li).append(xbRDS(_album, "album")); }
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
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_albumId));
        sb.append(dm).append(xfND(_content));
        sb.append(dm).append(xfND(_rate));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Comment clone() {
        return (Comment)super.clone();
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
     * [get] ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM} <br>
     * ????ID
     * @return The value of the column 'ALBUM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAlbumId() {
        checkSpecifiedProperty("albumId");
        return _albumId;
    }

    /**
     * [set] ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM} <br>
     * ????ID
     * @param albumId The value of the column 'ALBUM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAlbumId(Integer albumId) {
        registerModifiedProperty("albumId");
        _albumId = albumId;
    }

    /**
     * [get] CONTENT: {NotNull, TEXT(65535)} <br>
     * ??
     * @return The value of the column 'CONTENT'. (basically NotNull if selected: for the constraint)
     */
    public String getContent() {
        checkSpecifiedProperty("content");
        return _content;
    }

    /**
     * [set] CONTENT: {NotNull, TEXT(65535)} <br>
     * ??
     * @param content The value of the column 'CONTENT'. (basically NotNull if update: for the constraint)
     */
    public void setContent(String content) {
        registerModifiedProperty("content");
        _content = content;
    }

    /**
     * [get] RATE: {NotNull, FLOAT(12)} <br>
     * ???
     * @return The value of the column 'RATE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRate() {
        checkSpecifiedProperty("rate");
        return _rate;
    }

    /**
     * [set] RATE: {NotNull, FLOAT(12)} <br>
     * ???
     * @param rate The value of the column 'RATE'. (basically NotNull if update: for the constraint)
     */
    public void setRate(java.math.BigDecimal rate) {
        registerModifiedProperty("rate");
        _rate = rate;
    }
}
