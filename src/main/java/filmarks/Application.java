package filmarks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * メインクラス
 *
 * @author naoki.shizuka
 */
@SpringBootApplication
@Import(filmarks.dbflute.allcommon.DBFluteBeansJavaConfig.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
