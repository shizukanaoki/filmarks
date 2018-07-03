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
 * The base condition-query of ALBUM.
 * @author DBFlute(AutoGenerator)
 */
public class BsAlbumCQ extends AbstractBsAlbumCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AlbumCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAlbumCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from ALBUM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AlbumCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AlbumCIQ xcreateCIQ() {
        AlbumCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AlbumCIQ xnewCIQ() {
        return new AlbumCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join ALBUM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AlbumCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AlbumCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    public Map<String, CommentCQ> xdfgetId_NotExistsReferrer_CommentList() { return xgetSQueMap("id_NotExistsReferrer_CommentList"); }
    public String keepId_NotExistsReferrer_CommentList(CommentCQ sq) { return xkeepSQue("id_NotExistsReferrer_CommentList", sq); }

    public Map<String, PickCQ> xdfgetId_NotExistsReferrer_PickList() { return xgetSQueMap("id_NotExistsReferrer_PickList"); }
    public String keepId_NotExistsReferrer_PickList(PickCQ sq) { return xkeepSQue("id_NotExistsReferrer_PickList", sq); }

    public Map<String, CommentCQ> xdfgetId_SpecifyDerivedReferrer_CommentList() { return xgetSQueMap("id_SpecifyDerivedReferrer_CommentList"); }
    public String keepId_SpecifyDerivedReferrer_CommentList(CommentCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_CommentList", sq); }

    public Map<String, PickCQ> xdfgetId_SpecifyDerivedReferrer_PickList() { return xgetSQueMap("id_SpecifyDerivedReferrer_PickList"); }
    public String keepId_SpecifyDerivedReferrer_PickList(PickCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_PickList", sq); }

    public Map<String, CommentCQ> xdfgetId_QueryDerivedReferrer_CommentList() { return xgetSQueMap("id_QueryDerivedReferrer_CommentList"); }
    public String keepId_QueryDerivedReferrer_CommentList(CommentCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_CommentList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_CommentListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_CommentList"); }
    public String keepId_QueryDerivedReferrer_CommentListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_CommentList", pm); }

    public Map<String, PickCQ> xdfgetId_QueryDerivedReferrer_PickList() { return xgetSQueMap("id_QueryDerivedReferrer_PickList"); }
    public String keepId_QueryDerivedReferrer_PickList(PickCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_PickList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_PickListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_PickList"); }
    public String keepId_QueryDerivedReferrer_PickListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_PickList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAlbumCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAlbumCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _title;
    public ConditionValue xdfgetTitle()
    { if (_title == null) { _title = nCV(); }
      return _title; }
    protected ConditionValue xgetCValueTitle() { return xdfgetTitle(); }

    /**
     * Add order-by as ascend. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsAlbumCQ addOrderBy_Title_Asc() { regOBA("TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsAlbumCQ addOrderBy_Title_Desc() { regOBD("TITLE"); return this; }

    protected ConditionValue _fileName;
    public ConditionValue xdfgetFileName()
    { if (_fileName == null) { _fileName = nCV(); }
      return _fileName; }
    protected ConditionValue xgetCValueFileName() { return xdfgetFileName(); }

    /**
     * Add order-by as ascend. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAlbumCQ addOrderBy_FileName_Asc() { regOBA("FILE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsAlbumCQ addOrderBy_FileName_Desc() { regOBD("FILE_NAME"); return this; }

    protected ConditionValue _artistId;
    public ConditionValue xdfgetArtistId()
    { if (_artistId == null) { _artistId = nCV(); }
      return _artistId; }
    protected ConditionValue xgetCValueArtistId() { return xdfgetArtistId(); }

    /**
     * Add order-by as ascend. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @return this. (NotNull)
     */
    public BsAlbumCQ addOrderBy_ArtistId_Asc() { regOBA("ARTIST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @return this. (NotNull)
     */
    public BsAlbumCQ addOrderBy_ArtistId_Desc() { regOBD("ARTIST_ID"); return this; }

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
    public BsAlbumCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAlbumCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        AlbumCQ bq = (AlbumCQ)bqs;
        AlbumCQ uq = (AlbumCQ)uqs;
        if (bq.hasConditionQueryArtist()) {
            uq.queryArtist().reflectRelationOnUnionQuery(bq.queryArtist(), uq.queryArtist());
        }
        if (bq.hasConditionQuerySongAsOne()) {
            uq.querySongAsOne().reflectRelationOnUnionQuery(bq.querySongAsOne(), uq.querySongAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * ARTIST by my ARTIST_ID, named 'artist'.
     * @return The instance of condition-query. (NotNull)
     */
    public ArtistCQ queryArtist() {
        return xdfgetConditionQueryArtist();
    }
    public ArtistCQ xdfgetConditionQueryArtist() {
        String prop = "artist";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryArtist()); xsetupOuterJoinArtist(); }
        return xgetQueRlMap(prop);
    }
    protected ArtistCQ xcreateQueryArtist() {
        String nrp = xresolveNRP("ALBUM", "artist"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ArtistCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "artist", nrp);
    }
    protected void xsetupOuterJoinArtist() { xregOutJo("artist"); }
    public boolean hasConditionQueryArtist() { return xhasQueRlMap("artist"); }

    /**
     * Get the condition-query for relation table. <br>
     * SONG by ID, named 'songAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public SongCQ querySongAsOne() { return xdfgetConditionQuerySongAsOne(); }
    public SongCQ xdfgetConditionQuerySongAsOne() {
        String prop = "songAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySongAsOne()); xsetupOuterJoinSongAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected SongCQ xcreateQuerySongAsOne() {
        String nrp = xresolveNRP("ALBUM", "songAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SongCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "songAsOne", nrp);
    }
    protected void xsetupOuterJoinSongAsOne() { xregOutJo("songAsOne"); }
    public boolean hasConditionQuerySongAsOne() { return xhasQueRlMap("songAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, AlbumCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AlbumCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AlbumCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AlbumCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AlbumCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AlbumCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AlbumCQ> _myselfExistsMap;
    public Map<String, AlbumCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AlbumCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AlbumCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AlbumCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AlbumCB.class.getName(); }
    protected String xCQ() { return AlbumCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
