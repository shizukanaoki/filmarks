package filmarks.service;

import filmarks.dbflute.exbhv.PostBhv;
import filmarks.dbflute.exentity.Comment;
import filmarks.dbflute.exentity.Post;
import filmarks.dbflute.exentity.User;
import filmarks.domain.UserRepository;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostBhv postBhv;


    public List<Post> findPostListByUserId(int userId) {
        User user = userRepository.findOne(userId);
        List<Integer> followingIds = user.getUserFollowingByFollowingIdList().stream()
                .map(following -> following.getFollowerId())
                .collect(Collectors.toList());

        ListResultBean<Post> posts = postBhv.selectList(postCB -> {
            postCB.setupSelect_User();
            postCB.setupSelect_Favorite().withAlbum();
            postCB.setupSelect_Comment().withAlbum();
            postCB.query().setUserId_InScope(followingIds);
            postCB.query().addOrderBy_CreatedAt_Desc();
        });


        List<Post> postList = posts.stream().map(post -> {
            if (post.getTargetType().equals("Comment")) {
                Comment comment = post.getComment().get();
                post.setPostable(comment);
                return post;
            } else {
                post.setPostable(post.getFavorite().get());
                return post;
            }
        }).collect(Collectors.toList());

        return postList;
    }
}
