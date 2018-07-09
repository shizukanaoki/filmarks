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
 * The base condition-query of FAVORITE.
 * @author DBFlute(AutoGenerator)
 */
public class BsFavoriteCQ extends AbstractBsFavoriteCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected FavoriteCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsFavoriteCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from FAVORITE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public FavoriteCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected FavoriteCIQ xcreateCIQ() {
        FavoriteCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected FavoriteCIQ xnewCIQ() {
        return new FavoriteCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join FAVORITE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public FavoriteCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        FavoriteCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _favoriteId;
    public ConditionValue xdfgetFavoriteId()
    { if (_favoriteId == null) { _favoriteId = nCV(); }
      return _favoriteId; }
    protected ConditionValue xgetCValueFavoriteId() { return xdfgetFavoriteId(); }

    /**
     * Add order-by as ascend. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsFavoriteCQ addOrderBy_FavoriteId_Asc() { regOBA("FAVORITE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsFavoriteCQ addOrderBy_FavoriteId_Desc() { regOBD("FAVORITE_ID"); return this; }

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
    public BsFavoriteCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsFavoriteCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _albumId;
    public ConditionValue xdfgetAlbumId()
    { if (_albumId == null) { _albumId = nCV(); }
      return _albumId; }
    protected ConditionValue xgetCValueAlbumId() { return xdfgetAlbumId(); }

    /**
     * Add order-by as ascend. <br>
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @return this. (NotNull)
     */
    public BsFavoriteCQ addOrderBy_AlbumId_Asc() { regOBA("ALBUM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @return this. (NotNull)
     */
    public BsFavoriteCQ addOrderBy_AlbumId_Desc() { regOBD("ALBUM_ID"); return this; }

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
    public BsFavoriteCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsFavoriteCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        FavoriteCQ bq = (FavoriteCQ)bqs;
        FavoriteCQ uq = (FavoriteCQ)uqs;
        if (bq.hasConditionQueryAlbum()) {
            uq.queryAlbum().reflectRelationOnUnionQuery(bq.queryAlbum(), uq.queryAlbum());
        }
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * ALBUM by my ALBUM_ID, named 'album'.
     * @return The instance of condition-query. (NotNull)
     */
    public AlbumCQ queryAlbum() {
        return xdfgetConditionQueryAlbum();
    }
    public AlbumCQ xdfgetConditionQueryAlbum() {
        String prop = "album";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAlbum()); xsetupOuterJoinAlbum(); }
        return xgetQueRlMap(prop);
    }
    protected AlbumCQ xcreateQueryAlbum() {
        String nrp = xresolveNRP("FAVORITE", "album"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AlbumCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "album", nrp);
    }
    protected void xsetupOuterJoinAlbum() { xregOutJo("album"); }
    public boolean hasConditionQueryAlbum() { return xhasQueRlMap("album"); }

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
        String nrp = xresolveNRP("FAVORITE", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "user", nrp);
    }
    protected void xsetupOuterJoinUser() { xregOutJo("user"); }
    public boolean hasConditionQueryUser() { return xhasQueRlMap("user"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, FavoriteCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(FavoriteCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, FavoriteCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(FavoriteCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, FavoriteCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(FavoriteCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, FavoriteCQ> _myselfExistsMap;
    public Map<String, FavoriteCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(FavoriteCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, FavoriteCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(FavoriteCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return FavoriteCB.class.getName(); }
    protected String xCQ() { return FavoriteCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
