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
 *     ALBUM_ID
 *
 * [column]
 *     ALBUM_ID, ALBUM_TITLE, IMAGE_FILE_NAME, ARTIST_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALBUM_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ARTIST
 *
 * [referrer table]
 *     COMMENT, FAVORITE, SONG
 *
 * [foreign property]
 *     artist
 *
 * [referrer property]
 *     commentList, favoriteList, songList
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

    protected List<Favorite> _referrerFavorite;

    /**
     * Load referrer of favoriteList by the set-upper of referrer. <br>
     * FAVORITE by ALBUM_ID, named 'favoriteList'.
     * <pre>
     * <span style="color: #0000C0">albumBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">albumList</span>, <span style="color: #553000">albumLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">albumLoader</span>.<span style="color: #CC4747">loadFavorite</span>(<span style="color: #553000">favoriteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">favoriteCB</span>.setupSelect...
     *         <span style="color: #553000">favoriteCB</span>.query().set...
     *         <span style="color: #553000">favoriteCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">favoriteLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    favoriteLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Album album : <span style="color: #553000">albumList</span>) {
     *     ... = album.<span style="color: #CC4747">getFavoriteList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfFavorite> loadFavorite(ReferrerConditionSetupper<FavoriteCB> refCBLambda) {
        myBhv().loadFavorite(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFavorite = refLs);
        return hd -> hd.handle(new LoaderOfFavorite().ready(_referrerFavorite, _selector));
    }

    protected List<Song> _referrerSong;

    /**
     * Load referrer of songList by the set-upper of referrer. <br>
     * SONG by ALBUM_ID, named 'songList'.
     * <pre>
     * <span style="color: #0000C0">albumBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">albumList</span>, <span style="color: #553000">albumLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">albumLoader</span>.<span style="color: #CC4747">loadSong</span>(<span style="color: #553000">songCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">songCB</span>.setupSelect...
     *         <span style="color: #553000">songCB</span>.query().set...
     *         <span style="color: #553000">songCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">songLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    songLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Album album : <span style="color: #553000">albumList</span>) {
     *     ... = album.<span style="color: #CC4747">getSongList()</span>;
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
    public NestedReferrerLoaderGateway<LoaderOfSong> loadSong(ReferrerConditionSetupper<SongCB> refCBLambda) {
        myBhv().loadSong(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSong = refLs);
        return hd -> hd.handle(new LoaderOfSong().ready(_referrerSong, _selector));
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Album> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
