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
 *     ID
 *
 * [column]
 *     ID, USERNAME, PASSWORD, AUTHORITY
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     COMMENT, PICK, RELATIONSHIP
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     commentList, pickList, relationshipByFollowerIdList, relationshipByFollowingIdList
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

    protected List<Pick> _referrerPick;

    /**
     * Load referrer of pickList by the set-upper of referrer. <br>
     * PICK by USER_ID, named 'pickList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadPick</span>(<span style="color: #553000">pickCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickCB</span>.setupSelect...
     *         <span style="color: #553000">pickCB</span>.query().set...
     *         <span style="color: #553000">pickCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getPickList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfPick> loadPick(ReferrerConditionSetupper<PickCB> refCBLambda) {
        myBhv().loadPick(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPick = refLs);
        return hd -> hd.handle(new LoaderOfPick().ready(_referrerPick, _selector));
    }

    protected List<Relationship> _referrerRelationshipByFollowerId;

    /**
     * Load referrer of relationshipByFollowerIdList by the set-upper of referrer. <br>
     * RELATIONSHIP by FOLLOWER_ID, named 'relationshipByFollowerIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadRelationshipByFollowerId</span>(<span style="color: #553000">relationshipCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relationshipCB</span>.setupSelect...
     *         <span style="color: #553000">relationshipCB</span>.query().set...
     *         <span style="color: #553000">relationshipCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relationshipLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relationshipLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getRelationshipByFollowerIdList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfRelationship> loadRelationshipByFollowerId(ReferrerConditionSetupper<RelationshipCB> refCBLambda) {
        myBhv().loadRelationshipByFollowerId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRelationshipByFollowerId = refLs);
        return hd -> hd.handle(new LoaderOfRelationship().ready(_referrerRelationshipByFollowerId, _selector));
    }

    protected List<Relationship> _referrerRelationshipByFollowingId;

    /**
     * Load referrer of relationshipByFollowingIdList by the set-upper of referrer. <br>
     * RELATIONSHIP by FOLLOWING_ID, named 'relationshipByFollowingIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadRelationshipByFollowingId</span>(<span style="color: #553000">relationshipCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relationshipCB</span>.setupSelect...
     *         <span style="color: #553000">relationshipCB</span>.query().set...
     *         <span style="color: #553000">relationshipCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relationshipLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relationshipLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getRelationshipByFollowingIdList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfRelationship> loadRelationshipByFollowingId(ReferrerConditionSetupper<RelationshipCB> refCBLambda) {
        myBhv().loadRelationshipByFollowingId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRelationshipByFollowingId = refLs);
        return hd -> hd.handle(new LoaderOfRelationship().ready(_referrerRelationshipByFollowingId, _selector));
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
