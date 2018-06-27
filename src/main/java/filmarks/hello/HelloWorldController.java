package filmarks.hello;

import filmarks.dbflute.exbhv.ProductBhv;
import filmarks.dbflute.exentity.Product;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController
{

    @Autowired
    ProductBhv productBhv;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        ListResultBean<Product> products = productBhv.selectList(cb -> {

        });

        return products.get(0).getTitle();
    }
}
