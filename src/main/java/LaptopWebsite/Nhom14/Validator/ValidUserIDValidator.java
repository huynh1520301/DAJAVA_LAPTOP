package LaptopWebsite.Nhom14.Validator;

import LaptopWebsite.Nhom14.Model.Account;
import LaptopWebsite.Nhom14.Validator.Annotation.ValidUserID;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIDValidator implements ConstraintValidator<ValidUserID, Account> {
    @Override
    public boolean isValid(Account account, ConstraintValidatorContext context){
        if(account == null)
            return true;
        return account.getId() != null;
    }
}
