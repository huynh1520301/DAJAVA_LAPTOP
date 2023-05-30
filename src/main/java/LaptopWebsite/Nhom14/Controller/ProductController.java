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
import LaptopWebsite.Nhom14.Service.ProductService;

@RequestMapping("/products")
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    private String showAllProducts(Model model){
        List<Product> products = productService.GetAll();
        model.addAttribute("products",products);
        return "product/list";
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

    // @GetMapping("/edit/{id}")
    // public String editProductForm(@PathVariable("id") Integer id, Model model) {
    //     Optional<Product> editProduct = Optional.ofNullable(productService.geProductById(id));
    //     if (editProduct.isPresent()) {
    //         model.addAttribute("product", editProduct.get());
    //         return "product/edit";
    //     }
    //     else {
    //         return "not-found";
    //     }
    // }

    // @PostMapping("/edit")
    // public String editProduct(@ModelAttribute("product") Product product) {
    //     Category category = product.getCategory();
    //     categoryService.saveCategory(category); // Save the Category entity

    //     bookService.updateBook(book);
    //     return "redirect:/books";
    // }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
        return "redirect:/books";
    }
}
