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
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, CommentCQ> xdfgetId_ExistsReferrer_CommentList() { return xgetSQueMap("id_ExistsReferrer_CommentList"); }
    public String keepId_ExistsReferrer_CommentList(CommentCQ sq) { return xkeepSQue("id_ExistsReferrer_CommentList", sq); }

    public Map<String, PickCQ> xdfgetId_ExistsReferrer_PickList() { return xgetSQueMap("id_ExistsReferrer_PickList"); }
    public String keepId_ExistsReferrer_PickList(PickCQ sq) { return xkeepSQue("id_ExistsReferrer_PickList", sq); }

    public Map<String, RelationshipCQ> xdfgetId_ExistsReferrer_RelationshipByFollowerIdList() { return xgetSQueMap("id_ExistsReferrer_RelationshipByFollowerIdList"); }
    public String keepId_ExistsReferrer_RelationshipByFollowerIdList(RelationshipCQ sq) { return xkeepSQue("id_ExistsReferrer_RelationshipByFollowerIdList", sq); }

    public Map<String, RelationshipCQ> xdfgetId_ExistsReferrer_RelationshipByFollowingIdList() { return xgetSQueMap("id_ExistsReferrer_RelationshipByFollowingIdList"); }
    public String keepId_ExistsReferrer_RelationshipByFollowingIdList(RelationshipCQ sq) { return xkeepSQue("id_ExistsReferrer_RelationshipByFollowingIdList", sq); }

    public Map<String, CommentCQ> xdfgetId_NotExistsReferrer_CommentList() { return xgetSQueMap("id_NotExistsReferrer_CommentList"); }
    public String keepId_NotExistsReferrer_CommentList(CommentCQ sq) { return xkeepSQue("id_NotExistsReferrer_CommentList", sq); }

    public Map<String, PickCQ> xdfgetId_NotExistsReferrer_PickList() { return xgetSQueMap("id_NotExistsReferrer_PickList"); }
    public String keepId_NotExistsReferrer_PickList(PickCQ sq) { return xkeepSQue("id_NotExistsReferrer_PickList", sq); }

    public Map<String, RelationshipCQ> xdfgetId_NotExistsReferrer_RelationshipByFollowerIdList() { return xgetSQueMap("id_NotExistsReferrer_RelationshipByFollowerIdList"); }
    public String keepId_NotExistsReferrer_RelationshipByFollowerIdList(RelationshipCQ sq) { return xkeepSQue("id_NotExistsReferrer_RelationshipByFollowerIdList", sq); }

    public Map<String, RelationshipCQ> xdfgetId_NotExistsReferrer_RelationshipByFollowingIdList() { return xgetSQueMap("id_NotExistsReferrer_RelationshipByFollowingIdList"); }
    public String keepId_NotExistsReferrer_RelationshipByFollowingIdList(RelationshipCQ sq) { return xkeepSQue("id_NotExistsReferrer_RelationshipByFollowingIdList", sq); }

    public Map<String, CommentCQ> xdfgetId_SpecifyDerivedReferrer_CommentList() { return xgetSQueMap("id_SpecifyDerivedReferrer_CommentList"); }
    public String keepId_SpecifyDerivedReferrer_CommentList(CommentCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_CommentList", sq); }

    public Map<String, PickCQ> xdfgetId_SpecifyDerivedReferrer_PickList() { return xgetSQueMap("id_SpecifyDerivedReferrer_PickList"); }
    public String keepId_SpecifyDerivedReferrer_PickList(PickCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_PickList", sq); }

    public Map<String, RelationshipCQ> xdfgetId_SpecifyDerivedReferrer_RelationshipByFollowerIdList() { return xgetSQueMap("id_SpecifyDerivedReferrer_RelationshipByFollowerIdList"); }
    public String keepId_SpecifyDerivedReferrer_RelationshipByFollowerIdList(RelationshipCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_RelationshipByFollowerIdList", sq); }

    public Map<String, RelationshipCQ> xdfgetId_SpecifyDerivedReferrer_RelationshipByFollowingIdList() { return xgetSQueMap("id_SpecifyDerivedReferrer_RelationshipByFollowingIdList"); }
    public String keepId_SpecifyDerivedReferrer_RelationshipByFollowingIdList(RelationshipCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_RelationshipByFollowingIdList", sq); }

    public Map<String, CommentCQ> xdfgetId_QueryDerivedReferrer_CommentList() { return xgetSQueMap("id_QueryDerivedReferrer_CommentList"); }
    public String keepId_QueryDerivedReferrer_CommentList(CommentCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_CommentList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_CommentListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_CommentList"); }
    public String keepId_QueryDerivedReferrer_CommentListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_CommentList", pm); }

    public Map<String, PickCQ> xdfgetId_QueryDerivedReferrer_PickList() { return xgetSQueMap("id_QueryDerivedReferrer_PickList"); }
    public String keepId_QueryDerivedReferrer_PickList(PickCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_PickList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_PickListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_PickList"); }
    public String keepId_QueryDerivedReferrer_PickListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_PickList", pm); }

    public Map<String, RelationshipCQ> xdfgetId_QueryDerivedReferrer_RelationshipByFollowerIdList() { return xgetSQueMap("id_QueryDerivedReferrer_RelationshipByFollowerIdList"); }
    public String keepId_QueryDerivedReferrer_RelationshipByFollowerIdList(RelationshipCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_RelationshipByFollowerIdList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_RelationshipByFollowerIdListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_RelationshipByFollowerIdList"); }
    public String keepId_QueryDerivedReferrer_RelationshipByFollowerIdListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_RelationshipByFollowerIdList", pm); }

    public Map<String, RelationshipCQ> xdfgetId_QueryDerivedReferrer_RelationshipByFollowingIdList() { return xgetSQueMap("id_QueryDerivedReferrer_RelationshipByFollowingIdList"); }
    public String keepId_QueryDerivedReferrer_RelationshipByFollowingIdList(RelationshipCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_RelationshipByFollowingIdList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_RelationshipByFollowingIdListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_RelationshipByFollowingIdList"); }
    public String keepId_QueryDerivedReferrer_RelationshipByFollowingIdListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_RelationshipByFollowingIdList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

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
