package filmarks.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * セッション関係のページのコントローラ
 *
 * @author naoki.shizuka
 */
@Controller
public class SessionController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "session/login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "session/logout";
    }
}
