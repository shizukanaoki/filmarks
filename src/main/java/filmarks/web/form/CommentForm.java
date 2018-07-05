package filmarks.web.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentForm {
    private int userID;
    private int albumID;
    private String content;
    private float rate;
}
