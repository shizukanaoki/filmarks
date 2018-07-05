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
 * The abstract condition-query of ALBUM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAlbumCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAlbumCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "ALBUM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from COMMENT where ...)} <br>
     * COMMENT by PRODUCT_ID, named 'commentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsComment</span>(commentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     commentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CommentList for 'exists'. (NotNull)
     */
    public void existsComment(SubQuery<CommentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CommentCB cb = new CommentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_CommentList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "PRODUCT_ID", pp, "commentList");
    }
    public abstract String keepId_ExistsReferrer_CommentList(CommentCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_ID from PICK where ...)} <br>
     * PICK by PRODUCT_ID, named 'pickAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPick</span>(pickCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickList for 'exists'. (NotNull)
     */
    public void existsPick(SubQuery<PickCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PickCB cb = new PickCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_PickList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "PRODUCT_ID", pp, "pickList");
    }
    public abstract String keepId_ExistsReferrer_PickList(PickCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from COMMENT where ...)} <br>
     * COMMENT by PRODUCT_ID, named 'commentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsComment</span>(commentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     commentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_CommentList for 'not exists'. (NotNull)
     */
    public void notExistsComment(SubQuery<CommentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CommentCB cb = new CommentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_CommentList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "PRODUCT_ID", pp, "commentList");
    }
    public abstract String keepId_NotExistsReferrer_CommentList(CommentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_ID from PICK where ...)} <br>
     * PICK by PRODUCT_ID, named 'pickAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPick</span>(pickCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_PickList for 'not exists'. (NotNull)
     */
    public void notExistsPick(SubQuery<PickCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PickCB cb = new PickCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_PickList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "PRODUCT_ID", pp, "pickList");
    }
    public abstract String keepId_NotExistsReferrer_PickList(PickCQ sq);

    public void xsderiveCommentList(String fn, SubQuery<CommentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CommentCB cb = new CommentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_CommentList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "PRODUCT_ID", pp, "commentList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_CommentList(CommentCQ sq);

    public void xsderivePickList(String fn, SubQuery<PickCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PickCB cb = new PickCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_PickList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "PRODUCT_ID", pp, "pickList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_PickList(PickCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from COMMENT where ...)} <br>
     * COMMENT by PRODUCT_ID, named 'commentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedComment()</span>.<span style="color: #CC4747">max</span>(commentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     commentCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     commentCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CommentCB> derivedComment() {
        return xcreateQDRFunctionCommentList();
    }
    protected HpQDRFunction<CommentCB> xcreateQDRFunctionCommentList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCommentList(fn, sq, rd, vl, op));
    }
    public void xqderiveCommentList(String fn, SubQuery<CommentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CommentCB cb = new CommentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_CommentList(cb.query()); String prpp = keepId_QueryDerivedReferrer_CommentListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "PRODUCT_ID", sqpp, "commentList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_CommentList(CommentCQ sq);
    public abstract String keepId_QueryDerivedReferrer_CommentListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from PICK where ...)} <br>
     * PICK by PRODUCT_ID, named 'pickAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPick()</span>.<span style="color: #CC4747">max</span>(pickCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PickCB> derivedPick() {
        return xcreateQDRFunctionPickList();
    }
    protected HpQDRFunction<PickCB> xcreateQDRFunctionPickList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePickList(fn, sq, rd, vl, op));
    }
    public void xqderivePickList(String fn, SubQuery<PickCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PickCB cb = new PickCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_PickList(cb.query()); String prpp = keepId_QueryDerivedReferrer_PickListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "PRODUCT_ID", sqpp, "pickList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_PickList(PickCQ sq);
    public abstract String keepId_QueryDerivedReferrer_PickListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "ID"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_Equal(String title) {
        doSetTitle_Equal(fRES(title));
    }

    protected void doSetTitle_Equal(String title) {
        regTitle(CK_EQ, title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotEqual(String title) {
        doSetTitle_NotEqual(fRES(title));
    }

    protected void doSetTitle_NotEqual(String title) {
        regTitle(CK_NES, title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterThan(String title) {
        regTitle(CK_GT, fRES(title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessThan(String title) {
        regTitle(CK_LT, fRES(title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterEqual(String title) {
        regTitle(CK_GE, fRES(title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessEqual(String title) {
        regTitle(CK_LE, fRES(title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param titleList The collection of title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_InScope(Collection<String> titleList) {
        doSetTitle_InScope(titleList);
    }

    protected void doSetTitle_InScope(Collection<String> titleList) {
        regINS(CK_INS, cTL(titleList), xgetCValueTitle(), "TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param titleList The collection of title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotInScope(Collection<String> titleList) {
        doSetTitle_NotInScope(titleList);
    }

    protected void doSetTitle_NotInScope(Collection<String> titleList) {
        regINS(CK_NINS, cTL(titleList), xgetCValueTitle(), "TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_LikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_LikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTitle_LikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(title), xgetCValueTitle(), "TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_NotLikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_NotLikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTitle_NotLikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(title), xgetCValueTitle(), "TITLE", likeSearchOption);
    }

    protected void regTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTitle(), "TITLE"); }
    protected abstract ConditionValue xgetCValueTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_Equal(String fileName) {
        doSetFileName_Equal(fRES(fileName));
    }

    protected void doSetFileName_Equal(String fileName) {
        regFileName(CK_EQ, fileName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_NotEqual(String fileName) {
        doSetFileName_NotEqual(fRES(fileName));
    }

    protected void doSetFileName_NotEqual(String fileName) {
        regFileName(CK_NES, fileName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_GreaterThan(String fileName) {
        regFileName(CK_GT, fRES(fileName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_LessThan(String fileName) {
        regFileName(CK_LT, fRES(fileName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_GreaterEqual(String fileName) {
        regFileName(CK_GE, fRES(fileName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_LessEqual(String fileName) {
        regFileName(CK_LE, fRES(fileName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileNameList The collection of fileName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_InScope(Collection<String> fileNameList) {
        doSetFileName_InScope(fileNameList);
    }

    protected void doSetFileName_InScope(Collection<String> fileNameList) {
        regINS(CK_INS, cTL(fileNameList), xgetCValueFileName(), "FILE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileNameList The collection of fileName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_NotInScope(Collection<String> fileNameList) {
        doSetFileName_NotInScope(fileNameList);
    }

    protected void doSetFileName_NotInScope(Collection<String> fileNameList) {
        regINS(CK_NINS, cTL(fileNameList), xgetCValueFileName(), "FILE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setFileName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fileName The value of fileName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFileName_LikeSearch(String fileName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFileName_LikeSearch(fileName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setFileName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fileName The value of fileName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFileName_LikeSearch(String fileName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fileName), xgetCValueFileName(), "FILE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFileName_NotLikeSearch(String fileName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFileName_NotLikeSearch(fileName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFileName_NotLikeSearch(String fileName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fileName), xgetCValueFileName(), "FILE_NAME", likeSearchOption);
    }

    protected void regFileName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFileName(), "FILE_NAME"); }
    protected abstract ConditionValue xgetCValueFileName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
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
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
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
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @param artistId The value of artistId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_GreaterThan(Integer artistId) {
        regArtistId(CK_GT, artistId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @param artistId The value of artistId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_LessThan(Integer artistId) {
        regArtistId(CK_LT, artistId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @param artistId The value of artistId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_GreaterEqual(Integer artistId) {
        regArtistId(CK_GE, artistId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @param artistId The value of artistId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArtistId_LessEqual(Integer artistId) {
        regArtistId(CK_LE, artistId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
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
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @param minNumber The min number of artistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of artistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setArtistId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArtistId(), "ARTIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
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
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     * @param artistIdList The collection of artistId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArtistId_NotInScope(Collection<Integer> artistIdList) {
        doSetArtistId_NotInScope(artistIdList);
    }

    protected void doSetArtistId_NotInScope(Collection<Integer> artistIdList) {
        regINS(CK_NINS, cTL(artistIdList), xgetCValueArtistId(), "ARTIST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     */
    public void setArtistId_IsNull() { regArtistId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARTIST_ID: {IX, INT(10), FK to ARTIST}
     */
    public void setArtistId_IsNotNull() { regArtistId(CK_ISNN, DOBJ); }

    protected void regArtistId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArtistId(), "ARTIST_ID"); }
    protected abstract ConditionValue xgetCValueArtistId();

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
    public HpSLCFunction<AlbumCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, AlbumCB.class);
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
    public HpSLCFunction<AlbumCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, AlbumCB.class);
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
    public HpSLCFunction<AlbumCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, AlbumCB.class);
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
    public HpSLCFunction<AlbumCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, AlbumCB.class);
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
    public HpSLCFunction<AlbumCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, AlbumCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AlbumCB&gt;() {
     *     public void query(AlbumCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AlbumCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, AlbumCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        AlbumCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(AlbumCQ sq);

    protected AlbumCB xcreateScalarConditionCB() {
        AlbumCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AlbumCB xcreateScalarConditionPartitionByCB() {
        AlbumCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AlbumCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AlbumCB cb = new AlbumCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AlbumCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AlbumCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AlbumCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AlbumCB cb = new AlbumCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AlbumCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<AlbumCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AlbumCB cb = new AlbumCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AlbumCQ sq);

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
    protected AlbumCB newMyCB() {
        return new AlbumCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AlbumCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}