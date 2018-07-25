package filmarks.domain;

import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.User;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * UserのCRUDを担当するクラス
 *
 * @author naoki.shizuka
 */
@Repository
public class UserRepository {

    @Autowired
    private UserBhv userBhv;

    public List<User> findAll() {
        ListResultBean<User> users = userBhv.selectList(cb -> {
            cb.query().addOrderBy_UserId_Asc();
        });
        userBhv.loadFavorite(users, cb -> {
            cb.setupSelect_Album();
        });
        return users;
    }

    public User findByUsername(String username) {
        OptionalEntity<User> userOptionalEntity = userBhv.selectEntity(cb -> {
            cb.query().setUsername_Equal(username);
        });
        return userOptionalEntity.orElse(null);
    }

    public User findOne(int userId) throws EntityAlreadyDeletedException {
        User user = userBhv.selectByPK(userId).get();
        userBhv.loadFavorite(user, cb -> {
            cb.setupSelect_Album();
        });
        userBhv.loadComment(user, cb -> {
            cb.setupSelect_Album();
        });
        userBhv.loadUserFollowingByFollowingId(user, cb -> {
            cb.setupSelect_UserByFollowerId();
        });
        userBhv.loadUserFollowingByFollowerId(user, cb -> {
            cb.setupSelect_UserByFollowingId();
        });
        return user;
    }

    public List<User> findFollowings(int userId) {
        User user = userBhv.selectByPK(userId).get();
        userBhv.loadUserFollowingByFollowingId(user, cb -> {
            cb.setupSelect_UserByFollowerId();
        });
        List<User> followings = user.getUserFollowingByFollowingIdList().stream()
                .map(userFollowing -> userFollowing.getUserByFollowerId().get()).collect(Collectors.toList());
        userBhv.loadFavorite(followings, cb -> {
            cb.setupSelect_Album();
        });
        return followings;
    }

    public List<User> findFollowers(int userId) {
        User user = userBhv.selectByPK(userId).get();
        userBhv.loadUserFollowingByFollowerId(user, cb -> {
            cb.setupSelect_UserByFollowingId();
        });
        List<User> followers = user.getUserFollowingByFollowerIdList().stream()
                .map(userFollowing -> userFollowing.getUserByFollowingId().get()).collect(Collectors.toList());
        userBhv.loadFavorite(followers, cb -> {
            cb.setupSelect_Album();
        });
        return followers;
    }

    public User save(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userBhv.insert(user);
        return user;
    }

    public void loadFollowing(User user) {
        userBhv.loadUserFollowingByFollowingId(user, cb -> {});
    }
}
