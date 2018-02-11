package com.practice.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidation implements
		ConstraintValidator<CourseCode, String> {

	private String[] prefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub

		this.prefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String theCode,
			ConstraintValidatorContext validatorContext) {

		boolean result=false;

		if (theCode != null) {

			for (String string : prefix) {

				if (result = theCode.startsWith(string)) {

					break;

				}
			}

		}
		else
			return true;
		
		return result;

	}

}
