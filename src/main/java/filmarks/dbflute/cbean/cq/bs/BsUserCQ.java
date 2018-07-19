package filmarks.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import filmarks.dbflute.cbean.cq.ciq.*;
import filmarks.dbflute.cbean.*;
import filmarks.dbflute.cbean.cq.*;

/**
 * The base condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserCQ extends AbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserCIQ xcreateCIQ() {
        UserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserCIQ xnewCIQ() {
        return new UserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, CommentCQ> xdfgetUserId_ExistsReferrer_CommentList() { return xgetSQueMap("userId_ExistsReferrer_CommentList"); }
    public String keepUserId_ExistsReferrer_CommentList(CommentCQ sq) { return xkeepSQue("userId_ExistsReferrer_CommentList", sq); }

    public Map<String, FavoriteCQ> xdfgetUserId_ExistsReferrer_FavoriteList() { return xgetSQueMap("userId_ExistsReferrer_FavoriteList"); }
    public String keepUserId_ExistsReferrer_FavoriteList(FavoriteCQ sq) { return xkeepSQue("userId_ExistsReferrer_FavoriteList", sq); }

    public Map<String, LyricsRecommendationCQ> xdfgetUserId_ExistsReferrer_LyricsRecommendationList() { return xgetSQueMap("userId_ExistsReferrer_LyricsRecommendationList"); }
    public String keepUserId_ExistsReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq) { return xkeepSQue("userId_ExistsReferrer_LyricsRecommendationList", sq); }

    public Map<String, PostCQ> xdfgetUserId_ExistsReferrer_PostList() { return xgetSQueMap("userId_ExistsReferrer_PostList"); }
    public String keepUserId_ExistsReferrer_PostList(PostCQ sq) { return xkeepSQue("userId_ExistsReferrer_PostList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_ExistsReferrer_UserFollowingByFollowerIdList() { return xgetSQueMap("userId_ExistsReferrer_UserFollowingByFollowerIdList"); }
    public String keepUserId_ExistsReferrer_UserFollowingByFollowerIdList(UserFollowingCQ sq) { return xkeepSQue("userId_ExistsReferrer_UserFollowingByFollowerIdList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_ExistsReferrer_UserFollowingByFollowingIdList() { return xgetSQueMap("userId_ExistsReferrer_UserFollowingByFollowingIdList"); }
    public String keepUserId_ExistsReferrer_UserFollowingByFollowingIdList(UserFollowingCQ sq) { return xkeepSQue("userId_ExistsReferrer_UserFollowingByFollowingIdList", sq); }

    public Map<String, CommentCQ> xdfgetUserId_NotExistsReferrer_CommentList() { return xgetSQueMap("userId_NotExistsReferrer_CommentList"); }
    public String keepUserId_NotExistsReferrer_CommentList(CommentCQ sq) { return xkeepSQue("userId_NotExistsReferrer_CommentList", sq); }

    public Map<String, FavoriteCQ> xdfgetUserId_NotExistsReferrer_FavoriteList() { return xgetSQueMap("userId_NotExistsReferrer_FavoriteList"); }
    public String keepUserId_NotExistsReferrer_FavoriteList(FavoriteCQ sq) { return xkeepSQue("userId_NotExistsReferrer_FavoriteList", sq); }

    public Map<String, LyricsRecommendationCQ> xdfgetUserId_NotExistsReferrer_LyricsRecommendationList() { return xgetSQueMap("userId_NotExistsReferrer_LyricsRecommendationList"); }
    public String keepUserId_NotExistsReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq) { return xkeepSQue("userId_NotExistsReferrer_LyricsRecommendationList", sq); }

    public Map<String, PostCQ> xdfgetUserId_NotExistsReferrer_PostList() { return xgetSQueMap("userId_NotExistsReferrer_PostList"); }
    public String keepUserId_NotExistsReferrer_PostList(PostCQ sq) { return xkeepSQue("userId_NotExistsReferrer_PostList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_NotExistsReferrer_UserFollowingByFollowerIdList() { return xgetSQueMap("userId_NotExistsReferrer_UserFollowingByFollowerIdList"); }
    public String keepUserId_NotExistsReferrer_UserFollowingByFollowerIdList(UserFollowingCQ sq) { return xkeepSQue("userId_NotExistsReferrer_UserFollowingByFollowerIdList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_NotExistsReferrer_UserFollowingByFollowingIdList() { return xgetSQueMap("userId_NotExistsReferrer_UserFollowingByFollowingIdList"); }
    public String keepUserId_NotExistsReferrer_UserFollowingByFollowingIdList(UserFollowingCQ sq) { return xkeepSQue("userId_NotExistsReferrer_UserFollowingByFollowingIdList", sq); }

    public Map<String, CommentCQ> xdfgetUserId_SpecifyDerivedReferrer_CommentList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_CommentList"); }
    public String keepUserId_SpecifyDerivedReferrer_CommentList(CommentCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_CommentList", sq); }

    public Map<String, FavoriteCQ> xdfgetUserId_SpecifyDerivedReferrer_FavoriteList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_FavoriteList"); }
    public String keepUserId_SpecifyDerivedReferrer_FavoriteList(FavoriteCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_FavoriteList", sq); }

    public Map<String, LyricsRecommendationCQ> xdfgetUserId_SpecifyDerivedReferrer_LyricsRecommendationList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_LyricsRecommendationList"); }
    public String keepUserId_SpecifyDerivedReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_LyricsRecommendationList", sq); }

    public Map<String, PostCQ> xdfgetUserId_SpecifyDerivedReferrer_PostList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_PostList"); }
    public String keepUserId_SpecifyDerivedReferrer_PostList(PostCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_PostList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_SpecifyDerivedReferrer_UserFollowingByFollowerIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_UserFollowingByFollowerIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowerIdList(UserFollowingCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_UserFollowingByFollowerIdList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_SpecifyDerivedReferrer_UserFollowingByFollowingIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_UserFollowingByFollowingIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowingIdList(UserFollowingCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_UserFollowingByFollowingIdList", sq); }

    public Map<String, CommentCQ> xdfgetUserId_QueryDerivedReferrer_CommentList() { return xgetSQueMap("userId_QueryDerivedReferrer_CommentList"); }
    public String keepUserId_QueryDerivedReferrer_CommentList(CommentCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_CommentList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_CommentListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_CommentList"); }
    public String keepUserId_QueryDerivedReferrer_CommentListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_CommentList", pm); }

    public Map<String, FavoriteCQ> xdfgetUserId_QueryDerivedReferrer_FavoriteList() { return xgetSQueMap("userId_QueryDerivedReferrer_FavoriteList"); }
    public String keepUserId_QueryDerivedReferrer_FavoriteList(FavoriteCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_FavoriteList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_FavoriteListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_FavoriteList"); }
    public String keepUserId_QueryDerivedReferrer_FavoriteListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_FavoriteList", pm); }

    public Map<String, LyricsRecommendationCQ> xdfgetUserId_QueryDerivedReferrer_LyricsRecommendationList() { return xgetSQueMap("userId_QueryDerivedReferrer_LyricsRecommendationList"); }
    public String keepUserId_QueryDerivedReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_LyricsRecommendationList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_LyricsRecommendationListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_LyricsRecommendationList"); }
    public String keepUserId_QueryDerivedReferrer_LyricsRecommendationListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_LyricsRecommendationList", pm); }

    public Map<String, PostCQ> xdfgetUserId_QueryDerivedReferrer_PostList() { return xgetSQueMap("userId_QueryDerivedReferrer_PostList"); }
    public String keepUserId_QueryDerivedReferrer_PostList(PostCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_PostList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_PostListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_PostList"); }
    public String keepUserId_QueryDerivedReferrer_PostListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_PostList", pm); }

    public Map<String, UserFollowingCQ> xdfgetUserId_QueryDerivedReferrer_UserFollowingByFollowerIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_UserFollowingByFollowerIdList"); }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerIdList(UserFollowingCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_UserFollowingByFollowerIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_UserFollowingByFollowerIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_UserFollowingByFollowerIdList"); }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_UserFollowingByFollowerIdList", pm); }

    public Map<String, UserFollowingCQ> xdfgetUserId_QueryDerivedReferrer_UserFollowingByFollowingIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_UserFollowingByFollowingIdList"); }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingIdList(UserFollowingCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_UserFollowingByFollowingIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_UserFollowingByFollowingIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_UserFollowingByFollowingIdList"); }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_UserFollowingByFollowingIdList", pm); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _username;
    public ConditionValue xdfgetUsername()
    { if (_username == null) { _username = nCV(); }
      return _username; }
    protected ConditionValue xgetCValueUsername() { return xdfgetUsername(); }

    /**
     * Add order-by as ascend. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Username_Asc() { regOBA("USERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Username_Desc() { regOBD("USERNAME"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /**
     * Add order-by as ascend. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserCQ> _myselfExistsMap;
    public Map<String, UserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserCB.class.getName(); }
    protected String xCQ() { return UserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
