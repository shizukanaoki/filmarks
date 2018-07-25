package filmarks.service;

import filmarks.dbflute.exentity.User;
import filmarks.domain.UserRepository;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Userに関係する操作を担当するクラス
 *
 * @author naoki.shizuka
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("Username is empty");
        }
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found for name: " + username);
        }
        return user;
    }

    public User findOne(int userId) throws EntityAlreadyDeletedException {
        return userRepository.findOne(userId);
    }

    public List<User> findFollowings(int userId) {
        return userRepository.findFollowings(userId);
    }

    public List<User> findFollowers(int userId) {
        return userRepository.findFollowers(userId);
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
