package LaptopWebsite.Nhom14.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LaptopWebsite.Nhom14.Model.Product;
import LaptopWebsite.Nhom14.Repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> GetAll(){return productRepository.findAll();}

    public Product getProductById(Integer id){return productRepository.findById(id).orElse(null);}

    //Service them moi product
    public void addProduct(Product product){productRepository.save(product);}

    //Service update moi product
    public void updateProduct(Product product){productRepository.save(product);}

    //Service delete product
    public void deleteProduct(Integer id){productRepository.deleteById(id);}
}
