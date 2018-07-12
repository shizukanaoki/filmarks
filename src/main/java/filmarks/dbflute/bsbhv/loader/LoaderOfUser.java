package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;
import filmarks.dbflute.cbean.*;

/**
 * The referrer loader of USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, USERNAME, PASSWORD
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     COMMENT, FAVORITE, USER_FOLLOWING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     commentList, favoriteList, userFollowingByFollowerIdList, userFollowingByFollowingIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<User> _selectedList;
    protected BehaviorSelector _selector;
    protected UserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUser ready(List<User> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Comment> _referrerComment;

    /**
     * Load referrer of commentList by the set-upper of referrer. <br>
     * COMMENT by USER_ID, named 'commentList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadComment</span>(<span style="color: #553000">commentCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">commentCB</span>.setupSelect...
     *         <span style="color: #553000">commentCB</span>.query().set...
     *         <span style="color: #553000">commentCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">commentLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    commentLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getCommentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfComment> loadComment(ReferrerConditionSetupper<CommentCB> refCBLambda) {
        myBhv().loadComment(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerComment = refLs);
        return hd -> hd.handle(new LoaderOfComment().ready(_referrerComment, _selector));
    }

    protected List<Favorite> _referrerFavorite;

    /**
     * Load referrer of favoriteList by the set-upper of referrer. <br>
     * FAVORITE by USER_ID, named 'favoriteList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadFavorite</span>(<span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">favoriteCB</span>.setupSelect...
     *         <span style="color: #553000">favoriteCB</span>.query().set...
     *         <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">favoriteLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    favoriteLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getFavoriteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFavorite> loadFavorite(ReferrerConditionSetupper<FavoriteCB> refCBLambda) {
        myBhv().loadFavorite(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFavorite = refLs);
        return hd -> hd.handle(new LoaderOfFavorite().ready(_referrerFavorite, _selector));
    }

    protected List<UserFollowing> _referrerUserFollowingByFollowerId;

    /**
     * Load referrer of userFollowingByFollowerIdList by the set-upper of referrer. <br>
     * USER_FOLLOWING by FOLLOWER_ID, named 'userFollowingByFollowerIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadUserFollowingByFollowerId</span>(<span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followingCB</span>.setupSelect...
     *         <span style="color: #553000">followingCB</span>.query().set...
     *         <span style="color: #553000">followingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getUserFollowingByFollowerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFollowerId_InScope(pkList);
     * cb.query().addOrderBy_FollowerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserFollowing> loadUserFollowingByFollowerId(ReferrerConditionSetupper<UserFollowingCB> refCBLambda) {
        myBhv().loadUserFollowingByFollowerId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserFollowingByFollowerId = refLs);
        return hd -> hd.handle(new LoaderOfUserFollowing().ready(_referrerUserFollowingByFollowerId, _selector));
    }

    protected List<UserFollowing> _referrerUserFollowingByFollowingId;

    /**
     * Load referrer of userFollowingByFollowingIdList by the set-upper of referrer. <br>
     * USER_FOLLOWING by FOLLOWING_ID, named 'userFollowingByFollowingIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadUserFollowingByFollowingId</span>(<span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followingCB</span>.setupSelect...
     *         <span style="color: #553000">followingCB</span>.query().set...
     *         <span style="color: #553000">followingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getUserFollowingByFollowingIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFollowingId_InScope(pkList);
     * cb.query().addOrderBy_FollowingId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserFollowing> loadUserFollowingByFollowingId(ReferrerConditionSetupper<UserFollowingCB> refCBLambda) {
        myBhv().loadUserFollowingByFollowingId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserFollowingByFollowingId = refLs);
        return hd -> hd.handle(new LoaderOfUserFollowing().ready(_referrerUserFollowingByFollowingId, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<User> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
