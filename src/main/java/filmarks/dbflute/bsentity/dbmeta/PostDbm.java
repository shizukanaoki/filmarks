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
 * The DB meta of POST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PostDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PostDbm _instance = new PostDbm();
    private PostDbm() {}
    public static PostDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Post)et).getPostId(), (et, vl) -> ((Post)et).setPostId(cti(vl)), "postId");
        setupEpg(_epgMap, et -> ((Post)et).getTargetId(), (et, vl) -> ((Post)et).setTargetId(cti(vl)), "targetId");
        setupEpg(_epgMap, et -> ((Post)et).getTargetType(), (et, vl) -> ((Post)et).setTargetType((String)vl), "targetType");
        setupEpg(_epgMap, et -> ((Post)et).getUserId(), (et, vl) -> ((Post)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((Post)et).getCreatedAt(), (et, vl) -> ((Post)et).setCreatedAt(ctldt(vl)), "createdAt");
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
        setupEfpg(_efpgMap, et -> ((Post)et).getUser(), (et, vl) -> ((Post)et).setUser((OptionalEntity<User>)vl), "user");
        setupEfpg(_efpgMap, et -> ((Post)et).getFavorite(), (et, vl) -> ((Post)et).setFavorite((OptionalEntity<Favorite>)vl), "favorite");
        setupEfpg(_efpgMap, et -> ((Post)et).getComment(), (et, vl) -> ((Post)et).setComment((OptionalEntity<Comment>)vl), "comment");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "POST";
    protected final String _tableDispName = "POST";
    protected final String _tablePropertyName = "post";
    protected final TableSqlName _tableSqlName = new TableSqlName("POST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPostId = cci("POST_ID", "POST_ID", null, null, Integer.class, "postId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetId = cci("TARGET_ID", "TARGET_ID", null, null, Integer.class, "targetId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "favorite,comment", null, null, false);
    protected final ColumnInfo _columnTargetType = cci("TARGET_TYPE", "TARGET_TYPE", null, null, String.class, "targetType", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Integer.class, "userId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnCreatedAt = cci("CREATED_AT", "CREATED_AT", null, null, java.time.LocalDateTime.class, "createdAt", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostId() { return _columnPostId; }
    /**
     * TARGET_ID: {UQ+, NotNull, INT(10), FK to FAVORITE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetId() { return _columnTargetId; }
    /**
     * TARGET_TYPE: {+UQ, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetType() { return _columnTargetType; }
    /**
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * CREATED_AT: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedAt() { return _columnCreatedAt; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPostId());
        ls.add(columnTargetId());
        ls.add(columnTargetType());
        ls.add(columnUserId());
        ls.add(columnCreatedAt());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPostId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnTargetId());
        ls.add(columnTargetType());
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
     * USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_POST_USER", "user", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "postList", false);
    }
    /**
     * FAVORITE by my TARGET_ID, named 'favorite'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignFavorite() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTargetId(), FavoriteDbm.getInstance().columnFavoriteId());
        return cfi("FK_POST_FAVORITE", "favorite", this, FavoriteDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "postList", false);
    }
    /**
     * COMMENT by my TARGET_ID, named 'comment'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignComment() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTargetId(), CommentDbm.getInstance().columnCommentId());
        return cfi("FK_POST_COMMENT", "comment", this, CommentDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "postList", false);
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
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.Post"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.PostCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.PostBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Post> getEntityType() { return Post.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Post newEntity() { return new Post(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Post)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Post)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
