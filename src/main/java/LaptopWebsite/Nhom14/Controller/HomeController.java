package LaptopWebsite.Nhom14.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import LaptopWebsite.Nhom14.Model.Product;
import LaptopWebsite.Nhom14.Service.ProductService;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ProductService productService;

    @GetMapping
    public String home(){return "index";}

    // @Autowired
    // @RequestMapping("/login")
    // public String login(){return ""}

    @GetMapping("/search")
    public List<Product> search(@RequestParam("query") String query) {
        // Perform the search based on the query
        List<Product> searchResults = productService.searchProducts(query);
        
        return searchResults;
    }

}
