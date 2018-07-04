package filmarks.domain;

import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.User;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    UserBhv userBhv;

    public User findByUsername(String username) {
        OptionalEntity<User> userOptionalEntity = userBhv.selectEntity(cb -> cb.query().setUsername_Equal(username));
        return userOptionalEntity.orElse(null);
    }
}
