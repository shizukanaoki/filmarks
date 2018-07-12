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
 * The abstract condition-query of SONG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSongCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSongCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SONG";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param songId The value of songId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSongId_Equal(Integer songId) {
        doSetSongId_Equal(songId);
    }

    protected void doSetSongId_Equal(Integer songId) {
        regSongId(CK_EQ, songId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param songId The value of songId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSongId_NotEqual(Integer songId) {
        doSetSongId_NotEqual(songId);
    }

    protected void doSetSongId_NotEqual(Integer songId) {
        regSongId(CK_NES, songId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param songId The value of songId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSongId_GreaterThan(Integer songId) {
        regSongId(CK_GT, songId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param songId The value of songId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSongId_LessThan(Integer songId) {
        regSongId(CK_LT, songId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param songId The value of songId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSongId_GreaterEqual(Integer songId) {
        regSongId(CK_GE, songId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param songId The value of songId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSongId_LessEqual(Integer songId) {
        regSongId(CK_LE, songId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of songId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of songId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSongId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSongId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of songId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of songId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSongId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSongId(), "SONG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param songIdList The collection of songId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongId_InScope(Collection<Integer> songIdList) {
        doSetSongId_InScope(songIdList);
    }

    protected void doSetSongId_InScope(Collection<Integer> songIdList) {
        regINS(CK_INS, cTL(songIdList), xgetCValueSongId(), "SONG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     * @param songIdList The collection of songId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongId_NotInScope(Collection<Integer> songIdList) {
        doSetSongId_NotInScope(songIdList);
    }

    protected void doSetSongId_NotInScope(Collection<Integer> songIdList) {
        regINS(CK_NINS, cTL(songIdList), xgetCValueSongId(), "SONG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setSongId_IsNull() { regSongId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SONG_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setSongId_IsNotNull() { regSongId(CK_ISNN, DOBJ); }

    protected void regSongId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSongId(), "SONG_ID"); }
    protected abstract ConditionValue xgetCValueSongId();

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
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitle The value of songTitle as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongTitle_Equal(String songTitle) {
        doSetSongTitle_Equal(fRES(songTitle));
    }

    protected void doSetSongTitle_Equal(String songTitle) {
        regSongTitle(CK_EQ, songTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitle The value of songTitle as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongTitle_NotEqual(String songTitle) {
        doSetSongTitle_NotEqual(fRES(songTitle));
    }

    protected void doSetSongTitle_NotEqual(String songTitle) {
        regSongTitle(CK_NES, songTitle);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitle The value of songTitle as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongTitle_GreaterThan(String songTitle) {
        regSongTitle(CK_GT, fRES(songTitle));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitle The value of songTitle as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongTitle_LessThan(String songTitle) {
        regSongTitle(CK_LT, fRES(songTitle));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitle The value of songTitle as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongTitle_GreaterEqual(String songTitle) {
        regSongTitle(CK_GE, fRES(songTitle));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitle The value of songTitle as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongTitle_LessEqual(String songTitle) {
        regSongTitle(CK_LE, fRES(songTitle));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitleList The collection of songTitle as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongTitle_InScope(Collection<String> songTitleList) {
        doSetSongTitle_InScope(songTitleList);
    }

    protected void doSetSongTitle_InScope(Collection<String> songTitleList) {
        regINS(CK_INS, cTL(songTitleList), xgetCValueSongTitle(), "SONG_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitleList The collection of songTitle as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSongTitle_NotInScope(Collection<String> songTitleList) {
        doSetSongTitle_NotInScope(songTitleList);
    }

    protected void doSetSongTitle_NotInScope(Collection<String> songTitleList) {
        regINS(CK_NINS, cTL(songTitleList), xgetCValueSongTitle(), "SONG_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSongTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param songTitle The value of songTitle as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSongTitle_LikeSearch(String songTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSongTitle_LikeSearch(songTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSongTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param songTitle The value of songTitle as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSongTitle_LikeSearch(String songTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(songTitle), xgetCValueSongTitle(), "SONG_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitle The value of songTitle as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSongTitle_NotLikeSearch(String songTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSongTitle_NotLikeSearch(songTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SONG_TITLE: {NotNull, VARCHAR(200)}
     * @param songTitle The value of songTitle as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSongTitle_NotLikeSearch(String songTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(songTitle), xgetCValueSongTitle(), "SONG_TITLE", likeSearchOption);
    }

    protected void regSongTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSongTitle(), "SONG_TITLE"); }
    protected abstract ConditionValue xgetCValueSongTitle();

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
    public HpSLCFunction<SongCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SongCB.class);
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
    public HpSLCFunction<SongCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SongCB.class);
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
    public HpSLCFunction<SongCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SongCB.class);
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
    public HpSLCFunction<SongCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SongCB.class);
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
    public HpSLCFunction<SongCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SongCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SongCB&gt;() {
     *     public void query(SongCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SongCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SongCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SongCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SongCQ sq);

    protected SongCB xcreateScalarConditionCB() {
        SongCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SongCB xcreateScalarConditionPartitionByCB() {
        SongCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SongCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SongCB cb = new SongCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SONG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SongCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SongCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SongCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SongCB cb = new SongCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SONG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SongCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SongCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SongCB cb = new SongCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SongCQ sq);

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
    protected SongCB newMyCB() {
        return new SongCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SongCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
