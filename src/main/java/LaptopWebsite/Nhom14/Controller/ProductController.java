package LaptopWebsite.Nhom14.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import LaptopWebsite.Nhom14.Model.Product;
import LaptopWebsite.Nhom14.Service.ProductService;

@RequestMapping("/product")
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    private String showAllProducts(Model model){
        List<Product> products = productService.GetAll();
        model.addAttribute("products",products);
        return "Product";
    }

    @GetMapping("/add")
    public String addProductForm(Model model)
    {
        model.addAttribute("product", new Product());
        return "product/add";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute("product") Product product){
        return "redirect:/products";
    }
    
}
