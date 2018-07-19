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
 * The entity of SONG as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     SONG_ID
 *
 * [column]
 *     SONG_ID, ALBUM_ID, SONG_TITLE, SONG_LYRICS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SONG_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ALBUM
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     album
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer songId = entity.getSongId();
 * Integer albumId = entity.getAlbumId();
 * String songTitle = entity.getSongTitle();
 * String songLyrics = entity.getSongLyrics();
 * entity.setSongId(songId);
 * entity.setAlbumId(albumId);
 * entity.setSongTitle(songTitle);
 * entity.setSongLyrics(songLyrics);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSong extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SONG_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _songId;

    /** ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM} */
    protected Integer _albumId;

    /** SONG_TITLE: {NotNull, VARCHAR(200)} */
    protected String _songTitle;

    /** SONG_LYRICS: {TEXT(65535)} */
    protected String _songLyrics;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SONG";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_songId == null) { return false; }
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
        if (obj instanceof BsSong) {
            BsSong other = (BsSong)obj;
            if (!xSV(_songId, other._songId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _songId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_album != null && _album.isPresent())
        { sb.append(li).append(xbRDS(_album, "album")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_songId));
        sb.append(dm).append(xfND(_albumId));
        sb.append(dm).append(xfND(_songTitle));
        sb.append(dm).append(xfND(_songLyrics));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Song clone() {
        return (Song)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SONG_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'SONG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSongId() {
        checkSpecifiedProperty("songId");
        return _songId;
    }

    /**
     * [set] SONG_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param songId The value of the column 'SONG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSongId(Integer songId) {
        registerModifiedProperty("songId");
        _songId = songId;
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
     * [get] SONG_TITLE: {NotNull, VARCHAR(200)} <br>
     * ??
     * @return The value of the column 'SONG_TITLE'. (basically NotNull if selected: for the constraint)
     */
    public String getSongTitle() {
        checkSpecifiedProperty("songTitle");
        return _songTitle;
    }

    /**
     * [set] SONG_TITLE: {NotNull, VARCHAR(200)} <br>
     * ??
     * @param songTitle The value of the column 'SONG_TITLE'. (basically NotNull if update: for the constraint)
     */
    public void setSongTitle(String songTitle) {
        registerModifiedProperty("songTitle");
        _songTitle = songTitle;
    }

    /**
     * [get] SONG_LYRICS: {TEXT(65535)} <br>
     * @return The value of the column 'SONG_LYRICS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSongLyrics() {
        checkSpecifiedProperty("songLyrics");
        return _songLyrics;
    }

    /**
     * [set] SONG_LYRICS: {TEXT(65535)} <br>
     * @param songLyrics The value of the column 'SONG_LYRICS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSongLyrics(String songLyrics) {
        registerModifiedProperty("songLyrics");
        _songLyrics = songLyrics;
    }
}
