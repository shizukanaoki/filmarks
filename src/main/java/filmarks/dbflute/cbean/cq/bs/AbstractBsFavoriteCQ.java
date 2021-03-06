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
 * The abstract condition-query of FAVORITE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsFavoriteCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsFavoriteCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "FAVORITE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param favoriteId The value of favoriteId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteId_Equal(Integer favoriteId) {
        doSetFavoriteId_Equal(favoriteId);
    }

    protected void doSetFavoriteId_Equal(Integer favoriteId) {
        regFavoriteId(CK_EQ, favoriteId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param favoriteId The value of favoriteId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteId_NotEqual(Integer favoriteId) {
        doSetFavoriteId_NotEqual(favoriteId);
    }

    protected void doSetFavoriteId_NotEqual(Integer favoriteId) {
        regFavoriteId(CK_NES, favoriteId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param favoriteId The value of favoriteId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteId_GreaterThan(Integer favoriteId) {
        regFavoriteId(CK_GT, favoriteId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param favoriteId The value of favoriteId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteId_LessThan(Integer favoriteId) {
        regFavoriteId(CK_LT, favoriteId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param favoriteId The value of favoriteId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteId_GreaterEqual(Integer favoriteId) {
        regFavoriteId(CK_GE, favoriteId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param favoriteId The value of favoriteId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteId_LessEqual(Integer favoriteId) {
        regFavoriteId(CK_LE, favoriteId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of favoriteId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of favoriteId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFavoriteId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFavoriteId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of favoriteId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of favoriteId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFavoriteId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFavoriteId(), "FAVORITE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param favoriteIdList The collection of favoriteId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFavoriteId_InScope(Collection<Integer> favoriteIdList) {
        doSetFavoriteId_InScope(favoriteIdList);
    }

    protected void doSetFavoriteId_InScope(Collection<Integer> favoriteIdList) {
        regINS(CK_INS, cTL(favoriteIdList), xgetCValueFavoriteId(), "FAVORITE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     * @param favoriteIdList The collection of favoriteId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFavoriteId_NotInScope(Collection<Integer> favoriteIdList) {
        doSetFavoriteId_NotInScope(favoriteIdList);
    }

    protected void doSetFavoriteId_NotInScope(Collection<Integer> favoriteIdList) {
        regINS(CK_NINS, cTL(favoriteIdList), xgetCValueFavoriteId(), "FAVORITE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TARGET_ID from POST where ...)} <br>
     * POST by TARGET_ID, named 'postAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPost</span>(postCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     postCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PostList for 'exists'. (NotNull)
     */
    public void existsPost(SubQuery<PostCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PostCB cb = new PostCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepFavoriteId_ExistsReferrer_PostList(cb.query());
        registerExistsReferrer(cb.query(), "FAVORITE_ID", "TARGET_ID", pp, "postList");
    }
    public abstract String keepFavoriteId_ExistsReferrer_PostList(PostCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TARGET_ID from POST where ...)} <br>
     * POST by TARGET_ID, named 'postAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPost</span>(postCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     postCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FavoriteId_NotExistsReferrer_PostList for 'not exists'. (NotNull)
     */
    public void notExistsPost(SubQuery<PostCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PostCB cb = new PostCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepFavoriteId_NotExistsReferrer_PostList(cb.query());
        registerNotExistsReferrer(cb.query(), "FAVORITE_ID", "TARGET_ID", pp, "postList");
    }
    public abstract String keepFavoriteId_NotExistsReferrer_PostList(PostCQ sq);

    public void xsderivePostList(String fn, SubQuery<PostCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCB cb = new PostCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepFavoriteId_SpecifyDerivedReferrer_PostList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "FAVORITE_ID", "TARGET_ID", pp, "postList", al, op);
    }
    public abstract String keepFavoriteId_SpecifyDerivedReferrer_PostList(PostCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from POST where ...)} <br>
     * POST by TARGET_ID, named 'postAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPost()</span>.<span style="color: #CC4747">max</span>(postCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     postCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     postCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PostCB> derivedPost() {
        return xcreateQDRFunctionPostList();
    }
    protected HpQDRFunction<PostCB> xcreateQDRFunctionPostList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePostList(fn, sq, rd, vl, op));
    }
    public void xqderivePostList(String fn, SubQuery<PostCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCB cb = new PostCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepFavoriteId_QueryDerivedReferrer_PostList(cb.query()); String prpp = keepFavoriteId_QueryDerivedReferrer_PostListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "FAVORITE_ID", "TARGET_ID", sqpp, "postList", rd, vl, prpp, op);
    }
    public abstract String keepFavoriteId_QueryDerivedReferrer_PostList(PostCQ sq);
    public abstract String keepFavoriteId_QueryDerivedReferrer_PostListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setFavoriteId_IsNull() { regFavoriteId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FAVORITE_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setFavoriteId_IsNotNull() { regFavoriteId(CK_ISNN, DOBJ); }

    protected void regFavoriteId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFavoriteId(), "FAVORITE_ID"); }
    protected abstract ConditionValue xgetCValueFavoriteId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {UQ+, NotNull, INT(10), FK to USER}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_Equal(Integer albumId) {
        doSetAlbumId_Equal(albumId);
    }

    protected void doSetAlbumId_Equal(Integer albumId) {
        regAlbumId(CK_EQ, albumId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_NotEqual(Integer albumId) {
        doSetAlbumId_NotEqual(albumId);
    }

    protected void doSetAlbumId_NotEqual(Integer albumId) {
        regAlbumId(CK_NES, albumId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_GreaterThan(Integer albumId) {
        regAlbumId(CK_GT, albumId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_LessThan(Integer albumId) {
        regAlbumId(CK_LT, albumId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_GreaterEqual(Integer albumId) {
        regAlbumId(CK_GE, albumId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_LessEqual(Integer albumId) {
        regAlbumId(CK_LE, albumId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param minNumber The min number of albumId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of albumId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAlbumId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAlbumId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param minNumber The min number of albumId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of albumId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAlbumId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlbumId(), "ALBUM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param albumIdList The collection of albumId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumId_InScope(Collection<Integer> albumIdList) {
        doSetAlbumId_InScope(albumIdList);
    }

    protected void doSetAlbumId_InScope(Collection<Integer> albumIdList) {
        regINS(CK_INS, cTL(albumIdList), xgetCValueAlbumId(), "ALBUM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALBUM_ID: {+UQ, IX, NotNull, INT(10), FK to ALBUM}
     * @param albumIdList The collection of albumId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumId_NotInScope(Collection<Integer> albumIdList) {
        doSetAlbumId_NotInScope(albumIdList);
    }

    protected void doSetAlbumId_NotInScope(Collection<Integer> albumIdList) {
        regINS(CK_NINS, cTL(albumIdList), xgetCValueAlbumId(), "ALBUM_ID");
    }

    protected void regAlbumId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlbumId(), "ALBUM_ID"); }
    protected abstract ConditionValue xgetCValueAlbumId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_CREATED_AT: {NotNull, DATETIME(19)}
     * @param favoriteCreatedAt The value of favoriteCreatedAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteCreatedAt_Equal(java.time.LocalDateTime favoriteCreatedAt) {
        regFavoriteCreatedAt(CK_EQ,  favoriteCreatedAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_CREATED_AT: {NotNull, DATETIME(19)}
     * @param favoriteCreatedAt The value of favoriteCreatedAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteCreatedAt_GreaterThan(java.time.LocalDateTime favoriteCreatedAt) {
        regFavoriteCreatedAt(CK_GT,  favoriteCreatedAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_CREATED_AT: {NotNull, DATETIME(19)}
     * @param favoriteCreatedAt The value of favoriteCreatedAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteCreatedAt_LessThan(java.time.LocalDateTime favoriteCreatedAt) {
        regFavoriteCreatedAt(CK_LT,  favoriteCreatedAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_CREATED_AT: {NotNull, DATETIME(19)}
     * @param favoriteCreatedAt The value of favoriteCreatedAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteCreatedAt_GreaterEqual(java.time.LocalDateTime favoriteCreatedAt) {
        regFavoriteCreatedAt(CK_GE,  favoriteCreatedAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_CREATED_AT: {NotNull, DATETIME(19)}
     * @param favoriteCreatedAt The value of favoriteCreatedAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFavoriteCreatedAt_LessEqual(java.time.LocalDateTime favoriteCreatedAt) {
        regFavoriteCreatedAt(CK_LE, favoriteCreatedAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_CREATED_AT: {NotNull, DATETIME(19)}
     * <pre>e.g. setFavoriteCreatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of favoriteCreatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of favoriteCreatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setFavoriteCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setFavoriteCreatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_CREATED_AT: {NotNull, DATETIME(19)}
     * <pre>e.g. setFavoriteCreatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of favoriteCreatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of favoriteCreatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setFavoriteCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "FAVORITE_CREATED_AT"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueFavoriteCreatedAt(), nm, op);
    }

    protected void regFavoriteCreatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFavoriteCreatedAt(), "FAVORITE_CREATED_AT"); }
    protected abstract ConditionValue xgetCValueFavoriteCreatedAt();

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
    public HpSLCFunction<FavoriteCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, FavoriteCB.class);
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
    public HpSLCFunction<FavoriteCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, FavoriteCB.class);
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
    public HpSLCFunction<FavoriteCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, FavoriteCB.class);
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
    public HpSLCFunction<FavoriteCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, FavoriteCB.class);
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
    public HpSLCFunction<FavoriteCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, FavoriteCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;FavoriteCB&gt;() {
     *     public void query(FavoriteCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<FavoriteCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, FavoriteCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoriteCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(FavoriteCQ sq);

    protected FavoriteCB xcreateScalarConditionCB() {
        FavoriteCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected FavoriteCB xcreateScalarConditionPartitionByCB() {
        FavoriteCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<FavoriteCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "FAVORITE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(FavoriteCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<FavoriteCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(FavoriteCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "FAVORITE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(FavoriteCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<FavoriteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(FavoriteCQ sq);

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
    protected FavoriteCB newMyCB() {
        return new FavoriteCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return FavoriteCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
