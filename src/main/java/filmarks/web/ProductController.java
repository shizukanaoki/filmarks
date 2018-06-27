package filmarks.web;

import filmarks.dbflute.exbhv.ProductBhv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @Autowired
    ProductBhv productBhv;

    @RequestMapping("/products")
    public String index() {
        return "product/index";
    }
}
