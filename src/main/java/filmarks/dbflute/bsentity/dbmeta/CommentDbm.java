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
 * The DB meta of COMMENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CommentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CommentDbm _instance = new CommentDbm();
    private CommentDbm() {}
    public static CommentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Comment)et).getCommentId(), (et, vl) -> ((Comment)et).setCommentId(cti(vl)), "commentId");
        setupEpg(_epgMap, et -> ((Comment)et).getUserId(), (et, vl) -> ((Comment)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((Comment)et).getAlbumId(), (et, vl) -> ((Comment)et).setAlbumId(cti(vl)), "albumId");
        setupEpg(_epgMap, et -> ((Comment)et).getContent(), (et, vl) -> ((Comment)et).setContent((String)vl), "content");
        setupEpg(_epgMap, et -> ((Comment)et).getRate(), (et, vl) -> ((Comment)et).setRate(ctb(vl)), "rate");
        setupEpg(_epgMap, et -> ((Comment)et).getCommentCreatedAt(), (et, vl) -> ((Comment)et).setCommentCreatedAt(ctldt(vl)), "commentCreatedAt");
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
        setupEfpg(_efpgMap, et -> ((Comment)et).getAlbum(), (et, vl) -> ((Comment)et).setAlbum((OptionalEntity<Album>)vl), "album");
        setupEfpg(_efpgMap, et -> ((Comment)et).getUser(), (et, vl) -> ((Comment)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "COMMENT";
    protected final String _tableDispName = "COMMENT";
    protected final String _tablePropertyName = "comment";
    protected final TableSqlName _tableSqlName = new TableSqlName("COMMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCommentId = cci("COMMENT_ID", "COMMENT_ID", null, null, Integer.class, "commentId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, "postList", null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Integer.class, "userId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnAlbumId = cci("ALBUM_ID", "ALBUM_ID", null, null, Integer.class, "albumId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "album", null, null, false);
    protected final ColumnInfo _columnContent = cci("CONTENT", "CONTENT", null, null, String.class, "content", null, false, false, true, "TEXT", 65535, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRate = cci("RATE", "RATE", null, null, java.math.BigDecimal.class, "rate", null, false, false, true, "FLOAT", 12, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCommentCreatedAt = cci("COMMENT_CREATED_AT", "COMMENT_CREATED_AT", null, null, java.time.LocalDateTime.class, "commentCreatedAt", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommentId() { return _columnCommentId; }
    /**
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlbumId() { return _columnAlbumId; }
    /**
     * CONTENT: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnContent() { return _columnContent; }
    /**
     * RATE: {NotNull, FLOAT(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRate() { return _columnRate; }
    /**
     * COMMENT_CREATED_AT: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommentCreatedAt() { return _columnCommentCreatedAt; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCommentId());
        ls.add(columnUserId());
        ls.add(columnAlbumId());
        ls.add(columnContent());
        ls.add(columnRate());
        ls.add(columnCommentCreatedAt());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCommentId()); }
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
        return cfi("FK_COMMENT_PRODUCT", "album", this, AlbumDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "commentList", false);
    }
    /**
     * USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_COMMENT_USER", "user", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "commentList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * POST by TARGET_ID, named 'postList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPostList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCommentId(), PostDbm.getInstance().columnTargetId());
        return cri("FK_POST_COMMENT", "postList", this, PostDbm.getInstance(), mp, false, "comment");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.Comment"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.CommentCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.CommentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Comment> getEntityType() { return Comment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Comment newEntity() { return new Comment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Comment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Comment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
