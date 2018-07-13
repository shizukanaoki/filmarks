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
 *     ARTIST_ID
 *
 * [column]
 *     ARTIST_ID, ARTIST_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ARTIST_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     ALBUM
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     albumList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer artistId = entity.getArtistId();
 * String artistName = entity.getArtistName();
 * entity.setArtistId(artistId);
 * entity.setArtistName(artistName);
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
    /** ARTIST_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _artistId;

    /** ARTIST_NAME: {UQ, NotNull, VARCHAR(100)} */
    protected String _artistName;

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
        if (_artistId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param artistName : UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(String artistName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("artistName");
        setArtistName(artistName);
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
            if (!xSV(_artistId, other._artistId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _artistId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_albumList != null) { for (Album et : _albumList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "albumList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_artistId));
        sb.append(dm).append(xfND(_artistName));
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
     * [get] ARTIST_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'ARTIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getArtistId() {
        checkSpecifiedProperty("artistId");
        return _artistId;
    }

    /**
     * [set] ARTIST_ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param artistId The value of the column 'ARTIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setArtistId(Integer artistId) {
        registerModifiedProperty("artistId");
        _artistId = artistId;
    }

    /**
     * [get] ARTIST_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * ??
     * @return The value of the column 'ARTIST_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getArtistName() {
        checkSpecifiedProperty("artistName");
        return _artistName;
    }

    /**
     * [set] ARTIST_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * ??
     * @param artistName The value of the column 'ARTIST_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setArtistName(String artistName) {
        registerModifiedProperty("artistName");
        _artistName = artistName;
    }
}
