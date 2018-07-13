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
 * The abstract condition-query of COMMENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCommentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCommentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COMMENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param commentId The value of commentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentId_Equal(Integer commentId) {
        doSetCommentId_Equal(commentId);
    }

    protected void doSetCommentId_Equal(Integer commentId) {
        regCommentId(CK_EQ, commentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param commentId The value of commentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentId_NotEqual(Integer commentId) {
        doSetCommentId_NotEqual(commentId);
    }

    protected void doSetCommentId_NotEqual(Integer commentId) {
        regCommentId(CK_NES, commentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param commentId The value of commentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentId_GreaterThan(Integer commentId) {
        regCommentId(CK_GT, commentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param commentId The value of commentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentId_LessThan(Integer commentId) {
        regCommentId(CK_LT, commentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param commentId The value of commentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentId_GreaterEqual(Integer commentId) {
        regCommentId(CK_GE, commentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param commentId The value of commentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentId_LessEqual(Integer commentId) {
        regCommentId(CK_LE, commentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of commentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of commentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCommentId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCommentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of commentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of commentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCommentId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCommentId(), "COMMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param commentIdList The collection of commentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommentId_InScope(Collection<Integer> commentIdList) {
        doSetCommentId_InScope(commentIdList);
    }

    protected void doSetCommentId_InScope(Collection<Integer> commentIdList) {
        regINS(CK_INS, cTL(commentIdList), xgetCValueCommentId(), "COMMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     * @param commentIdList The collection of commentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommentId_NotInScope(Collection<Integer> commentIdList) {
        doSetCommentId_NotInScope(commentIdList);
    }

    protected void doSetCommentId_NotInScope(Collection<Integer> commentIdList) {
        regINS(CK_NINS, cTL(commentIdList), xgetCValueCommentId(), "COMMENT_ID");
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCommentId_ExistsReferrer_PostList(cb.query());
        registerExistsReferrer(cb.query(), "COMMENT_ID", "TARGET_ID", pp, "postList");
    }
    public abstract String keepCommentId_ExistsReferrer_PostList(PostCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TARGET_ID from POST where ...)} <br>
     * POST by TARGET_ID, named 'postAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPost</span>(postCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     postCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CommentId_NotExistsReferrer_PostList for 'not exists'. (NotNull)
     */
    public void notExistsPost(SubQuery<PostCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PostCB cb = new PostCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCommentId_NotExistsReferrer_PostList(cb.query());
        registerNotExistsReferrer(cb.query(), "COMMENT_ID", "TARGET_ID", pp, "postList");
    }
    public abstract String keepCommentId_NotExistsReferrer_PostList(PostCQ sq);

    public void xsderivePostList(String fn, SubQuery<PostCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCB cb = new PostCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCommentId_SpecifyDerivedReferrer_PostList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COMMENT_ID", "TARGET_ID", pp, "postList", al, op);
    }
    public abstract String keepCommentId_SpecifyDerivedReferrer_PostList(PostCQ sq);

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
        lockCall(() -> sq.query(cb)); String sqpp = keepCommentId_QueryDerivedReferrer_PostList(cb.query()); String prpp = keepCommentId_QueryDerivedReferrer_PostListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COMMENT_ID", "TARGET_ID", sqpp, "postList", rd, vl, prpp, op);
    }
    public abstract String keepCommentId_QueryDerivedReferrer_PostList(PostCQ sq);
    public abstract String keepCommentId_QueryDerivedReferrer_PostListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setCommentId_IsNull() { regCommentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMENT_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setCommentId_IsNotNull() { regCommentId(CK_ISNN, DOBJ); }

    protected void regCommentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommentId(), "COMMENT_ID"); }
    protected abstract ConditionValue xgetCValueCommentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
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
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
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
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
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
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
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
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
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
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
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
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
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
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_GreaterThan(Integer albumId) {
        regAlbumId(CK_GT, albumId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_LessThan(Integer albumId) {
        regAlbumId(CK_LT, albumId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_GreaterEqual(Integer albumId) {
        regAlbumId(CK_GE, albumId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @param albumId The value of albumId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_LessEqual(Integer albumId) {
        regAlbumId(CK_LE, albumId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
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
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
     * @param minNumber The min number of albumId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of albumId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAlbumId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlbumId(), "ALBUM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
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
     * ALBUM_ID: {IX, NotNull, INT(10), FK to ALBUM}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param content The value of content as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContent_Equal(String content) {
        doSetContent_Equal(fRES(content));
    }

    protected void doSetContent_Equal(String content) {
        regContent(CK_EQ, content);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param content The value of content as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContent_NotEqual(String content) {
        doSetContent_NotEqual(fRES(content));
    }

    protected void doSetContent_NotEqual(String content) {
        regContent(CK_NES, content);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param content The value of content as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContent_GreaterThan(String content) {
        regContent(CK_GT, fRES(content));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param content The value of content as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContent_LessThan(String content) {
        regContent(CK_LT, fRES(content));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param content The value of content as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContent_GreaterEqual(String content) {
        regContent(CK_GE, fRES(content));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param content The value of content as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContent_LessEqual(String content) {
        regContent(CK_LE, fRES(content));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param contentList The collection of content as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContent_InScope(Collection<String> contentList) {
        doSetContent_InScope(contentList);
    }

    protected void doSetContent_InScope(Collection<String> contentList) {
        regINS(CK_INS, cTL(contentList), xgetCValueContent(), "CONTENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param contentList The collection of content as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContent_NotInScope(Collection<String> contentList) {
        doSetContent_NotInScope(contentList);
    }

    protected void doSetContent_NotInScope(Collection<String> contentList) {
        regINS(CK_NINS, cTL(contentList), xgetCValueContent(), "CONTENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setContent_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param content The value of content as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setContent_LikeSearch(String content, ConditionOptionCall<LikeSearchOption> opLambda) {
        setContent_LikeSearch(content, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setContent_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param content The value of content as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setContent_LikeSearch(String content, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(content), xgetCValueContent(), "CONTENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param content The value of content as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setContent_NotLikeSearch(String content, ConditionOptionCall<LikeSearchOption> opLambda) {
        setContent_NotLikeSearch(content, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTENT: {NotNull, TEXT(65535)}
     * @param content The value of content as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setContent_NotLikeSearch(String content, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(content), xgetCValueContent(), "CONTENT", likeSearchOption);
    }

    protected void regContent(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueContent(), "CONTENT"); }
    protected abstract ConditionValue xgetCValueContent();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param rate The value of rate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRate_Equal(java.math.BigDecimal rate) {
        doSetRate_Equal(rate);
    }

    protected void doSetRate_Equal(java.math.BigDecimal rate) {
        regRate(CK_EQ, rate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param rate The value of rate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRate_NotEqual(java.math.BigDecimal rate) {
        doSetRate_NotEqual(rate);
    }

    protected void doSetRate_NotEqual(java.math.BigDecimal rate) {
        regRate(CK_NES, rate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param rate The value of rate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRate_GreaterThan(java.math.BigDecimal rate) {
        regRate(CK_GT, rate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param rate The value of rate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRate_LessThan(java.math.BigDecimal rate) {
        regRate(CK_LT, rate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param rate The value of rate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRate_GreaterEqual(java.math.BigDecimal rate) {
        regRate(CK_GE, rate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param rate The value of rate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRate_LessEqual(java.math.BigDecimal rate) {
        regRate(CK_LE, rate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param minNumber The min number of rate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRate_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRate_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param minNumber The min number of rate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRate_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRate(), "RATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param rateList The collection of rate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRate_InScope(Collection<java.math.BigDecimal> rateList) {
        doSetRate_InScope(rateList);
    }

    protected void doSetRate_InScope(Collection<java.math.BigDecimal> rateList) {
        regINS(CK_INS, cTL(rateList), xgetCValueRate(), "RATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RATE: {NotNull, FLOAT(12)}
     * @param rateList The collection of rate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRate_NotInScope(Collection<java.math.BigDecimal> rateList) {
        doSetRate_NotInScope(rateList);
    }

    protected void doSetRate_NotInScope(Collection<java.math.BigDecimal> rateList) {
        regINS(CK_NINS, cTL(rateList), xgetCValueRate(), "RATE");
    }

    protected void regRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRate(), "RATE"); }
    protected abstract ConditionValue xgetCValueRate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_CREATED_AT: {NotNull, DATETIME(19)}
     * @param commentCreatedAt The value of commentCreatedAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentCreatedAt_Equal(java.time.LocalDateTime commentCreatedAt) {
        regCommentCreatedAt(CK_EQ,  commentCreatedAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_CREATED_AT: {NotNull, DATETIME(19)}
     * @param commentCreatedAt The value of commentCreatedAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentCreatedAt_GreaterThan(java.time.LocalDateTime commentCreatedAt) {
        regCommentCreatedAt(CK_GT,  commentCreatedAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_CREATED_AT: {NotNull, DATETIME(19)}
     * @param commentCreatedAt The value of commentCreatedAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentCreatedAt_LessThan(java.time.LocalDateTime commentCreatedAt) {
        regCommentCreatedAt(CK_LT,  commentCreatedAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_CREATED_AT: {NotNull, DATETIME(19)}
     * @param commentCreatedAt The value of commentCreatedAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentCreatedAt_GreaterEqual(java.time.LocalDateTime commentCreatedAt) {
        regCommentCreatedAt(CK_GE,  commentCreatedAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_CREATED_AT: {NotNull, DATETIME(19)}
     * @param commentCreatedAt The value of commentCreatedAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommentCreatedAt_LessEqual(java.time.LocalDateTime commentCreatedAt) {
        regCommentCreatedAt(CK_LE, commentCreatedAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_CREATED_AT: {NotNull, DATETIME(19)}
     * <pre>e.g. setCommentCreatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of commentCreatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of commentCreatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCommentCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCommentCreatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMENT_CREATED_AT: {NotNull, DATETIME(19)}
     * <pre>e.g. setCommentCreatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of commentCreatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of commentCreatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCommentCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "COMMENT_CREATED_AT"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCommentCreatedAt(), nm, op);
    }

    protected void regCommentCreatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommentCreatedAt(), "COMMENT_CREATED_AT"); }
    protected abstract ConditionValue xgetCValueCommentCreatedAt();

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
    public HpSLCFunction<CommentCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CommentCB.class);
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
    public HpSLCFunction<CommentCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CommentCB.class);
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
    public HpSLCFunction<CommentCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CommentCB.class);
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
    public HpSLCFunction<CommentCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CommentCB.class);
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
    public HpSLCFunction<CommentCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CommentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CommentCB&gt;() {
     *     public void query(CommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CommentCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CommentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CommentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CommentCQ sq);

    protected CommentCB xcreateScalarConditionCB() {
        CommentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CommentCB xcreateScalarConditionPartitionByCB() {
        CommentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CommentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CommentCB cb = new CommentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COMMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CommentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CommentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CommentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CommentCB cb = new CommentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COMMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CommentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CommentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CommentCB cb = new CommentCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CommentCQ sq);

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
    protected CommentCB newMyCB() {
        return new CommentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CommentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
