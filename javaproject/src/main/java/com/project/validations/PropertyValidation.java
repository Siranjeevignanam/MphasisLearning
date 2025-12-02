package com.project.validations;

import com.project.model.Property;

public class PropertyValidation {

	
	public boolean checkBase(int base) {
		if (base > 0)
			return true;
		else {

			return false;
		}
	}

	public boolean checkAge(int age) {
		if (age > 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean checkIsCity(String city) {
		if (city.equalsIgnoreCase("y") || city.equalsIgnoreCase("n"))
			return true;
		else
			return false;
	}
}