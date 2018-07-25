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
 * The DB meta of LYRICS_RECOMMENDATION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LyricsRecommendationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LyricsRecommendationDbm _instance = new LyricsRecommendationDbm();
    private LyricsRecommendationDbm() {}
    public static LyricsRecommendationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LyricsRecommendation)et).getId(), (et, vl) -> ((LyricsRecommendation)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((LyricsRecommendation)et).getUserId(), (et, vl) -> ((LyricsRecommendation)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((LyricsRecommendation)et).getSongId(), (et, vl) -> ((LyricsRecommendation)et).setSongId(cti(vl)), "songId");
        setupEpg(_epgMap, et -> ((LyricsRecommendation)et).getLyrics(), (et, vl) -> ((LyricsRecommendation)et).setLyrics((String)vl), "lyrics");
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
        setupEfpg(_efpgMap, et -> ((LyricsRecommendation)et).getSong(), (et, vl) -> ((LyricsRecommendation)et).setSong((OptionalEntity<Song>)vl), "song");
        setupEfpg(_efpgMap, et -> ((LyricsRecommendation)et).getUser(), (et, vl) -> ((LyricsRecommendation)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LYRICS_RECOMMENDATION";
    protected final String _tableDispName = "LYRICS_RECOMMENDATION";
    protected final String _tablePropertyName = "lyricsRecommendation";
    protected final TableSqlName _tableSqlName = new TableSqlName("LYRICS_RECOMMENDATION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Integer.class, "userId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnSongId = cci("SONG_ID", "SONG_ID", null, null, Integer.class, "songId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "song", null, null, false);
    protected final ColumnInfo _columnLyrics = cci("LYRICS", "LYRICS", null, null, String.class, "lyrics", null, false, false, true, "TEXT", 65535, 0, null, null, false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * SONG_ID: {IX, NotNull, INT(10), FK to SONG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSongId() { return _columnSongId; }
    /**
     * LYRICS: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLyrics() { return _columnLyrics; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnUserId());
        ls.add(columnSongId());
        ls.add(columnLyrics());
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

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * SONG by my SONG_ID, named 'song'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSong() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSongId(), SongDbm.getInstance().columnSongId());
        return cfi("FK_LYRICS_RECOMMENDATION_SONG", "song", this, SongDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lyricsRecommendationList", false);
    }
    /**
     * USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_LYRICS_RECOMMENDATION_USER", "user", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "lyricsRecommendationList", false);
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
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.LyricsRecommendation"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.LyricsRecommendationCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.LyricsRecommendationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LyricsRecommendation> getEntityType() { return LyricsRecommendation.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LyricsRecommendation newEntity() { return new LyricsRecommendation(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LyricsRecommendation)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LyricsRecommendation)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
