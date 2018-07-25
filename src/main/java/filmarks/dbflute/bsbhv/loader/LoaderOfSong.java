package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;
import filmarks.dbflute.cbean.*;

/**
 * The referrer loader of SONG as TABLE. <br>
 * <pre>
 * [primary key]
 *     SONG_ID
 *
 * [column]
 *     SONG_ID, ALBUM_ID, SONG_TITLE, SONG_LYRICS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SONG_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ALBUM
 *
 * [referrer table]
 *     LYRICS_RECOMMENDATION
 *
 * [foreign property]
 *     album
 *
 * [referrer property]
 *     lyricsRecommendationList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSong {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Song> _selectedList;
    protected BehaviorSelector _selector;
    protected SongBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSong ready(List<Song> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SongBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SongBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LyricsRecommendation> _referrerLyricsRecommendation;

    /**
     * Load referrer of lyricsRecommendationList by the set-upper of referrer. <br>
     * LYRICS_RECOMMENDATION by SONG_ID, named 'lyricsRecommendationList'.
     * <pre>
     * <span style="color: #0000C0">songBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">songList</span>, <span style="color: #553000">songLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">songLoader</span>.<span style="color: #CC4747">loadLyricsRecommendation</span>(<span style="color: #553000">recommendationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">recommendationCB</span>.setupSelect...
     *         <span style="color: #553000">recommendationCB</span>.query().set...
     *         <span style="color: #553000">recommendationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">recommendationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    recommendationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Song song : <span style="color: #553000">songList</span>) {
     *     ... = song.<span style="color: #CC4747">getLyricsRecommendationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSongId_InScope(pkList);
     * cb.query().addOrderBy_SongId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLyricsRecommendation> loadLyricsRecommendation(ReferrerConditionSetupper<LyricsRecommendationCB> refCBLambda) {
        myBhv().loadLyricsRecommendation(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLyricsRecommendation = refLs);
        return hd -> hd.handle(new LoaderOfLyricsRecommendation().ready(_referrerLyricsRecommendation, _selector));
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Song> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
