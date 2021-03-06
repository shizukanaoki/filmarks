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
 * The base condition-query of ARTIST.
 * @author DBFlute(AutoGenerator)
 */
public class BsArtistCQ extends AbstractBsArtistCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ArtistCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsArtistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from ARTIST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ArtistCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ArtistCIQ xcreateCIQ() {
        ArtistCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ArtistCIQ xnewCIQ() {
        return new ArtistCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join ARTIST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ArtistCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ArtistCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _artistId;
    public ConditionValue xdfgetArtistId()
    { if (_artistId == null) { _artistId = nCV(); }
      return _artistId; }
    protected ConditionValue xgetCValueArtistId() { return xdfgetArtistId(); }

    public Map<String, AlbumCQ> xdfgetArtistId_ExistsReferrer_AlbumList() { return xgetSQueMap("artistId_ExistsReferrer_AlbumList"); }
    public String keepArtistId_ExistsReferrer_AlbumList(AlbumCQ sq) { return xkeepSQue("artistId_ExistsReferrer_AlbumList", sq); }

    public Map<String, AlbumCQ> xdfgetArtistId_NotExistsReferrer_AlbumList() { return xgetSQueMap("artistId_NotExistsReferrer_AlbumList"); }
    public String keepArtistId_NotExistsReferrer_AlbumList(AlbumCQ sq) { return xkeepSQue("artistId_NotExistsReferrer_AlbumList", sq); }

    public Map<String, AlbumCQ> xdfgetArtistId_SpecifyDerivedReferrer_AlbumList() { return xgetSQueMap("artistId_SpecifyDerivedReferrer_AlbumList"); }
    public String keepArtistId_SpecifyDerivedReferrer_AlbumList(AlbumCQ sq) { return xkeepSQue("artistId_SpecifyDerivedReferrer_AlbumList", sq); }

    public Map<String, AlbumCQ> xdfgetArtistId_QueryDerivedReferrer_AlbumList() { return xgetSQueMap("artistId_QueryDerivedReferrer_AlbumList"); }
    public String keepArtistId_QueryDerivedReferrer_AlbumList(AlbumCQ sq) { return xkeepSQue("artistId_QueryDerivedReferrer_AlbumList", sq); }
    public Map<String, Object> xdfgetArtistId_QueryDerivedReferrer_AlbumListParameter() { return xgetSQuePmMap("artistId_QueryDerivedReferrer_AlbumList"); }
    public String keepArtistId_QueryDerivedReferrer_AlbumListParameter(Object pm) { return xkeepSQuePm("artistId_QueryDerivedReferrer_AlbumList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsArtistCQ addOrderBy_ArtistId_Asc() { regOBA("ARTIST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsArtistCQ addOrderBy_ArtistId_Desc() { regOBD("ARTIST_ID"); return this; }

    protected ConditionValue _artistName;
    public ConditionValue xdfgetArtistName()
    { if (_artistName == null) { _artistName = nCV(); }
      return _artistName; }
    protected ConditionValue xgetCValueArtistName() { return xdfgetArtistName(); }

    /**
     * Add order-by as ascend. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsArtistCQ addOrderBy_ArtistName_Asc() { regOBA("ARTIST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsArtistCQ addOrderBy_ArtistName_Desc() { regOBD("ARTIST_NAME"); return this; }

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
    public BsArtistCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsArtistCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ArtistCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ArtistCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ArtistCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ArtistCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ArtistCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ArtistCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ArtistCQ> _myselfExistsMap;
    public Map<String, ArtistCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ArtistCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ArtistCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ArtistCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ArtistCB.class.getName(); }
    protected String xCQ() { return ArtistCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
