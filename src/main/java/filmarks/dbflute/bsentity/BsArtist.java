package filmarks.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import filmarks.dbflute.allcommon.DBMetaInstanceHandler;
import filmarks.dbflute.exentity.*;

/**
 * The entity of ARTIST as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     ID
 *
 * [column]
 *     ID, NAME
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
 *     ALBUM, SONG
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     albumList, songList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String name = entity.getName();
 * entity.setId(id);
 * entity.setName(name);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsArtist extends AbstractEntity implements DomainEntity {

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
        return "ARTIST";
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
    /** ALBUM by ARTIST_ID, named 'albumList'. */
    protected List<Album> _albumList;

    /**
     * [get] ALBUM by ARTIST_ID, named 'albumList'.
     * @return The entity list of referrer property 'albumList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Album> getAlbumList() {
        if (_albumList == null) { _albumList = newReferrerList(); }
        return _albumList;
    }

    /**
     * [set] ALBUM by ARTIST_ID, named 'albumList'.
     * @param albumList The entity list of referrer property 'albumList'. (NullAllowed)
     */
    public void setAlbumList(List<Album> albumList) {
        _albumList = albumList;
    }

    /** SONG by ARTIST_ID, named 'songList'. */
    protected List<Song> _songList;

    /**
     * [get] SONG by ARTIST_ID, named 'songList'.
     * @return The entity list of referrer property 'songList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Song> getSongList() {
        if (_songList == null) { _songList = newReferrerList(); }
        return _songList;
    }

    /**
     * [set] SONG by ARTIST_ID, named 'songList'.
     * @param songList The entity list of referrer property 'songList'. (NullAllowed)
     */
    public void setSongList(List<Song> songList) {
        _songList = songList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsArtist) {
            BsArtist other = (BsArtist)obj;
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
        if (_albumList != null) { for (Album et : _albumList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "albumList")); } } }
        if (_songList != null) { for (Song et : _songList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "songList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
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
        if (_albumList != null && !_albumList.isEmpty())
        { sb.append(dm).append("albumList"); }
        if (_songList != null && !_songList.isEmpty())
        { sb.append(dm).append("songList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Artist clone() {
        return (Artist)super.clone();
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
