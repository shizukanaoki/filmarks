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
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
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
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
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
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
     * @param albumId The value of albumId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_GreaterThan(Integer albumId) {
        regAlbumId(CK_GT, albumId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
     * @param albumId The value of albumId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_LessThan(Integer albumId) {
        regAlbumId(CK_LT, albumId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
     * @param albumId The value of albumId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_GreaterEqual(Integer albumId) {
        regAlbumId(CK_GE, albumId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
     * @param albumId The value of albumId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlbumId_LessEqual(Integer albumId) {
        regAlbumId(CK_LE, albumId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
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
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of albumId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of albumId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAlbumId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlbumId(), "ALBUM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
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
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
     * @param albumIdList The collection of albumId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumId_NotInScope(Collection<Integer> albumIdList) {
        doSetAlbumId_NotInScope(albumIdList);
    }

    protected void doSetAlbumId_NotInScope(Collection<Integer> albumIdList) {
        regINS(CK_NINS, cTL(albumIdList), xgetCValueAlbumId(), "ALBUM_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALBUM_ID from COMMENT where ...)} <br>
     * COMMENT by ALBUM_ID, named 'commentAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAlbumId_ExistsReferrer_CommentList(cb.query());
        registerExistsReferrer(cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "commentList");
    }
    public abstract String keepAlbumId_ExistsReferrer_CommentList(CommentCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALBUM_ID from FAVORITE where ...)} <br>
     * FAVORITE by ALBUM_ID, named 'favoriteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsFavorite</span>(favoriteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoriteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FavoriteList for 'exists'. (NotNull)
     */
    public void existsFavorite(SubQuery<FavoriteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAlbumId_ExistsReferrer_FavoriteList(cb.query());
        registerExistsReferrer(cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "favoriteList");
    }
    public abstract String keepAlbumId_ExistsReferrer_FavoriteList(FavoriteCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALBUM_ID from SONG where ...)} <br>
     * SONG by ALBUM_ID, named 'songAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsSong</span>(songCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     songCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SongList for 'exists'. (NotNull)
     */
    public void existsSong(SubQuery<SongCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SongCB cb = new SongCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAlbumId_ExistsReferrer_SongList(cb.query());
        registerExistsReferrer(cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "songList");
    }
    public abstract String keepAlbumId_ExistsReferrer_SongList(SongCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALBUM_ID from COMMENT where ...)} <br>
     * COMMENT by ALBUM_ID, named 'commentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsComment</span>(commentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     commentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AlbumId_NotExistsReferrer_CommentList for 'not exists'. (NotNull)
     */
    public void notExistsComment(SubQuery<CommentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CommentCB cb = new CommentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAlbumId_NotExistsReferrer_CommentList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "commentList");
    }
    public abstract String keepAlbumId_NotExistsReferrer_CommentList(CommentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALBUM_ID from FAVORITE where ...)} <br>
     * FAVORITE by ALBUM_ID, named 'favoriteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFavorite</span>(favoriteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoriteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AlbumId_NotExistsReferrer_FavoriteList for 'not exists'. (NotNull)
     */
    public void notExistsFavorite(SubQuery<FavoriteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAlbumId_NotExistsReferrer_FavoriteList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "favoriteList");
    }
    public abstract String keepAlbumId_NotExistsReferrer_FavoriteList(FavoriteCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALBUM_ID from SONG where ...)} <br>
     * SONG by ALBUM_ID, named 'songAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSong</span>(songCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     songCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AlbumId_NotExistsReferrer_SongList for 'not exists'. (NotNull)
     */
    public void notExistsSong(SubQuery<SongCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SongCB cb = new SongCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAlbumId_NotExistsReferrer_SongList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "songList");
    }
    public abstract String keepAlbumId_NotExistsReferrer_SongList(SongCQ sq);

    public void xsderiveCommentList(String fn, SubQuery<CommentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CommentCB cb = new CommentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAlbumId_SpecifyDerivedReferrer_CommentList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "commentList", al, op);
    }
    public abstract String keepAlbumId_SpecifyDerivedReferrer_CommentList(CommentCQ sq);

    public void xsderiveFavoriteList(String fn, SubQuery<FavoriteCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAlbumId_SpecifyDerivedReferrer_FavoriteList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "favoriteList", al, op);
    }
    public abstract String keepAlbumId_SpecifyDerivedReferrer_FavoriteList(FavoriteCQ sq);

    public void xsderiveSongList(String fn, SubQuery<SongCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SongCB cb = new SongCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAlbumId_SpecifyDerivedReferrer_SongList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALBUM_ID", "ALBUM_ID", pp, "songList", al, op);
    }
    public abstract String keepAlbumId_SpecifyDerivedReferrer_SongList(SongCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from COMMENT where ...)} <br>
     * COMMENT by ALBUM_ID, named 'commentAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepAlbumId_QueryDerivedReferrer_CommentList(cb.query()); String prpp = keepAlbumId_QueryDerivedReferrer_CommentListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALBUM_ID", "ALBUM_ID", sqpp, "commentList", rd, vl, prpp, op);
    }
    public abstract String keepAlbumId_QueryDerivedReferrer_CommentList(CommentCQ sq);
    public abstract String keepAlbumId_QueryDerivedReferrer_CommentListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FAVORITE where ...)} <br>
     * FAVORITE by ALBUM_ID, named 'favoriteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedFavorite()</span>.<span style="color: #CC4747">max</span>(favoriteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoriteCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     favoriteCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<FavoriteCB> derivedFavorite() {
        return xcreateQDRFunctionFavoriteList();
    }
    protected HpQDRFunction<FavoriteCB> xcreateQDRFunctionFavoriteList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveFavoriteList(fn, sq, rd, vl, op));
    }
    public void xqderiveFavoriteList(String fn, SubQuery<FavoriteCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAlbumId_QueryDerivedReferrer_FavoriteList(cb.query()); String prpp = keepAlbumId_QueryDerivedReferrer_FavoriteListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALBUM_ID", "ALBUM_ID", sqpp, "favoriteList", rd, vl, prpp, op);
    }
    public abstract String keepAlbumId_QueryDerivedReferrer_FavoriteList(FavoriteCQ sq);
    public abstract String keepAlbumId_QueryDerivedReferrer_FavoriteListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SONG where ...)} <br>
     * SONG by ALBUM_ID, named 'songAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedSong()</span>.<span style="color: #CC4747">max</span>(songCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     songCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     songCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SongCB> derivedSong() {
        return xcreateQDRFunctionSongList();
    }
    protected HpQDRFunction<SongCB> xcreateQDRFunctionSongList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveSongList(fn, sq, rd, vl, op));
    }
    public void xqderiveSongList(String fn, SubQuery<SongCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SongCB cb = new SongCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAlbumId_QueryDerivedReferrer_SongList(cb.query()); String prpp = keepAlbumId_QueryDerivedReferrer_SongListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALBUM_ID", "ALBUM_ID", sqpp, "songList", rd, vl, prpp, op);
    }
    public abstract String keepAlbumId_QueryDerivedReferrer_SongList(SongCQ sq);
    public abstract String keepAlbumId_QueryDerivedReferrer_SongListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setAlbumId_IsNull() { regAlbumId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALBUM_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setAlbumId_IsNotNull() { regAlbumId(CK_ISNN, DOBJ); }

    protected void regAlbumId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlbumId(), "ALBUM_ID"); }
    protected abstract ConditionValue xgetCValueAlbumId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitle The value of albumTitle as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumTitle_Equal(String albumTitle) {
        doSetAlbumTitle_Equal(fRES(albumTitle));
    }

    protected void doSetAlbumTitle_Equal(String albumTitle) {
        regAlbumTitle(CK_EQ, albumTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitle The value of albumTitle as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumTitle_NotEqual(String albumTitle) {
        doSetAlbumTitle_NotEqual(fRES(albumTitle));
    }

    protected void doSetAlbumTitle_NotEqual(String albumTitle) {
        regAlbumTitle(CK_NES, albumTitle);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitle The value of albumTitle as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumTitle_GreaterThan(String albumTitle) {
        regAlbumTitle(CK_GT, fRES(albumTitle));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitle The value of albumTitle as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumTitle_LessThan(String albumTitle) {
        regAlbumTitle(CK_LT, fRES(albumTitle));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitle The value of albumTitle as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumTitle_GreaterEqual(String albumTitle) {
        regAlbumTitle(CK_GE, fRES(albumTitle));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitle The value of albumTitle as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumTitle_LessEqual(String albumTitle) {
        regAlbumTitle(CK_LE, fRES(albumTitle));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitleList The collection of albumTitle as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumTitle_InScope(Collection<String> albumTitleList) {
        doSetAlbumTitle_InScope(albumTitleList);
    }

    protected void doSetAlbumTitle_InScope(Collection<String> albumTitleList) {
        regINS(CK_INS, cTL(albumTitleList), xgetCValueAlbumTitle(), "ALBUM_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitleList The collection of albumTitle as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlbumTitle_NotInScope(Collection<String> albumTitleList) {
        doSetAlbumTitle_NotInScope(albumTitleList);
    }

    protected void doSetAlbumTitle_NotInScope(Collection<String> albumTitleList) {
        regINS(CK_NINS, cTL(albumTitleList), xgetCValueAlbumTitle(), "ALBUM_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAlbumTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param albumTitle The value of albumTitle as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAlbumTitle_LikeSearch(String albumTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAlbumTitle_LikeSearch(albumTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAlbumTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param albumTitle The value of albumTitle as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAlbumTitle_LikeSearch(String albumTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(albumTitle), xgetCValueAlbumTitle(), "ALBUM_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitle The value of albumTitle as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAlbumTitle_NotLikeSearch(String albumTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAlbumTitle_NotLikeSearch(albumTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALBUM_TITLE: {NotNull, VARCHAR(200)}
     * @param albumTitle The value of albumTitle as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAlbumTitle_NotLikeSearch(String albumTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(albumTitle), xgetCValueAlbumTitle(), "ALBUM_TITLE", likeSearchOption);
    }

    protected void regAlbumTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlbumTitle(), "ALBUM_TITLE"); }
    protected abstract ConditionValue xgetCValueAlbumTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileName The value of imageFileName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImageFileName_Equal(String imageFileName) {
        doSetImageFileName_Equal(fRES(imageFileName));
    }

    protected void doSetImageFileName_Equal(String imageFileName) {
        regImageFileName(CK_EQ, imageFileName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileName The value of imageFileName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImageFileName_NotEqual(String imageFileName) {
        doSetImageFileName_NotEqual(fRES(imageFileName));
    }

    protected void doSetImageFileName_NotEqual(String imageFileName) {
        regImageFileName(CK_NES, imageFileName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileName The value of imageFileName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImageFileName_GreaterThan(String imageFileName) {
        regImageFileName(CK_GT, fRES(imageFileName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileName The value of imageFileName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImageFileName_LessThan(String imageFileName) {
        regImageFileName(CK_LT, fRES(imageFileName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileName The value of imageFileName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImageFileName_GreaterEqual(String imageFileName) {
        regImageFileName(CK_GE, fRES(imageFileName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileName The value of imageFileName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImageFileName_LessEqual(String imageFileName) {
        regImageFileName(CK_LE, fRES(imageFileName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileNameList The collection of imageFileName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImageFileName_InScope(Collection<String> imageFileNameList) {
        doSetImageFileName_InScope(imageFileNameList);
    }

    protected void doSetImageFileName_InScope(Collection<String> imageFileNameList) {
        regINS(CK_INS, cTL(imageFileNameList), xgetCValueImageFileName(), "IMAGE_FILE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileNameList The collection of imageFileName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImageFileName_NotInScope(Collection<String> imageFileNameList) {
        doSetImageFileName_NotInScope(imageFileNameList);
    }

    protected void doSetImageFileName_NotInScope(Collection<String> imageFileNameList) {
        regINS(CK_NINS, cTL(imageFileNameList), xgetCValueImageFileName(), "IMAGE_FILE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setImageFileName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param imageFileName The value of imageFileName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImageFileName_LikeSearch(String imageFileName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImageFileName_LikeSearch(imageFileName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setImageFileName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param imageFileName The value of imageFileName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setImageFileName_LikeSearch(String imageFileName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(imageFileName), xgetCValueImageFileName(), "IMAGE_FILE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileName The value of imageFileName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setImageFileName_NotLikeSearch(String imageFileName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setImageFileName_NotLikeSearch(imageFileName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMAGE_FILE_NAME: {NotNull, VARCHAR(200)}
     * @param imageFileName The value of imageFileName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setImageFileName_NotLikeSearch(String imageFileName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(imageFileName), xgetCValueImageFileName(), "IMAGE_FILE_NAME", likeSearchOption);
    }

    protected void regImageFileName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImageFileName(), "IMAGE_FILE_NAME"); }
    protected abstract ConditionValue xgetCValueImageFileName();

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
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ALBUM_ID";
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
        String pk = "ALBUM_ID";
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
