package filmarks.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import filmarks.dbflute.allcommon.*;
import filmarks.dbflute.exentity.*;

/**
 * The DB meta of ALBUM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AlbumDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AlbumDbm _instance = new AlbumDbm();
    private AlbumDbm() {}
    public static AlbumDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Album)et).getId(), (et, vl) -> ((Album)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Album)et).getTitle(), (et, vl) -> ((Album)et).setTitle((String)vl), "title");
        setupEpg(_epgMap, et -> ((Album)et).getFileName(), (et, vl) -> ((Album)et).setFileName((String)vl), "fileName");
        setupEpg(_epgMap, et -> ((Album)et).getArtistId(), (et, vl) -> ((Album)et).setArtistId(cti(vl)), "artistId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Album)et).getArtist(), (et, vl) -> ((Album)et).setArtist((OptionalEntity<Artist>)vl), "artist");
        setupEfpg(_efpgMap, et -> ((Album)et).getSongAsOne(), (et, vl) -> ((Album)et).setSongAsOne((OptionalEntity<Song>)vl), "songAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ALBUM";
    protected final String _tableDispName = "ALBUM";
    protected final String _tablePropertyName = "album";
    protected final TableSqlName _tableSqlName = new TableSqlName("ALBUM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, "commentList,pickList", null, false);
    protected final ColumnInfo _columnTitle = cci("TITLE", "TITLE", null, null, String.class, "title", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFileName = cci("FILE_NAME", "FILE_NAME", null, null, String.class, "fileName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArtistId = cci("ARTIST_ID", "ARTIST_ID", null, null, Integer.class, "artistId", null, false, false, false, "INT", 10, 0, null, null, false, null, null, "artist", null, null, false);

    /**
     * ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTitle() { return _columnTitle; }
    /**
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFileName() { return _columnFileName; }
    /**
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArtistId() { return _columnArtistId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnTitle());
        ls.add(columnFileName());
        ls.add(columnArtistId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnTitle()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * ARTIST by my ARTIST_ID, named 'artist'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignArtist() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnArtistId(), ArtistDbm.getInstance().columnId());
        return cfi("FK_PRODUCT_ARTIST", "artist", this, ArtistDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "albumList", false);
    }
    /**
     * SONG by ID, named 'songAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignSongAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), SongDbm.getInstance().columnId());
        return cfi("FK_SONG_PRODUCT", "songAsOne", this, SongDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "album", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * COMMENT by ALBUM_ID, named 'commentList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCommentList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), CommentDbm.getInstance().columnAlbumId());
        return cri("FK_COMMENT_PRODUCT", "commentList", this, CommentDbm.getInstance(), mp, false, "album");
    }
    /**
     * PICK by PRODUCT_ID, named 'pickList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPickList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), PickDbm.getInstance().columnProductId());
        return cri("FK_PICK_PRODUCT", "pickList", this, PickDbm.getInstance(), mp, false, "album");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.Album"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.AlbumCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.AlbumBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Album> getEntityType() { return Album.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Album newEntity() { return new Album(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Album)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Album)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
