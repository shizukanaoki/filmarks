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
 * The DB meta of FAVORITE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FavoriteDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FavoriteDbm _instance = new FavoriteDbm();
    private FavoriteDbm() {}
    public static FavoriteDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Favorite)et).getFavoriteId(), (et, vl) -> ((Favorite)et).setFavoriteId(cti(vl)), "favoriteId");
        setupEpg(_epgMap, et -> ((Favorite)et).getUserId(), (et, vl) -> ((Favorite)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((Favorite)et).getAlbumId(), (et, vl) -> ((Favorite)et).setAlbumId(cti(vl)), "albumId");
        setupEpg(_epgMap, et -> ((Favorite)et).getFavoriteCreatedAt(), (et, vl) -> ((Favorite)et).setFavoriteCreatedAt(ctldt(vl)), "favoriteCreatedAt");
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
        setupEfpg(_efpgMap, et -> ((Favorite)et).getAlbum(), (et, vl) -> ((Favorite)et).setAlbum((OptionalEntity<Album>)vl), "album");
        setupEfpg(_efpgMap, et -> ((Favorite)et).getUser(), (et, vl) -> ((Favorite)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FAVORITE";
    protected final String _tableDispName = "FAVORITE";
    protected final String _tablePropertyName = "favorite";
    protected final TableSqlName _tableSqlName = new TableSqlName("FAVORITE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFavoriteId = cci("FAVORITE_ID", "FAVORITE_ID", null, null, Integer.class, "favoriteId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Integer.class, "userId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnAlbumId = cci("ALBUM_ID", "ALBUM_ID", null, null, Integer.class, "albumId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "album", null, null, false);
    protected final ColumnInfo _columnFavoriteCreatedAt = cci("FAVORITE_CREATED_AT", "FAVORITE_CREATED_AT", null, null, java.time.LocalDateTime.class, "favoriteCreatedAt", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFavoriteId() { return _columnFavoriteId; }
    /**
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlbumId() { return _columnAlbumId; }
    /**
     * FAVORITE_CREATED_AT: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFavoriteCreatedAt() { return _columnFavoriteCreatedAt; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFavoriteId());
        ls.add(columnUserId());
        ls.add(columnAlbumId());
        ls.add(columnFavoriteCreatedAt());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnFavoriteId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnUserId());
        ls.add(columnAlbumId());
        return hpcui(ls);
    }

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
        return cfi("FK_PICK_PRODUCT", "album", this, AlbumDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "favoriteList", false);
    }
    /**
     * USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_PICK_USER", "user", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "favoriteList", false);
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
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.Favorite"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.FavoriteCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.FavoriteBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Favorite> getEntityType() { return Favorite.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Favorite newEntity() { return new Favorite(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Favorite)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Favorite)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
