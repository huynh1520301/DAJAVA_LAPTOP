package LaptopWebsite.Nhom14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Nhom14Application {

	public static void main(String[] args) {
		SpringApplication.run(Nhom14Application.class, args);
	}

}
