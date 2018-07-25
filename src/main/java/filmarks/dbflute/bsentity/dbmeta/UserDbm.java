package filmarks.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import filmarks.dbflute.allcommon.*;
import filmarks.dbflute.exentity.*;

/**
 * The DB meta of USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserDbm _instance = new UserDbm();
    private UserDbm() {}
    public static UserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((User)et).getUserId(), (et, vl) -> ((User)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((User)et).getUsername(), (et, vl) -> ((User)et).setUsername((String)vl), "username");
        setupEpg(_epgMap, et -> ((User)et).getPassword(), (et, vl) -> ((User)et).setPassword((String)vl), "password");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER";
    protected final String _tableDispName = "USER";
    protected final String _tablePropertyName = "user";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Integer.class, "userId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, "commentList,favoriteList,lyricsRecommendationList,postList,userFollowingByFollowerIdList,userFollowingByFollowingIdList", null, false);
    protected final ColumnInfo _columnUsername = cci("USERNAME", "USERNAME", null, null, String.class, "username", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);

    /**
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsername() { return _columnUsername; }
    /**
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnUsername());
        ls.add(columnPassword());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnUsername()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * COMMENT by USER_ID, named 'commentList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCommentList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), CommentDbm.getInstance().columnUserId());
        return cri("FK_COMMENT_USER", "commentList", this, CommentDbm.getInstance(), mp, false, "user");
    }
    /**
     * FAVORITE by USER_ID, named 'favoriteList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFavoriteList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), FavoriteDbm.getInstance().columnUserId());
        return cri("FK_PICK_USER", "favoriteList", this, FavoriteDbm.getInstance(), mp, false, "user");
    }
    /**
     * LYRICS_RECOMMENDATION by USER_ID, named 'lyricsRecommendationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLyricsRecommendationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), LyricsRecommendationDbm.getInstance().columnUserId());
        return cri("FK_LYRICS_RECOMMENDATION_USER", "lyricsRecommendationList", this, LyricsRecommendationDbm.getInstance(), mp, false, "user");
    }
    /**
     * POST by USER_ID, named 'postList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPostList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), PostDbm.getInstance().columnUserId());
        return cri("FK_POST_USER", "postList", this, PostDbm.getInstance(), mp, false, "user");
    }
    /**
     * USER_FOLLOWING by FOLLOWER_ID, named 'userFollowingByFollowerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserFollowingByFollowerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserFollowingDbm.getInstance().columnFollowerId());
        return cri("FK_RELATIONSHIP_FOLLOWER", "userFollowingByFollowerIdList", this, UserFollowingDbm.getInstance(), mp, false, "userByFollowerId");
    }
    /**
     * USER_FOLLOWING by FOLLOWING_ID, named 'userFollowingByFollowingIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserFollowingByFollowingIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserFollowingDbm.getInstance().columnFollowingId());
        return cri("FK_RELATIONSHIP_FOLLOWING", "userFollowingByFollowingIdList", this, UserFollowingDbm.getInstance(), mp, false, "userByFollowingId");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.User"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.UserCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.UserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<User> getEntityType() { return User.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public User newEntity() { return new User(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((User)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((User)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
