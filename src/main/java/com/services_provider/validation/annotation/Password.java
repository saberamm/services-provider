package com.services_provider.validation.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER,
        ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
@Documented
public @interface Password {
    String message() default "Password must contain 1 digit," +
            " 1 lowercase letter, 1 uppercase letter," +
            " 1 special character, and at least 8 characters.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
