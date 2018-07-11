package filmarks.web.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
public class CommentForm {

    @NotEmpty
    @Size(min = 1, max = 200)
    private String content;

    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("10.0")
    @Digits(integer=2, fraction=1)
    private BigDecimal rate;
}
