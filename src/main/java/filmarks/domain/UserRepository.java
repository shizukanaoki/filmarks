package filmarks.domain;

import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.User;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    UserBhv userBhv;

    public User findByUsername(String username) {
        OptionalEntity<User> userOptionalEntity = userBhv.selectEntity(cb -> cb.query().setUsername_Equal(username));
        return userOptionalEntity.orElse(null);
    }

    public User findOne(int id) throws EntityAlreadyDeletedException {
        OptionalEntity<User> userOptionalEntity = userBhv.selectByPK(id);
        return userOptionalEntity.get();
    }

    public User save(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userBhv.insert(user);
        return user;
    }
}
