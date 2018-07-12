package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;

/**
 * The referrer loader of FAVORITE as TABLE. <br>
 * <pre>
 * [primary key]
 *     FAVORITE_ID
 *
 * [column]
 *     FAVORITE_ID, USER_ID, ALBUM_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FAVORITE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ALBUM, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     album, user
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfFavorite {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Favorite> _selectedList;
    protected BehaviorSelector _selector;
    protected FavoriteBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFavorite ready(List<Favorite> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FavoriteBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FavoriteBhv.class); return _myBhv; } }

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
    public List<Favorite> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
