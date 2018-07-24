package filmarks.service;

import filmarks.dbflute.exentity.UserFollowing;
import filmarks.domain.UserFollowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserFollowingに関係する操作を担当するクラス
 *
 * @author naoki.shizuka
 */
@Service
public class UserFollowingService {

    @Autowired
    private UserFollowingRepository userFollowingRepository;

    public boolean isFollowing(int followingId, int followerId) {
        return userFollowingRepository.isFollowing(followingId, followerId);
    }

    public List<UserFollowing> findUserFollowingsByUserId(int userId) {
        return userFollowingRepository.findByUserId(userId);
    }

    public UserFollowing loadUserFollowingByFollowingAndFollowerId(int followingId, int followerId) {
        return userFollowingRepository.findByFollowingAndFollowerId(followingId, followerId);
    }

    public UserFollowing create(UserFollowing userFollowing) {
        userFollowingRepository.save(userFollowing);
        return userFollowing;
    }

    public void delete(UserFollowing userFollowing) {
        userFollowingRepository.delete(userFollowing);
    }
}
