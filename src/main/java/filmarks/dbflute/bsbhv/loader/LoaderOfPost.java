package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;

/**
 * The referrer loader of POST as TABLE. <br>
 * <pre>
 * [primary key]
 *     POST_ID
 *
 * [column]
 *     POST_ID, TARGET_ID, TARGET_TYPE, USER_ID, CREATED_AT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     POST_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER, FAVORITE, COMMENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     user, favorite, comment
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPost {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Post> _selectedList;
    protected BehaviorSelector _selector;
    protected PostBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPost ready(List<Post> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PostBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PostBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserLoader;
    public LoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new LoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    protected LoaderOfFavorite _foreignFavoriteLoader;
    public LoaderOfFavorite pulloutFavorite() {
        if (_foreignFavoriteLoader == null)
        { _foreignFavoriteLoader = new LoaderOfFavorite().ready(myBhv().pulloutFavorite(_selectedList), _selector); }
        return _foreignFavoriteLoader;
    }

    protected LoaderOfComment _foreignCommentLoader;
    public LoaderOfComment pulloutComment() {
        if (_foreignCommentLoader == null)
        { _foreignCommentLoader = new LoaderOfComment().ready(myBhv().pulloutComment(_selectedList), _selector); }
        return _foreignCommentLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Post> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
