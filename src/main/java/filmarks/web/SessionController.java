package filmarks.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * セッション関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class SessionController {

    @RequestMapping("/login")
    public String login() {
        return "session/login";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "session/logout";
    }
}
