package LaptopWebsite.Nhom14.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import LaptopWebsite.Nhom14.Model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("SELECT u FROM Account u WHERE u.username = ?1")
    Account findByUsername(String username);
}