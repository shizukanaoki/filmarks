package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;
import filmarks.dbflute.cbean.*;

/**
 * The referrer loader of ARTIST as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, NAME
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
 *     ALBUM, SONG
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     albumList, songList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfArtist {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Artist> _selectedList;
    protected BehaviorSelector _selector;
    protected ArtistBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfArtist ready(List<Artist> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ArtistBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ArtistBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Album> _referrerAlbum;

    /**
     * Load referrer of albumList by the set-upper of referrer. <br>
     * ALBUM by ARTIST_ID, named 'albumList'.
     * <pre>
     * <span style="color: #0000C0">artistBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">artistList</span>, <span style="color: #553000">artistLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">artistLoader</span>.<span style="color: #CC4747">loadAlbum</span>(<span style="color: #553000">albumCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">albumCB</span>.setupSelect...
     *         <span style="color: #553000">albumCB</span>.query().set...
     *         <span style="color: #553000">albumCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">albumLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    albumLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Artist artist : <span style="color: #553000">artistList</span>) {
     *     ... = artist.<span style="color: #CC4747">getAlbumList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setArtistId_InScope(pkList);
     * cb.query().addOrderBy_ArtistId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfAlbum> loadAlbum(ReferrerConditionSetupper<AlbumCB> refCBLambda) {
        myBhv().loadAlbum(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerAlbum = refLs);
        return hd -> hd.handle(new LoaderOfAlbum().ready(_referrerAlbum, _selector));
    }

    protected List<Song> _referrerSong;

    /**
     * Load referrer of songList by the set-upper of referrer. <br>
     * SONG by ARTIST_ID, named 'songList'.
     * <pre>
     * <span style="color: #0000C0">artistBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">artistList</span>, <span style="color: #553000">artistLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">artistLoader</span>.<span style="color: #CC4747">loadSong</span>(<span style="color: #553000">songCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">songCB</span>.setupSelect...
     *         <span style="color: #553000">songCB</span>.query().set...
     *         <span style="color: #553000">songCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">songLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    songLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Artist artist : <span style="color: #553000">artistList</span>) {
     *     ... = artist.<span style="color: #CC4747">getSongList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setArtistId_InScope(pkList);
     * cb.query().addOrderBy_ArtistId_Asc();
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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Artist> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
