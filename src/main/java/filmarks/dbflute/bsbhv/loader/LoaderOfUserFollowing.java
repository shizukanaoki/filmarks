package filmarks.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import filmarks.dbflute.exbhv.*;
import filmarks.dbflute.exentity.*;

/**
 * The referrer loader of USER_FOLLOWING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, FOLLOWING_ID, FOLLOWER_ID
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
 *     USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     userByFollowerId, userByFollowingId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUserFollowing {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserFollowing> _selectedList;
    protected BehaviorSelector _selector;
    protected UserFollowingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserFollowing ready(List<UserFollowing> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserFollowingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserFollowingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserByFollowerIdLoader;
    public LoaderOfUser pulloutUserByFollowerId() {
        if (_foreignUserByFollowerIdLoader == null)
        { _foreignUserByFollowerIdLoader = new LoaderOfUser().ready(myBhv().pulloutUserByFollowerId(_selectedList), _selector); }
        return _foreignUserByFollowerIdLoader;
    }

    protected LoaderOfUser _foreignUserByFollowingIdLoader;
    public LoaderOfUser pulloutUserByFollowingId() {
        if (_foreignUserByFollowingIdLoader == null)
        { _foreignUserByFollowingIdLoader = new LoaderOfUser().ready(myBhv().pulloutUserByFollowingId(_selectedList), _selector); }
        return _foreignUserByFollowingIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserFollowing> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
