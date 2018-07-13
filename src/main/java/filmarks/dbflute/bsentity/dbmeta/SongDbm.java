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
 * The DB meta of SONG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SongDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SongDbm _instance = new SongDbm();
    private SongDbm() {}
    public static SongDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Song)et).getSongId(), (et, vl) -> ((Song)et).setSongId(cti(vl)), "songId");
        setupEpg(_epgMap, et -> ((Song)et).getAlbumId(), (et, vl) -> ((Song)et).setAlbumId(cti(vl)), "albumId");
        setupEpg(_epgMap, et -> ((Song)et).getSongTitle(), (et, vl) -> ((Song)et).setSongTitle((String)vl), "songTitle");
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
        setupEfpg(_efpgMap, et -> ((Song)et).getAlbum(), (et, vl) -> ((Song)et).setAlbum((OptionalEntity<Album>)vl), "album");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SONG";
    protected final String _tableDispName = "SONG";
    protected final String _tablePropertyName = "song";
    protected final TableSqlName _tableSqlName = new TableSqlName("SONG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSongId = cci("SONG_ID", "SONG_ID", null, null, Integer.class, "songId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlbumId = cci("ALBUM_ID", "ALBUM_ID", null, null, Integer.class, "albumId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "album", null, null, false);
    protected final ColumnInfo _columnSongTitle = cci("SONG_TITLE", "SONG_TITLE", null, null, String.class, "songTitle", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSongId() { return _columnSongId; }
    /**
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlbumId() { return _columnAlbumId; }
    /**
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSongTitle() { return _columnSongTitle; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSongId());
        ls.add(columnAlbumId());
        ls.add(columnSongTitle());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSongId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * ALBUM by my ALBUM_ID, named 'album'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAlbum() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAlbumId(), AlbumDbm.getInstance().columnAlbumId());
        return cfi("FK_SONG_PRODUCT", "album", this, AlbumDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "songList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.Song"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.SongCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.SongBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Song> getEntityType() { return Song.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Song newEntity() { return new Song(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Song)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Song)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
