package com.codegym.demo_c0821g1_2.common.validator;

import com.codegym.demo_c0821g1_2.common.NameConstraint;
import com.codegym.demo_c0821g1_2.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameConstraint, String> {
    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public void initialize(NameConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(iStudentRepository.getByName(value)!=null) {
            return false;
        }
        return value.matches("[A-Za-z ]{4,}");
    }
}
