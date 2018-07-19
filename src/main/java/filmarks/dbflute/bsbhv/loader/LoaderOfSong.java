package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;

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
 *     
 *
 * [foreign property]
 *     album
 *
 * [referrer property]
 *     
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
