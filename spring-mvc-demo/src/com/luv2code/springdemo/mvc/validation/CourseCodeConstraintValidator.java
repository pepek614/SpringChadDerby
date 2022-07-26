package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
implements ConstraintValidator<CourseCode, String>{

	private String[] coursePrefixes;
	@Override
	public void initialize(CourseCode theCourseCode) {
		this.coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = false;
		
		if (theCode !=null) {
			for (String a : coursePrefixes) {
				result = theCode.startsWith(a);
				if (result) {
					break;
				}
			}
		} else {
			result= true;
		}
		return result;
	}

}
