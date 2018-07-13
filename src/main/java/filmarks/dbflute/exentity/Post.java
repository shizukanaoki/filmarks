package filmarks.dbflute.exentity;

import filmarks.dbflute.bsentity.BsPost;
import filmarks.domain.Postable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The entity of POST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */

@NoArgsConstructor
public class Post extends BsPost {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private Postable postable;

    public Post(Postable postable) {
        this.postable = postable;
    }

    public String getContent() {
        return postable.getContent();
    }
    
    public Album getAlbum() {
        return postable.getRelatedAlbum();
    }
}
