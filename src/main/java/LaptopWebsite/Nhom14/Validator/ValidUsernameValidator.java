package LaptopWebsite.Nhom14.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import LaptopWebsite.Nhom14.Repository.AccountRepository;
import LaptopWebsite.Nhom14.Validator.Annotation.ValidUsername;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context){
        if(accountRepository == null)
            return true;
        return accountRepository.findByUsername(username) == null;
    }
}
