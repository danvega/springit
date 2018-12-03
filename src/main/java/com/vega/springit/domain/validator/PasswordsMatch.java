package com.vega.springit.domain.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordsMatchValidator.class)
@Target({ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordsMatch {

    String message() default "Password & Password Confirmation do not match.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
