package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;

/**
 * The referrer loader of LYRICS_RECOMMENDATION as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, USER_ID, SONG_ID, LYRICS
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
 *     SONG, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     song, user
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLyricsRecommendation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LyricsRecommendation> _selectedList;
    protected BehaviorSelector _selector;
    protected LyricsRecommendationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLyricsRecommendation ready(List<LyricsRecommendation> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LyricsRecommendationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LyricsRecommendationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfSong _foreignSongLoader;
    public LoaderOfSong pulloutSong() {
        if (_foreignSongLoader == null)
        { _foreignSongLoader = new LoaderOfSong().ready(myBhv().pulloutSong(_selectedList), _selector); }
        return _foreignSongLoader;
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
    public List<LyricsRecommendation> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
