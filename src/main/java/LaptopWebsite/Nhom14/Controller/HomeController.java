package LaptopWebsite.Nhom14.Controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import LaptopWebsite.Nhom14.Service.ProductService;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ProductService productService;

    @GetMapping
    public String home(){return "index";}

    @RequestMapping("/cart")
    public String cart(){return "Cart";}

    // @Autowired
    // @RequestMapping("/login")
    // public String login(){return ""}
}
