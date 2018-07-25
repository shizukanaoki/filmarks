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
 * The base condition-query of LYRICS_RECOMMENDATION.
 * @author DBFlute(AutoGenerator)
 */
public class BsLyricsRecommendationCQ extends AbstractBsLyricsRecommendationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LyricsRecommendationCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLyricsRecommendationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LYRICS_RECOMMENDATION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LyricsRecommendationCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LyricsRecommendationCIQ xcreateCIQ() {
        LyricsRecommendationCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LyricsRecommendationCIQ xnewCIQ() {
        return new LyricsRecommendationCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LYRICS_RECOMMENDATION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LyricsRecommendationCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LyricsRecommendationCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsLyricsRecommendationCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLyricsRecommendationCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

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
    public BsLyricsRecommendationCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsLyricsRecommendationCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _songId;
    public ConditionValue xdfgetSongId()
    { if (_songId == null) { _songId = nCV(); }
      return _songId; }
    protected ConditionValue xgetCValueSongId() { return xdfgetSongId(); }

    /**
     * Add order-by as ascend. <br>
     * SONG_ID: {IX, NotNull, INT(10), FK to SONG}
     * @return this. (NotNull)
     */
    public BsLyricsRecommendationCQ addOrderBy_SongId_Asc() { regOBA("SONG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SONG_ID: {IX, NotNull, INT(10), FK to SONG}
     * @return this. (NotNull)
     */
    public BsLyricsRecommendationCQ addOrderBy_SongId_Desc() { regOBD("SONG_ID"); return this; }

    protected ConditionValue _lyrics;
    public ConditionValue xdfgetLyrics()
    { if (_lyrics == null) { _lyrics = nCV(); }
      return _lyrics; }
    protected ConditionValue xgetCValueLyrics() { return xdfgetLyrics(); }

    /**
     * Add order-by as ascend. <br>
     * LYRICS: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsLyricsRecommendationCQ addOrderBy_Lyrics_Asc() { regOBA("LYRICS"); return this; }

    /**
     * Add order-by as descend. <br>
     * LYRICS: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsLyricsRecommendationCQ addOrderBy_Lyrics_Desc() { regOBD("LYRICS"); return this; }

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
    public BsLyricsRecommendationCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLyricsRecommendationCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LyricsRecommendationCQ bq = (LyricsRecommendationCQ)bqs;
        LyricsRecommendationCQ uq = (LyricsRecommendationCQ)uqs;
        if (bq.hasConditionQuerySong()) {
            uq.querySong().reflectRelationOnUnionQuery(bq.querySong(), uq.querySong());
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
     * SONG by my SONG_ID, named 'song'.
     * @return The instance of condition-query. (NotNull)
     */
    public SongCQ querySong() {
        return xdfgetConditionQuerySong();
    }
    public SongCQ xdfgetConditionQuerySong() {
        String prop = "song";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySong()); xsetupOuterJoinSong(); }
        return xgetQueRlMap(prop);
    }
    protected SongCQ xcreateQuerySong() {
        String nrp = xresolveNRP("LYRICS_RECOMMENDATION", "song"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SongCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "song", nrp);
    }
    protected void xsetupOuterJoinSong() { xregOutJo("song"); }
    public boolean hasConditionQuerySong() { return xhasQueRlMap("song"); }

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
        String nrp = xresolveNRP("LYRICS_RECOMMENDATION", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, LyricsRecommendationCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LyricsRecommendationCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LyricsRecommendationCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LyricsRecommendationCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LyricsRecommendationCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LyricsRecommendationCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LyricsRecommendationCQ> _myselfExistsMap;
    public Map<String, LyricsRecommendationCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LyricsRecommendationCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LyricsRecommendationCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LyricsRecommendationCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LyricsRecommendationCB.class.getName(); }
    protected String xCQ() { return LyricsRecommendationCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
