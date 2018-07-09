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
 * The entity of ALBUM as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     ALBUM_ID
 *
 * [column]
 *     ALBUM_ID, TITLE, FILE_NAME, ARTIST_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALBUM_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ARTIST, SONG(AsOne)
 *
 * [referrer table]
 *     COMMENT, FAVORITE, SONG
 *
 * [foreign property]
 *     artist, songAsOne
 *
 * [referrer property]
 *     commentList, favoriteList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer albumId = entity.getAlbumId();
 * String title = entity.getTitle();
 * String fileName = entity.getFileName();
 * Integer artistId = entity.getArtistId();
 * entity.setAlbumId(albumId);
 * entity.setTitle(title);
 * entity.setFileName(fileName);
 * entity.setArtistId(artistId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAlbum extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ALBUM_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _albumId;

    /** TITLE: {UQ, NotNull, VARCHAR(100)} */
    protected String _title;

    /** FILE_NAME: {NotNull, VARCHAR(200)} */
    protected String _fileName;

    /** ARTIST_ID: {IX, INT(10), FK to ARTIST} */
    protected Integer _artistId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ALBUM";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_albumId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param title : UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(String title) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("title");
        setTitle(title);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ARTIST by my ARTIST_ID, named 'artist'. */
    protected OptionalEntity<Artist> _artist;

    /**
     * [get] ARTIST by my ARTIST_ID, named 'artist'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'artist'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Artist> getArtist() {
        if (_artist == null) { _artist = OptionalEntity.relationEmpty(this, "artist"); }
        return _artist;
    }

    /**
     * [set] ARTIST by my ARTIST_ID, named 'artist'.
     * @param artist The entity of foreign property 'artist'. (NullAllowed)
     */
    public void setArtist(OptionalEntity<Artist> artist) {
        _artist = artist;
    }

    /** SONG by ALBUM_ID, named 'songAsOne'. */
    protected OptionalEntity<Song> _songAsOne;

    /**
     * [get] SONG by ALBUM_ID, named 'songAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'songAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<Song> getSongAsOne() {
        if (_songAsOne == null) { _songAsOne = OptionalEntity.relationEmpty(this, "songAsOne"); }
        return _songAsOne;
    }

    /**
     * [set] SONG by ALBUM_ID, named 'songAsOne'.
     * @param songAsOne The entity of foreign property(referrer-as-one) 'songAsOne'. (NullAllowed)
     */
    public void setSongAsOne(OptionalEntity<Song> songAsOne) {
        _songAsOne = songAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** COMMENT by ALBUM_ID, named 'commentList'. */
    protected List<Comment> _commentList;

    /**
     * [get] COMMENT by ALBUM_ID, named 'commentList'.
     * @return The entity list of referrer property 'commentList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Comment> getCommentList() {
        if (_commentList == null) { _commentList = newReferrerList(); }
        return _commentList;
    }

    /**
     * [set] COMMENT by ALBUM_ID, named 'commentList'.
     * @param commentList The entity list of referrer property 'commentList'. (NullAllowed)
     */
    public void setCommentList(List<Comment> commentList) {
        _commentList = commentList;
    }

    /** FAVORITE by ALBUM_ID, named 'favoriteList'. */
    protected List<Favorite> _favoriteList;

    /**
     * [get] FAVORITE by ALBUM_ID, named 'favoriteList'.
     * @return The entity list of referrer property 'favoriteList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Favorite> getFavoriteList() {
        if (_favoriteList == null) { _favoriteList = newReferrerList(); }
        return _favoriteList;
    }

    /**
     * [set] FAVORITE by ALBUM_ID, named 'favoriteList'.
     * @param favoriteList The entity list of referrer property 'favoriteList'. (NullAllowed)
     */
    public void setFavoriteList(List<Favorite> favoriteList) {
        _favoriteList = favoriteList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAlbum) {
            BsAlbum other = (BsAlbum)obj;
            if (!xSV(_albumId, other._albumId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _albumId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_artist != null && _artist.isPresent())
        { sb.append(li).append(xbRDS(_artist, "artist")); }
        if (_songAsOne != null && _songAsOne.isPresent())
        { sb.append(li).append(xbRDS(_songAsOne, "songAsOne")); }
        if (_commentList != null) { for (Comment et : _commentList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "commentList")); } } }
        if (_favoriteList != null) { for (Favorite et : _favoriteList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "favoriteList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_albumId));
        sb.append(dm).append(xfND(_title));
        sb.append(dm).append(xfND(_fileName));
        sb.append(dm).append(xfND(_artistId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_artist != null && _artist.isPresent())
        { sb.append(dm).append("artist"); }
        if (_songAsOne != null && _songAsOne.isPresent())
        { sb.append(dm).append("songAsOne"); }
        if (_commentList != null && !_commentList.isEmpty())
        { sb.append(dm).append("commentList"); }
        if (_favoriteList != null && !_favoriteList.isEmpty())
        { sb.append(dm).append("favoriteList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Album clone() {
        return (Album)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ALBUM_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'ALBUM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAlbumId() {
        checkSpecifiedProperty("albumId");
        return _albumId;
    }

    /**
     * [set] ALBUM_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param albumId The value of the column 'ALBUM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAlbumId(Integer albumId) {
        registerModifiedProperty("albumId");
        _albumId = albumId;
    }

    /**
     * [get] TITLE: {UQ, NotNull, VARCHAR(100)} <br>
     * ????
     * @return The value of the column 'TITLE'. (basically NotNull if selected: for the constraint)
     */
    public String getTitle() {
        checkSpecifiedProperty("title");
        return _title;
    }

    /**
     * [set] TITLE: {UQ, NotNull, VARCHAR(100)} <br>
     * ????
     * @param title The value of the column 'TITLE'. (basically NotNull if update: for the constraint)
     */
    public void setTitle(String title) {
        registerModifiedProperty("title");
        _title = title;
    }

    /**
     * [get] FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * ?????
     * @return The value of the column 'FILE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getFileName() {
        checkSpecifiedProperty("fileName");
        return _fileName;
    }

    /**
     * [set] FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * ?????
     * @param fileName The value of the column 'FILE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setFileName(String fileName) {
        registerModifiedProperty("fileName");
        _fileName = fileName;
    }

    /**
     * [get] ARTIST_ID: {IX, INT(10), FK to ARTIST} <br>
     * ??????ID
     * @return The value of the column 'ARTIST_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getArtistId() {
        checkSpecifiedProperty("artistId");
        return _artistId;
    }

    /**
     * [set] ARTIST_ID: {IX, INT(10), FK to ARTIST} <br>
     * ??????ID
     * @param artistId The value of the column 'ARTIST_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArtistId(Integer artistId) {
        registerModifiedProperty("artistId");
        _artistId = artistId;
    }
}
