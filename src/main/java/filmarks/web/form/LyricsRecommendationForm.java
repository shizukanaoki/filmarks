package filmarks.web.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class LyricsRecommendationForm {

    @NotEmpty
    @Size(min = 1)
    private String lyrics;

    @NotNull
    private int songId;
}
