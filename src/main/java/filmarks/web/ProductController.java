package filmarks.web;

import filmarks.dbflute.exbhv.ProductBhv;
import filmarks.dbflute.exentity.Product;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @Autowired
    ProductBhv productBhv;

    @RequestMapping("/products")
    @ResponseBody
    public ModelAndView index(ModelAndView mav) {
        ListResultBean<Product> products = productBhv.selectList(cb -> cb.query().addOrderBy_Id_Asc());
        mav.addObject("products", products);
        mav.setViewName("product/index");
        return mav;
    }
}
