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
 *     ALBUM_ID
 *
 * [column]
 *     ALBUM_ID, ARTIST_ID, NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ARTIST, ALBUM
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     artist, album
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer albumId = entity.getAlbumId();
 * Integer artistId = entity.getArtistId();
 * String name = entity.getName();
 * entity.setAlbumId(albumId);
 * entity.setArtistId(artistId);
 * entity.setName(name);
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
    /** ALBUM_ID: {PK, NotNull, INT(10), FK to ALBUM} */
    protected Integer _albumId;

    /** ARTIST_ID: {IX, NotNull, INT(10), FK to ARTIST} */
    protected Integer _artistId;

    /** NAME: {NotNull, VARCHAR(100)} */
    protected String _name;

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
        if (_albumId == null) { return false; }
        return true;
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
        sb.append(dm).append(xfND(_albumId));
        sb.append(dm).append(xfND(_artistId));
        sb.append(dm).append(xfND(_name));
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
     * [get] ALBUM_ID: {PK, NotNull, INT(10), FK to ALBUM} <br>
     * ID
     * @return The value of the column 'ALBUM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAlbumId() {
        checkSpecifiedProperty("albumId");
        return _albumId;
    }

    /**
     * [set] ALBUM_ID: {PK, NotNull, INT(10), FK to ALBUM} <br>
     * ID
     * @param albumId The value of the column 'ALBUM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAlbumId(Integer albumId) {
        registerModifiedProperty("albumId");
        _albumId = albumId;
    }

    /**
     * [get] ARTIST_ID: {IX, NotNull, INT(10), FK to ARTIST} <br>
     * ??????ID
     * @return The value of the column 'ARTIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getArtistId() {
        checkSpecifiedProperty("artistId");
        return _artistId;
    }

    /**
     * [set] ARTIST_ID: {IX, NotNull, INT(10), FK to ARTIST} <br>
     * ??????ID
     * @param artistId The value of the column 'ARTIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setArtistId(Integer artistId) {
        registerModifiedProperty("artistId");
        _artistId = artistId;
    }

    /**
     * [get] NAME: {NotNull, VARCHAR(100)} <br>
     * ??
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {NotNull, VARCHAR(100)} <br>
     * ??
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }
}
