package LaptopWebsite.Nhom14.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import LaptopWebsite.Nhom14.Model.Product;
import LaptopWebsite.Nhom14.Model.User;
import LaptopWebsite.Nhom14.Service.ProductService;
import LaptopWebsite.Nhom14.Service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;

    @GetMapping
    private String showAllProducts(Model model){
        List<Product> products = productService.GetAll();
        model.addAttribute("products",products);
        return "admin";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
        return "redirect:/admin";
    }

    @PostMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") Integer id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "EDIT"; 
    }
 
    @PostMapping("/update")
    public String updateProduct(@ModelAttribute("product") Product product) {
        productService.updateProduct(product);
        return "redirect:/admin";
    }

    @GetMapping("/add")
    public String addProductForm(@ModelAttribute("product") Product product,Model model){
        model.addAttribute("product", new Product());
        return "ADD";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "redirect:/admin";
    }

    //Quản lý tài khoản

    @GetMapping("/accountmanage")
    private String showAllAccounts(Model model){
        List<User> users = userService.GetAll();
        model.addAttribute("users",users);
        return "listAccount";
    }

    @PostMapping("/accountmanage/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/admin/accountmanage";
    }
}
