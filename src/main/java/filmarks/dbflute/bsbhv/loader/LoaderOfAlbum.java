package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;
import filmarks.dbflute.cbean.*;

/**
 * The referrer loader of ALBUM as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, TITLE, FILE_NAME, ARTIST_ID
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
 *     ARTIST, SONG(AsOne)
 *
 * [referrer table]
 *     COMMENT, PICK, SONG
 *
 * [foreign property]
 *     artist, songAsOne
 *
 * [referrer property]
 *     commentList, pickList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAlbum {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Album> _selectedList;
    protected BehaviorSelector _selector;
    protected AlbumBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAlbum ready(List<Album> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AlbumBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AlbumBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Comment> _referrerComment;

    /**
     * Load referrer of commentList by the set-upper of referrer. <br>
     * COMMENT by ALBUM_ID, named 'commentList'.
     * <pre>
     * <span style="color: #0000C0">albumBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">albumList</span>, <span style="color: #553000">albumLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">albumLoader</span>.<span style="color: #CC4747">loadComment</span>(<span style="color: #553000">commentCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">commentCB</span>.setupSelect...
     *         <span style="color: #553000">commentCB</span>.query().set...
     *         <span style="color: #553000">commentCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">commentLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    commentLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Album album : <span style="color: #553000">albumList</span>) {
     *     ... = album.<span style="color: #CC4747">getCommentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAlbumId_InScope(pkList);
     * cb.query().addOrderBy_AlbumId_Asc();
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
     * PICK by PRODUCT_ID, named 'pickList'.
     * <pre>
     * <span style="color: #0000C0">albumBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">albumList</span>, <span style="color: #553000">albumLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">albumLoader</span>.<span style="color: #CC4747">loadPick</span>(<span style="color: #553000">pickCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickCB</span>.setupSelect...
     *         <span style="color: #553000">pickCB</span>.query().set...
     *         <span style="color: #553000">pickCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Album album : <span style="color: #553000">albumList</span>) {
     *     ... = album.<span style="color: #CC4747">getPickList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfPick> loadPick(ReferrerConditionSetupper<PickCB> refCBLambda) {
        myBhv().loadPick(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPick = refLs);
        return hd -> hd.handle(new LoaderOfPick().ready(_referrerPick, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfArtist _foreignArtistLoader;
    public LoaderOfArtist pulloutArtist() {
        if (_foreignArtistLoader == null)
        { _foreignArtistLoader = new LoaderOfArtist().ready(myBhv().pulloutArtist(_selectedList), _selector); }
        return _foreignArtistLoader;
    }

    protected LoaderOfSong _foreignSongAsOneLoader;
    public LoaderOfSong pulloutSongAsOne() {
        if (_foreignSongAsOneLoader == null)
        { _foreignSongAsOneLoader = new LoaderOfSong().ready(myBhv().pulloutSongAsOne(_selectedList), _selector); }
        return _foreignSongAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Album> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
