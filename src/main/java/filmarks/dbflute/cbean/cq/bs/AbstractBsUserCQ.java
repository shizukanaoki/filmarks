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
 * The abstract condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "USER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
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
     * USER_ID: {PK, ID, NotNull, INT(10)}
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
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
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
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
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
     * USER_ID: {PK, ID, NotNull, INT(10)}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from COMMENT where ...)} <br>
     * COMMENT by USER_ID, named 'commentAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_CommentList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "commentList");
    }
    public abstract String keepUserId_ExistsReferrer_CommentList(CommentCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from FAVORITE where ...)} <br>
     * FAVORITE by USER_ID, named 'favoriteAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_FavoriteList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "favoriteList");
    }
    public abstract String keepUserId_ExistsReferrer_FavoriteList(FavoriteCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from LYRICS_RECOMMENDATION where ...)} <br>
     * LYRICS_RECOMMENDATION by USER_ID, named 'lyricsRecommendationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLyricsRecommendation</span>(recommendationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recommendationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LyricsRecommendationList for 'exists'. (NotNull)
     */
    public void existsLyricsRecommendation(SubQuery<LyricsRecommendationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LyricsRecommendationCB cb = new LyricsRecommendationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_LyricsRecommendationList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "lyricsRecommendationList");
    }
    public abstract String keepUserId_ExistsReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from POST where ...)} <br>
     * POST by USER_ID, named 'postAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_PostList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "postList");
    }
    public abstract String keepUserId_ExistsReferrer_PostList(PostCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FOLLOWER_ID from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWER_ID, named 'userFollowingByFollowerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserFollowingByFollowerId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserFollowingByFollowerIdList for 'exists'. (NotNull)
     */
    public void existsUserFollowingByFollowerId(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_UserFollowingByFollowerIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "FOLLOWER_ID", pp, "userFollowingByFollowerIdList");
    }
    public abstract String keepUserId_ExistsReferrer_UserFollowingByFollowerIdList(UserFollowingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FOLLOWING_ID from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWING_ID, named 'userFollowingByFollowingIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserFollowingByFollowingId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserFollowingByFollowingIdList for 'exists'. (NotNull)
     */
    public void existsUserFollowingByFollowingId(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_UserFollowingByFollowingIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "FOLLOWING_ID", pp, "userFollowingByFollowingIdList");
    }
    public abstract String keepUserId_ExistsReferrer_UserFollowingByFollowingIdList(UserFollowingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from COMMENT where ...)} <br>
     * COMMENT by USER_ID, named 'commentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsComment</span>(commentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     commentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_CommentList for 'not exists'. (NotNull)
     */
    public void notExistsComment(SubQuery<CommentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CommentCB cb = new CommentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_CommentList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "commentList");
    }
    public abstract String keepUserId_NotExistsReferrer_CommentList(CommentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from FAVORITE where ...)} <br>
     * FAVORITE by USER_ID, named 'favoriteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFavorite</span>(favoriteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoriteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_FavoriteList for 'not exists'. (NotNull)
     */
    public void notExistsFavorite(SubQuery<FavoriteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_FavoriteList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "favoriteList");
    }
    public abstract String keepUserId_NotExistsReferrer_FavoriteList(FavoriteCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from LYRICS_RECOMMENDATION where ...)} <br>
     * LYRICS_RECOMMENDATION by USER_ID, named 'lyricsRecommendationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLyricsRecommendation</span>(recommendationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recommendationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_LyricsRecommendationList for 'not exists'. (NotNull)
     */
    public void notExistsLyricsRecommendation(SubQuery<LyricsRecommendationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LyricsRecommendationCB cb = new LyricsRecommendationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_LyricsRecommendationList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "lyricsRecommendationList");
    }
    public abstract String keepUserId_NotExistsReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from POST where ...)} <br>
     * POST by USER_ID, named 'postAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPost</span>(postCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     postCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_PostList for 'not exists'. (NotNull)
     */
    public void notExistsPost(SubQuery<PostCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PostCB cb = new PostCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_PostList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "postList");
    }
    public abstract String keepUserId_NotExistsReferrer_PostList(PostCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FOLLOWER_ID from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWER_ID, named 'userFollowingByFollowerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserFollowingByFollowerId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_UserFollowingByFollowerIdList for 'not exists'. (NotNull)
     */
    public void notExistsUserFollowingByFollowerId(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_UserFollowingByFollowerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "FOLLOWER_ID", pp, "userFollowingByFollowerIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_UserFollowingByFollowerIdList(UserFollowingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FOLLOWING_ID from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWING_ID, named 'userFollowingByFollowingIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserFollowingByFollowingId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_UserFollowingByFollowingIdList for 'not exists'. (NotNull)
     */
    public void notExistsUserFollowingByFollowingId(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_UserFollowingByFollowingIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "FOLLOWING_ID", pp, "userFollowingByFollowingIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_UserFollowingByFollowingIdList(UserFollowingCQ sq);

    public void xsderiveCommentList(String fn, SubQuery<CommentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CommentCB cb = new CommentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_CommentList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "commentList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_CommentList(CommentCQ sq);

    public void xsderiveFavoriteList(String fn, SubQuery<FavoriteCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoriteCB cb = new FavoriteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_FavoriteList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "favoriteList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_FavoriteList(FavoriteCQ sq);

    public void xsderiveLyricsRecommendationList(String fn, SubQuery<LyricsRecommendationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LyricsRecommendationCB cb = new LyricsRecommendationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_LyricsRecommendationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "lyricsRecommendationList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq);

    public void xsderivePostList(String fn, SubQuery<PostCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCB cb = new PostCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_PostList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "postList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_PostList(PostCQ sq);

    public void xsderiveUserFollowingByFollowerIdList(String fn, SubQuery<UserFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWER_ID", pp, "userFollowingByFollowerIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowerIdList(UserFollowingCQ sq);

    public void xsderiveUserFollowingByFollowingIdList(String fn, SubQuery<UserFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowingIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWING_ID", pp, "userFollowingByFollowingIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowingIdList(UserFollowingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from COMMENT where ...)} <br>
     * COMMENT by USER_ID, named 'commentAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_CommentList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_CommentListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "commentList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_CommentList(CommentCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_CommentListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FAVORITE where ...)} <br>
     * FAVORITE by USER_ID, named 'favoriteAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_FavoriteList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_FavoriteListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "favoriteList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_FavoriteList(FavoriteCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_FavoriteListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LYRICS_RECOMMENDATION where ...)} <br>
     * LYRICS_RECOMMENDATION by USER_ID, named 'lyricsRecommendationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLyricsRecommendation()</span>.<span style="color: #CC4747">max</span>(recommendationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recommendationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     recommendationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LyricsRecommendationCB> derivedLyricsRecommendation() {
        return xcreateQDRFunctionLyricsRecommendationList();
    }
    protected HpQDRFunction<LyricsRecommendationCB> xcreateQDRFunctionLyricsRecommendationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLyricsRecommendationList(fn, sq, rd, vl, op));
    }
    public void xqderiveLyricsRecommendationList(String fn, SubQuery<LyricsRecommendationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LyricsRecommendationCB cb = new LyricsRecommendationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_LyricsRecommendationList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_LyricsRecommendationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "lyricsRecommendationList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_LyricsRecommendationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from POST where ...)} <br>
     * POST by USER_ID, named 'postAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_PostList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_PostListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "postList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_PostList(PostCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_PostListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWER_ID, named 'userFollowingByFollowerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserFollowingByFollowerId()</span>.<span style="color: #CC4747">max</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     followingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserFollowingCB> derivedUserFollowingByFollowerId() {
        return xcreateQDRFunctionUserFollowingByFollowerIdList();
    }
    protected HpQDRFunction<UserFollowingCB> xcreateQDRFunctionUserFollowingByFollowerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserFollowingByFollowerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserFollowingByFollowerIdList(String fn, SubQuery<UserFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_UserFollowingByFollowerIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_UserFollowingByFollowerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWER_ID", sqpp, "userFollowingByFollowerIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerIdList(UserFollowingCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWING_ID, named 'userFollowingByFollowingIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserFollowingByFollowingId()</span>.<span style="color: #CC4747">max</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     followingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserFollowingCB> derivedUserFollowingByFollowingId() {
        return xcreateQDRFunctionUserFollowingByFollowingIdList();
    }
    protected HpQDRFunction<UserFollowingCB> xcreateQDRFunctionUserFollowingByFollowingIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserFollowingByFollowingIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserFollowingByFollowingIdList(String fn, SubQuery<UserFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_UserFollowingByFollowingIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_UserFollowingByFollowingIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWING_ID", sqpp, "userFollowingByFollowingIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingIdList(UserFollowingCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param username The value of username as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsername_Equal(String username) {
        doSetUsername_Equal(fRES(username));
    }

    protected void doSetUsername_Equal(String username) {
        regUsername(CK_EQ, username);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param username The value of username as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsername_NotEqual(String username) {
        doSetUsername_NotEqual(fRES(username));
    }

    protected void doSetUsername_NotEqual(String username) {
        regUsername(CK_NES, username);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param username The value of username as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsername_GreaterThan(String username) {
        regUsername(CK_GT, fRES(username));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param username The value of username as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsername_LessThan(String username) {
        regUsername(CK_LT, fRES(username));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param username The value of username as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsername_GreaterEqual(String username) {
        regUsername(CK_GE, fRES(username));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param username The value of username as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsername_LessEqual(String username) {
        regUsername(CK_LE, fRES(username));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param usernameList The collection of username as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsername_InScope(Collection<String> usernameList) {
        doSetUsername_InScope(usernameList);
    }

    protected void doSetUsername_InScope(Collection<String> usernameList) {
        regINS(CK_INS, cTL(usernameList), xgetCValueUsername(), "USERNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param usernameList The collection of username as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsername_NotInScope(Collection<String> usernameList) {
        doSetUsername_NotInScope(usernameList);
    }

    protected void doSetUsername_NotInScope(Collection<String> usernameList) {
        regINS(CK_NINS, cTL(usernameList), xgetCValueUsername(), "USERNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setUsername_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param username The value of username as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUsername_LikeSearch(String username, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUsername_LikeSearch(username, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setUsername_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param username The value of username as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUsername_LikeSearch(String username, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(username), xgetCValueUsername(), "USERNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param username The value of username as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUsername_NotLikeSearch(String username, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUsername_NotLikeSearch(username, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNAME: {UQ, NotNull, VARCHAR(100)}
     * @param username The value of username as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUsername_NotLikeSearch(String username, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(username), xgetCValueUsername(), "USERNAME", likeSearchOption);
    }

    protected void regUsername(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsername(), "USERNAME"); }
    protected abstract ConditionValue xgetCValueUsername();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param passwordList The collection of password as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param passwordList The collection of password as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

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
    public HpSLCFunction<UserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserCQ sq);

    protected UserCB xcreateScalarConditionCB() {
        UserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserCB xcreateScalarConditionPartitionByCB() {
        UserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserCB cb = new UserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserCQ sq);

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
    protected UserCB newMyCB() {
        return new UserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
