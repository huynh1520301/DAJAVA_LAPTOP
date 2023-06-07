package LaptopWebsite.Nhom14.Model;

import java.util.ArrayList;
import java.util.List;

import LaptopWebsite.Nhom14.Validator.Annotation.ValidUsername;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 50, nullable = false, unique = true)
    @NotBlank(message = "Username must required")
    @Size(max = 50, message = "Username must less than 50 characters")
    @ValidUsername
    private String username;

    @Column(name = "password", length = 250, nullable = false)
    @NotBlank(message = "Password must required")
    private String password;

    @Column(name = "email", length = 50)
    @Email(message = "Email must required")
    @Size(max = 50, message = "Email must less than 50 characters")
    private String email;

    @Column(name = "name", length = 50, nullable = false)
    @NotBlank(message = "Your name must required")
    @Size(max = 50, message = "Your name must less than 50 characters")
    private String name;

    @Column(name = "phone", length = 12, nullable = false)
    @NotBlank(message = "Your phone number must required")
    @Size(max = 12, message = "Your phone must less than 12 characters")
    private String phone;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();
}
