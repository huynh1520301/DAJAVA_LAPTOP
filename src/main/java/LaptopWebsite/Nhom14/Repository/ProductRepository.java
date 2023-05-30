package LaptopWebsite.Nhom14.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LaptopWebsite.Nhom14.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
