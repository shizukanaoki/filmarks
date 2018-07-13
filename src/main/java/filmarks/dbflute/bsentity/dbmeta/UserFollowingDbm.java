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
 * The DB meta of USER_FOLLOWING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserFollowingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserFollowingDbm _instance = new UserFollowingDbm();
    private UserFollowingDbm() {}
    public static UserFollowingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((UserFollowing)et).getId(), (et, vl) -> ((UserFollowing)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((UserFollowing)et).getFollowingId(), (et, vl) -> ((UserFollowing)et).setFollowingId(cti(vl)), "followingId");
        setupEpg(_epgMap, et -> ((UserFollowing)et).getFollowerId(), (et, vl) -> ((UserFollowing)et).setFollowerId(cti(vl)), "followerId");
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
        setupEfpg(_efpgMap, et -> ((UserFollowing)et).getUserByFollowerId(), (et, vl) -> ((UserFollowing)et).setUserByFollowerId((OptionalEntity<User>)vl), "userByFollowerId");
        setupEfpg(_efpgMap, et -> ((UserFollowing)et).getUserByFollowingId(), (et, vl) -> ((UserFollowing)et).setUserByFollowingId((OptionalEntity<User>)vl), "userByFollowingId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER_FOLLOWING";
    protected final String _tableDispName = "USER_FOLLOWING";
    protected final String _tablePropertyName = "userFollowing";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER_FOLLOWING", _tableDbName);
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
     * FOLLOWING_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowingId() { return _columnFollowingId; }
    /**
     * FOLLOWER_ID: {+UQ, IX, NotNull, INT(10), FK to USER}
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

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnFollowingId());
        ls.add(columnFollowerId());
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
     * USER by my FOLLOWER_ID, named 'userByFollowerId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFollowerId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFollowerId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_RELATIONSHIP_FOLLOWER", "userByFollowerId", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userFollowingByFollowerIdList", false);
    }
    /**
     * USER by my FOLLOWING_ID, named 'userByFollowingId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFollowingId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFollowingId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_RELATIONSHIP_FOLLOWING", "userByFollowingId", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userFollowingByFollowingIdList", false);
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
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.UserFollowing"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.UserFollowingCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.UserFollowingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserFollowing> getEntityType() { return UserFollowing.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserFollowing newEntity() { return new UserFollowing(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserFollowing)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserFollowing)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
