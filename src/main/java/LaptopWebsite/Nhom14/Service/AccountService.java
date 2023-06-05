package LaptopWebsite.Nhom14.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LaptopWebsite.Nhom14.Model.Account;
import LaptopWebsite.Nhom14.Repository.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void save(Account account)
    {
        accountRepository.save(account);
    }
}
