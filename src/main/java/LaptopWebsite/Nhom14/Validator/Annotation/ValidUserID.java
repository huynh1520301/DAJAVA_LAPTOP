package LaptopWebsite.Nhom14.Validator.Annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import LaptopWebsite.Nhom14.Validator.ValidUserIDValidator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUserIDValidator.class)
@Documented
public @interface ValidUserID {
    String message() default "Invalid User ID";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
