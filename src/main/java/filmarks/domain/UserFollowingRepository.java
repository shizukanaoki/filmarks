package filmarks.domain;

import filmarks.dbflute.exbhv.UserFollowingBhv;
import filmarks.dbflute.exentity.UserFollowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserFollowingのCRUDを担当するクラス
 *
 * @author naoki.shizuka
 */
@Repository
public class UserFollowingRepository {

    @Autowired
    private UserFollowingBhv userFollowingBhv;

    public UserFollowing save(UserFollowing userFollowing) {
        userFollowingBhv.insert(userFollowing);
        return userFollowing;
    }

    public void delete(UserFollowing userFollowing) {
        userFollowingBhv.delete(userFollowing);
    }

    public UserFollowing findByFollowingAndFollowerId(int followingId, int followerId) {
        return userFollowingBhv.selectEntity(cb -> {
            cb.query().setFollowingId_Equal(followingId);
            cb.query().setFollowerId_Equal(followerId);
        }).get();
    }

    public List<UserFollowing> findByUserId(int userId) {
        return userFollowingBhv.selectList(cb -> {
            cb.query().setFollowingId_Equal(userId);
        });
    }

    public boolean isFollowing(int followingId, int followerId) {
        return userFollowingBhv.selectEntity(cb -> {
            cb.query().setFollowingId_Equal(followingId);
            cb.query().setFollowerId_Equal(followerId);
        }).isPresent();
    }
}
