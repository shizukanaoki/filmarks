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
 * The base condition-query of SONG.
 * @author DBFlute(AutoGenerator)
 */
public class BsSongCQ extends AbstractBsSongCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SongCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSongCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SONG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SongCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SongCIQ xcreateCIQ() {
        SongCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SongCIQ xnewCIQ() {
        return new SongCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SONG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SongCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SongCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _songId;
    public ConditionValue xdfgetSongId()
    { if (_songId == null) { _songId = nCV(); }
      return _songId; }
    protected ConditionValue xgetCValueSongId() { return xdfgetSongId(); }

    /**
     * Add order-by as ascend. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSongCQ addOrderBy_SongId_Asc() { regOBA("SONG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSongCQ addOrderBy_SongId_Desc() { regOBD("SONG_ID"); return this; }

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
    public BsSongCQ addOrderBy_AlbumId_Asc() { regOBA("ALBUM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @return this. (NotNull)
     */
    public BsSongCQ addOrderBy_AlbumId_Desc() { regOBD("ALBUM_ID"); return this; }

    protected ConditionValue _songTitle;
    public ConditionValue xdfgetSongTitle()
    { if (_songTitle == null) { _songTitle = nCV(); }
      return _songTitle; }
    protected ConditionValue xgetCValueSongTitle() { return xdfgetSongTitle(); }

    /**
     * Add order-by as ascend. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsSongCQ addOrderBy_SongTitle_Asc() { regOBA("SONG_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsSongCQ addOrderBy_SongTitle_Desc() { regOBD("SONG_TITLE"); return this; }

    protected ConditionValue _songLyrics;
    public ConditionValue xdfgetSongLyrics()
    { if (_songLyrics == null) { _songLyrics = nCV(); }
      return _songLyrics; }
    protected ConditionValue xgetCValueSongLyrics() { return xdfgetSongLyrics(); }

    /**
     * Add order-by as ascend. <br>
     * SONG_LYRICS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSongCQ addOrderBy_SongLyrics_Asc() { regOBA("SONG_LYRICS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SONG_LYRICS: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsSongCQ addOrderBy_SongLyrics_Desc() { regOBD("SONG_LYRICS"); return this; }

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
    public BsSongCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSongCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SongCQ bq = (SongCQ)bqs;
        SongCQ uq = (SongCQ)uqs;
        if (bq.hasConditionQueryAlbum()) {
            uq.queryAlbum().reflectRelationOnUnionQuery(bq.queryAlbum(), uq.queryAlbum());
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
        String nrp = xresolveNRP("SONG", "album"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AlbumCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "album", nrp);
    }
    protected void xsetupOuterJoinAlbum() { xregOutJo("album"); }
    public boolean hasConditionQueryAlbum() { return xhasQueRlMap("album"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SongCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SongCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SongCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SongCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SongCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SongCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SongCQ> _myselfExistsMap;
    public Map<String, SongCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SongCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SongCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SongCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SongCB.class.getName(); }
    protected String xCQ() { return SongCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
