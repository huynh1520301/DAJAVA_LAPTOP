package LaptopWebsite.Nhom14.Model;

import java.util.List;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "categoryName")
    private String categoryName;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products; 
}
