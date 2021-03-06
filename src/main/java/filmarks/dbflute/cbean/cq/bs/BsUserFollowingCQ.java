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
 * The base condition-query of USER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserFollowingCQ extends AbstractBsUserFollowingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserFollowingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserFollowingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from USER_FOLLOWING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserFollowingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserFollowingCIQ xcreateCIQ() {
        UserFollowingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserFollowingCIQ xnewCIQ() {
        return new UserFollowingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join USER_FOLLOWING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserFollowingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserFollowingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /**
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _followingId;
    public ConditionValue xdfgetFollowingId()
    { if (_followingId == null) { _followingId = nCV(); }
      return _followingId; }
    protected ConditionValue xgetCValueFollowingId() { return xdfgetFollowingId(); }

    /**
     * Add order-by as ascend. <br>
     * FOLLOWING_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_FollowingId_Asc() { regOBA("FOLLOWING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOLLOWING_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_FollowingId_Desc() { regOBD("FOLLOWING_ID"); return this; }

    protected ConditionValue _followerId;
    public ConditionValue xdfgetFollowerId()
    { if (_followerId == null) { _followerId = nCV(); }
      return _followerId; }
    protected ConditionValue xgetCValueFollowerId() { return xdfgetFollowerId(); }

    /**
     * Add order-by as ascend. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, INT(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_FollowerId_Asc() { regOBA("FOLLOWER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, INT(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_FollowerId_Desc() { regOBD("FOLLOWER_ID"); return this; }

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
    public BsUserFollowingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserFollowingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        UserFollowingCQ bq = (UserFollowingCQ)bqs;
        UserFollowingCQ uq = (UserFollowingCQ)uqs;
        if (bq.hasConditionQueryUserByFollowerId()) {
            uq.queryUserByFollowerId().reflectRelationOnUnionQuery(bq.queryUserByFollowerId(), uq.queryUserByFollowerId());
        }
        if (bq.hasConditionQueryUserByFollowingId()) {
            uq.queryUserByFollowingId().reflectRelationOnUnionQuery(bq.queryUserByFollowingId(), uq.queryUserByFollowingId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my FOLLOWER_ID, named 'userByFollowerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByFollowerId() {
        return xdfgetConditionQueryUserByFollowerId();
    }
    public UserCQ xdfgetConditionQueryUserByFollowerId() {
        String prop = "userByFollowerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByFollowerId()); xsetupOuterJoinUserByFollowerId(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUserByFollowerId() {
        String nrp = xresolveNRP("USER_FOLLOWING", "userByFollowerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByFollowerId", nrp);
    }
    protected void xsetupOuterJoinUserByFollowerId() { xregOutJo("userByFollowerId"); }
    public boolean hasConditionQueryUserByFollowerId() { return xhasQueRlMap("userByFollowerId"); }

    /**
     * Get the condition-query for relation table. <br>
     * USER by my FOLLOWING_ID, named 'userByFollowingId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByFollowingId() {
        return xdfgetConditionQueryUserByFollowingId();
    }
    public UserCQ xdfgetConditionQueryUserByFollowingId() {
        String prop = "userByFollowingId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByFollowingId()); xsetupOuterJoinUserByFollowingId(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUserByFollowingId() {
        String nrp = xresolveNRP("USER_FOLLOWING", "userByFollowingId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByFollowingId", nrp);
    }
    protected void xsetupOuterJoinUserByFollowingId() { xregOutJo("userByFollowingId"); }
    public boolean hasConditionQueryUserByFollowingId() { return xhasQueRlMap("userByFollowingId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserFollowingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserFollowingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserFollowingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserFollowingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserFollowingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserFollowingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserFollowingCQ> _myselfExistsMap;
    public Map<String, UserFollowingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserFollowingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserFollowingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserFollowingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserFollowingCB.class.getName(); }
    protected String xCQ() { return UserFollowingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
