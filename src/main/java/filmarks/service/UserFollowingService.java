package filmarks.service;

import filmarks.dbflute.exentity.UserFollowing;
import filmarks.domain.UserFollowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFollowingService {

    @Autowired
    private UserFollowingRepository userFollowingRepository;

    public UserFollowing create(UserFollowing userFollowing) {
        userFollowingRepository.save(userFollowing);
        return userFollowing;
    }
}
