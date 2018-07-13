package filmarks.domain;

import filmarks.dbflute.exbhv.UserFollowingBhv;
import filmarks.dbflute.exentity.UserFollowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserFollowingRepository {

    @Autowired
    private UserFollowingBhv userFollowingBhvBhv;

    public UserFollowing save(UserFollowing userFollowing) {
        userFollowingBhvBhv.insert(userFollowing);
        return userFollowing;
    }
}
