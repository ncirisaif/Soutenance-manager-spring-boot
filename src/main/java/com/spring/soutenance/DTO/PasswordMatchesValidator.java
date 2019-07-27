package com.spring.soutenance.DTO;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        UserDtoRegistration user = (UserDtoRegistration) o;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}
