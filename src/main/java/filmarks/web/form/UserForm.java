package filmarks.web.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserForm {

    @NotEmpty
    @Pattern(regexp = "^[A-Za-z\\d$@$!%*#?&]{8,55}$")
    private String password;

    @NotEmpty
    private String username;
}
