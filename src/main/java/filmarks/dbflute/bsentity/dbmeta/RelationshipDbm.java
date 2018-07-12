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
 * The DB meta of RELATIONSHIP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RelationshipDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RelationshipDbm _instance = new RelationshipDbm();
    private RelationshipDbm() {}
    public static RelationshipDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Relationship)et).getId(), (et, vl) -> ((Relationship)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Relationship)et).getFollowingId(), (et, vl) -> ((Relationship)et).setFollowingId(cti(vl)), "followingId");
        setupEpg(_epgMap, et -> ((Relationship)et).getFollowerId(), (et, vl) -> ((Relationship)et).setFollowerId(cti(vl)), "followerId");
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
        setupEfpg(_efpgMap, et -> ((Relationship)et).getUserByFollowerId(), (et, vl) -> ((Relationship)et).setUserByFollowerId((OptionalEntity<User>)vl), "userByFollowerId");
        setupEfpg(_efpgMap, et -> ((Relationship)et).getUserByFollowingId(), (et, vl) -> ((Relationship)et).setUserByFollowingId((OptionalEntity<User>)vl), "userByFollowingId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "RELATIONSHIP";
    protected final String _tableDispName = "RELATIONSHIP";
    protected final String _tablePropertyName = "relationship";
    protected final TableSqlName _tableSqlName = new TableSqlName("RELATIONSHIP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFollowingId = cci("FOLLOWING_ID", "FOLLOWING_ID", null, null, Integer.class, "followingId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "userByFollowingId", null, null, false);
    protected final ColumnInfo _columnFollowerId = cci("FOLLOWER_ID", "FOLLOWER_ID", null, null, Integer.class, "followerId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "userByFollowerId", null, null, false);

    /**
     * ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * FOLLOWING_ID: {IX, NotNull, INT(10), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowingId() { return _columnFollowingId; }
    /**
     * FOLLOWER_ID: {IX, NotNull, INT(10), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowerId() { return _columnFollowerId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnFollowingId());
        ls.add(columnFollowerId());
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
     * USER by my FOLLOWER_ID, named 'userByFollowerId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFollowerId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFollowerId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_RELATIONSHIP_FOLLOWER", "userByFollowerId", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "relationshipByFollowerIdList", false);
    }
    /**
     * USER by my FOLLOWING_ID, named 'userByFollowingId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFollowingId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFollowingId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_RELATIONSHIP_FOLLOWING", "userByFollowingId", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "relationshipByFollowingIdList", false);
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
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.Relationship"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.RelationshipCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.RelationshipBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Relationship> getEntityType() { return Relationship.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Relationship newEntity() { return new Relationship(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Relationship)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Relationship)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
