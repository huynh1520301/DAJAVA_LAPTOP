package LaptopWebsite.Nhom14.Validator;


import LaptopWebsite.Nhom14.Model.User;
import LaptopWebsite.Nhom14.Validator.Annotation.ValidUserID;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIDValidator implements ConstraintValidator<ValidUserID, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
