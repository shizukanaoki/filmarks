package filmarks.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import filmarks.dbflute.allcommon.*;
import filmarks.dbflute.cbean.*;
import filmarks.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of ARTIST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsArtistCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsArtistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "ARTIST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param artistId The value of artistId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_Equal(Integer artistId) {
        doSetArtistId_Equal(artistId);
    }

    protected void doSetArtistId_Equal(Integer artistId) {
        regArtistId(CK_EQ, artistId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param artistId The value of artistId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_NotEqual(Integer artistId) {
        doSetArtistId_NotEqual(artistId);
    }

    protected void doSetArtistId_NotEqual(Integer artistId) {
        regArtistId(CK_NES, artistId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param artistId The value of artistId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_GreaterThan(Integer artistId) {
        regArtistId(CK_GT, artistId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param artistId The value of artistId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_LessThan(Integer artistId) {
        regArtistId(CK_LT, artistId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param artistId The value of artistId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_GreaterEqual(Integer artistId) {
        regArtistId(CK_GE, artistId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param artistId The value of artistId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_LessEqual(Integer artistId) {
        regArtistId(CK_LE, artistId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of artistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of artistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setArtistId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setArtistId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of artistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of artistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setArtistId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArtistId(), "ARTIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param artistIdList The collection of artistId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistId_InScope(Collection<Integer> artistIdList) {
        doSetArtistId_InScope(artistIdList);
    }

    protected void doSetArtistId_InScope(Collection<Integer> artistIdList) {
        regINS(CK_INS, cTL(artistIdList), xgetCValueArtistId(), "ARTIST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     * @param artistIdList The collection of artistId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistId_NotInScope(Collection<Integer> artistIdList) {
        doSetArtistId_NotInScope(artistIdList);
    }

    protected void doSetArtistId_NotInScope(Collection<Integer> artistIdList) {
        regINS(CK_NINS, cTL(artistIdList), xgetCValueArtistId(), "ARTIST_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ARTIST_ID from ALBUM where ...)} <br>
     * ALBUM by ARTIST_ID, named 'albumAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsAlbum</span>(albumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     albumCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AlbumList for 'exists'. (NotNull)
     */
    public void existsAlbum(SubQuery<AlbumCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AlbumCB cb = new AlbumCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepArtistId_ExistsReferrer_AlbumList(cb.query());
        registerExistsReferrer(cb.query(), "ARTIST_ID", "ARTIST_ID", pp, "albumList");
    }
    public abstract String keepArtistId_ExistsReferrer_AlbumList(AlbumCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ARTIST_ID from ALBUM where ...)} <br>
     * ALBUM by ARTIST_ID, named 'albumAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsAlbum</span>(albumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     albumCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ArtistId_NotExistsReferrer_AlbumList for 'not exists'. (NotNull)
     */
    public void notExistsAlbum(SubQuery<AlbumCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AlbumCB cb = new AlbumCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepArtistId_NotExistsReferrer_AlbumList(cb.query());
        registerNotExistsReferrer(cb.query(), "ARTIST_ID", "ARTIST_ID", pp, "albumList");
    }
    public abstract String keepArtistId_NotExistsReferrer_AlbumList(AlbumCQ sq);

    public void xsderiveAlbumList(String fn, SubQuery<AlbumCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AlbumCB cb = new AlbumCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepArtistId_SpecifyDerivedReferrer_AlbumList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ARTIST_ID", "ARTIST_ID", pp, "albumList", al, op);
    }
    public abstract String keepArtistId_SpecifyDerivedReferrer_AlbumList(AlbumCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ALBUM where ...)} <br>
     * ALBUM by ARTIST_ID, named 'albumAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedAlbum()</span>.<span style="color: #CC4747">max</span>(albumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     albumCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     albumCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<AlbumCB> derivedAlbum() {
        return xcreateQDRFunctionAlbumList();
    }
    protected HpQDRFunction<AlbumCB> xcreateQDRFunctionAlbumList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveAlbumList(fn, sq, rd, vl, op));
    }
    public void xqderiveAlbumList(String fn, SubQuery<AlbumCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AlbumCB cb = new AlbumCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepArtistId_QueryDerivedReferrer_AlbumList(cb.query()); String prpp = keepArtistId_QueryDerivedReferrer_AlbumListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ARTIST_ID", "ARTIST_ID", sqpp, "albumList", rd, vl, prpp, op);
    }
    public abstract String keepArtistId_QueryDerivedReferrer_AlbumList(AlbumCQ sq);
    public abstract String keepArtistId_QueryDerivedReferrer_AlbumListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setArtistId_IsNull() { regArtistId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARTIST_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setArtistId_IsNotNull() { regArtistId(CK_ISNN, DOBJ); }

    protected void regArtistId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArtistId(), "ARTIST_ID"); }
    protected abstract ConditionValue xgetCValueArtistId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistName The value of artistName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistName_Equal(String artistName) {
        doSetArtistName_Equal(fRES(artistName));
    }

    protected void doSetArtistName_Equal(String artistName) {
        regArtistName(CK_EQ, artistName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistName The value of artistName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistName_NotEqual(String artistName) {
        doSetArtistName_NotEqual(fRES(artistName));
    }

    protected void doSetArtistName_NotEqual(String artistName) {
        regArtistName(CK_NES, artistName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistName The value of artistName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistName_GreaterThan(String artistName) {
        regArtistName(CK_GT, fRES(artistName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistName The value of artistName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistName_LessThan(String artistName) {
        regArtistName(CK_LT, fRES(artistName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistName The value of artistName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistName_GreaterEqual(String artistName) {
        regArtistName(CK_GE, fRES(artistName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistName The value of artistName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistName_LessEqual(String artistName) {
        regArtistName(CK_LE, fRES(artistName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistNameList The collection of artistName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistName_InScope(Collection<String> artistNameList) {
        doSetArtistName_InScope(artistNameList);
    }

    protected void doSetArtistName_InScope(Collection<String> artistNameList) {
        regINS(CK_INS, cTL(artistNameList), xgetCValueArtistName(), "ARTIST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistNameList The collection of artistName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistName_NotInScope(Collection<String> artistNameList) {
        doSetArtistName_NotInScope(artistNameList);
    }

    protected void doSetArtistName_NotInScope(Collection<String> artistNameList) {
        regINS(CK_NINS, cTL(artistNameList), xgetCValueArtistName(), "ARTIST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setArtistName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param artistName The value of artistName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArtistName_LikeSearch(String artistName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArtistName_LikeSearch(artistName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setArtistName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param artistName The value of artistName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setArtistName_LikeSearch(String artistName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(artistName), xgetCValueArtistName(), "ARTIST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistName The value of artistName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArtistName_NotLikeSearch(String artistName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArtistName_NotLikeSearch(artistName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTIST_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param artistName The value of artistName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setArtistName_NotLikeSearch(String artistName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(artistName), xgetCValueArtistName(), "ARTIST_NAME", likeSearchOption);
    }

    protected void regArtistName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArtistName(), "ARTIST_NAME"); }
    protected abstract ConditionValue xgetCValueArtistName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ArtistCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ArtistCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ArtistCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ArtistCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ArtistCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ArtistCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ArtistCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ArtistCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ArtistCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ArtistCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ArtistCB&gt;() {
     *     public void query(ArtistCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ArtistCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ArtistCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ArtistCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ArtistCQ sq);

    protected ArtistCB xcreateScalarConditionCB() {
        ArtistCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ArtistCB xcreateScalarConditionPartitionByCB() {
        ArtistCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ArtistCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArtistCB cb = new ArtistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ARTIST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ArtistCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ArtistCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ArtistCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArtistCB cb = new ArtistCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ARTIST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ArtistCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ArtistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ArtistCB cb = new ArtistCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ArtistCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ArtistCB newMyCB() {
        return new ArtistCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ArtistCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
