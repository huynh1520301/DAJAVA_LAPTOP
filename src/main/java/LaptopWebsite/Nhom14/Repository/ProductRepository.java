package LaptopWebsite.Nhom14.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import LaptopWebsite.Nhom14.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    @Query("SELECT p FROM Product p WHERE LOWER(p.productName) LIKE %:keyword%")
    List<Product> searchProducts(String keyword);
}
