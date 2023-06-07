package LaptopWebsite.Nhom14.Controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import LaptopWebsite.Nhom14.Model.User;
import LaptopWebsite.Nhom14.Service.ProductService;
import LaptopWebsite.Nhom14.Service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ProductService productService;
    
    @Autowired
    UserService userService;

    @GetMapping
    public String home(){return "index";}

    @RequestMapping("/cart")
    public String cart(){return "Cart";}

    @RequestMapping("/login")
    public String login(){return "Login";}

    @GetMapping("/register")
    public String RegisterForm(Model model) {
        model.addAttribute("user", new User()); 
        return "Register";
    }

    @PostMapping("/register")
    public String addregister(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/";
    }
}
