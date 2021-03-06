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
 * The base condition-query of POST.
 * @author DBFlute(AutoGenerator)
 */
public class BsPostCQ extends AbstractBsPostCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PostCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPostCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from POST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PostCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PostCIQ xcreateCIQ() {
        PostCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PostCIQ xnewCIQ() {
        return new PostCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join POST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PostCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PostCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _postId;
    public ConditionValue xdfgetPostId()
    { if (_postId == null) { _postId = nCV(); }
      return _postId; }
    protected ConditionValue xgetCValuePostId() { return xdfgetPostId(); }

    /**
     * Add order-by as ascend. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_PostId_Asc() { regOBA("POST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_PostId_Desc() { regOBD("POST_ID"); return this; }

    protected ConditionValue _targetId;
    public ConditionValue xdfgetTargetId()
    { if (_targetId == null) { _targetId = nCV(); }
      return _targetId; }
    protected ConditionValue xgetCValueTargetId() { return xdfgetTargetId(); }

    /**
     * Add order-by as ascend. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10), FK to FAVORITE}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_TargetId_Asc() { regOBA("TARGET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10), FK to FAVORITE}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_TargetId_Desc() { regOBD("TARGET_ID"); return this; }

    protected ConditionValue _targetType;
    public ConditionValue xdfgetTargetType()
    { if (_targetType == null) { _targetType = nCV(); }
      return _targetType; }
    protected ConditionValue xgetCValueTargetType() { return xdfgetTargetType(); }

    /**
     * Add order-by as ascend. <br>
     * TARGET_TYPE: {+UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_TargetType_Asc() { regOBA("TARGET_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARGET_TYPE: {+UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_TargetType_Desc() { regOBD("TARGET_TYPE"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _createdAt;
    public ConditionValue xdfgetCreatedAt()
    { if (_createdAt == null) { _createdAt = nCV(); }
      return _createdAt; }
    protected ConditionValue xgetCValueCreatedAt() { return xdfgetCreatedAt(); }

    /**
     * Add order-by as ascend. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_CreatedAt_Asc() { regOBA("CREATED_AT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPostCQ addOrderBy_CreatedAt_Desc() { regOBD("CREATED_AT"); return this; }

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
    public BsPostCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPostCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PostCQ bq = (PostCQ)bqs;
        PostCQ uq = (PostCQ)uqs;
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
        if (bq.hasConditionQueryFavorite()) {
            uq.queryFavorite().reflectRelationOnUnionQuery(bq.queryFavorite(), uq.queryFavorite());
        }
        if (bq.hasConditionQueryComment()) {
            uq.queryComment().reflectRelationOnUnionQuery(bq.queryComment(), uq.queryComment());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my USER_ID, named 'user'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUser() {
        return xdfgetConditionQueryUser();
    }
    public UserCQ xdfgetConditionQueryUser() {
        String prop = "user";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUser()); xsetupOuterJoinUser(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUser() {
        String nrp = xresolveNRP("POST", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "user", nrp);
    }
    protected void xsetupOuterJoinUser() { xregOutJo("user"); }
    public boolean hasConditionQueryUser() { return xhasQueRlMap("user"); }

    /**
     * Get the condition-query for relation table. <br>
     * FAVORITE by my TARGET_ID, named 'favorite'.
     * @return The instance of condition-query. (NotNull)
     */
    public FavoriteCQ queryFavorite() {
        return xdfgetConditionQueryFavorite();
    }
    public FavoriteCQ xdfgetConditionQueryFavorite() {
        String prop = "favorite";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryFavorite()); xsetupOuterJoinFavorite(); }
        return xgetQueRlMap(prop);
    }
    protected FavoriteCQ xcreateQueryFavorite() {
        String nrp = xresolveNRP("POST", "favorite"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new FavoriteCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "favorite", nrp);
    }
    protected void xsetupOuterJoinFavorite() { xregOutJo("favorite"); }
    public boolean hasConditionQueryFavorite() { return xhasQueRlMap("favorite"); }

    /**
     * Get the condition-query for relation table. <br>
     * COMMENT by my TARGET_ID, named 'comment'.
     * @return The instance of condition-query. (NotNull)
     */
    public CommentCQ queryComment() {
        return xdfgetConditionQueryComment();
    }
    public CommentCQ xdfgetConditionQueryComment() {
        String prop = "comment";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryComment()); xsetupOuterJoinComment(); }
        return xgetQueRlMap(prop);
    }
    protected CommentCQ xcreateQueryComment() {
        String nrp = xresolveNRP("POST", "comment"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CommentCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "comment", nrp);
    }
    protected void xsetupOuterJoinComment() { xregOutJo("comment"); }
    public boolean hasConditionQueryComment() { return xhasQueRlMap("comment"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PostCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PostCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PostCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PostCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PostCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PostCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PostCQ> _myselfExistsMap;
    public Map<String, PostCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PostCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PostCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PostCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PostCB.class.getName(); }
    protected String xCQ() { return PostCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
