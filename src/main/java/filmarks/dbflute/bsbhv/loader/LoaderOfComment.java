package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;
import filmarks.dbflute.cbean.*;

/**
 * The referrer loader of COMMENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     COMMENT_ID
 *
 * [column]
 *     COMMENT_ID, USER_ID, ALBUM_ID, CONTENT, RATE, COMMENT_CREATED_AT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COMMENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ALBUM, USER
 *
 * [referrer table]
 *     POST
 *
 * [foreign property]
 *     album, user
 *
 * [referrer property]
 *     postList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfComment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Comment> _selectedList;
    protected BehaviorSelector _selector;
    protected CommentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfComment ready(List<Comment> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CommentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CommentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Post> _referrerPost;

    /**
     * Load referrer of postList by the set-upper of referrer. <br>
     * POST by TARGET_ID, named 'postList'.
     * <pre>
     * <span style="color: #0000C0">commentBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">commentList</span>, <span style="color: #553000">commentLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">commentLoader</span>.<span style="color: #CC4747">loadPost</span>(<span style="color: #553000">postCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">postCB</span>.setupSelect...
     *         <span style="color: #553000">postCB</span>.query().set...
     *         <span style="color: #553000">postCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">postLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    postLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Comment comment : <span style="color: #553000">commentList</span>) {
     *     ... = comment.<span style="color: #CC4747">getPostList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTargetId_InScope(pkList);
     * cb.query().addOrderBy_TargetId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPost> loadPost(ReferrerConditionSetupper<PostCB> refCBLambda) {
        myBhv().loadPost(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPost = refLs);
        return hd -> hd.handle(new LoaderOfPost().ready(_referrerPost, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfAlbum _foreignAlbumLoader;
    public LoaderOfAlbum pulloutAlbum() {
        if (_foreignAlbumLoader == null)
        { _foreignAlbumLoader = new LoaderOfAlbum().ready(myBhv().pulloutAlbum(_selectedList), _selector); }
        return _foreignAlbumLoader;
    }

    protected LoaderOfUser _foreignUserLoader;
    public LoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new LoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Comment> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
