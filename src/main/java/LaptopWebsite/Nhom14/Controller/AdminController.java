package LaptopWebsite.Nhom14.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import LaptopWebsite.Nhom14.Model.Product;
import LaptopWebsite.Nhom14.Service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    ProductService productService;

    @GetMapping
    private String showAllProducts(Model model){
        List<Product> products = productService.GetAll();
        model.addAttribute("products",products);
        return "admin";
    }
}
