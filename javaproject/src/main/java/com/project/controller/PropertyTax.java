package com.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.Read;
import com.project.DAO.PropertyDAO;
import com.project.model.Property;
import com.project.service.CalculateProperty;

import com.project.validations.PropertyValidation;

public class PropertyTax {

	Property a = new Property();
	CalculateProperty c = new CalculateProperty();

	PropertyDAO p = new PropertyDAO();
	PropertyValidation v = new PropertyValidation();

	public void method() throws Exception {
		while (true) {

			System.out.println(
					"\n\nEnter your choice:\n 1-Insert \n 2-Calculate property tax \n 3-List all properties \n 4-Exit");
			Scanner sc = new Scanner(System.in);

			List<Property> l1 = new ArrayList<>();
			int ch = sc.nextInt();
			switch (ch) {
			case 1:

				
					
					
					while (true) {
						System.out.println("Enter base value");
						int base = Read.sc.nextInt();
						if (v.checkBase(base)) {
							a.setBaseValue(base);
							break;
						}
							System.out.println("Base value should be more than 0");
						

					}

					System.out.println("Enter built up area");
					a.setBuiltupArea(sc.nextInt());

					while (true) {
						System.out.println("Enter age");
						int age = Read.sc.nextInt();
						if (v.checkAge(age)) {
							a.setAge(age);
							break;
						}

						
							System.out.println("Age should be more than 0");
						
					}

					while (true) {
						System.out.println("Is this a city");
						String isCity = sc.next();
						if (v.checkIsCity(isCity)) {
							a.setIsCity(isCity);
							break;
						}

						
							System.out.println("City should be Y/y or N/n");
						

					}

					a.setPropertyTax(0);
					System.out.println("The property was added");
					break;
//					if (v.propertyValidation(a)) {
//						p.insertProperty(a);
//					}
//
//					else {
//						System.out.println("Invalid input");
//						System.out.println("Check base value(>0),\nCheck age(>0)\nCheck city(Y/y or N/n)");
//						continue;
//					}
//					break;
					
				

			case 2:
				System.out.println("Enter the respective id of the property to calculate tax");
//				System.out.println("Enter id to calculate");
				l1 = p.getAllProperty();
				int index = Read.sc.nextInt();
				a = l1.get(index - 1);
				int res = c.calculate(a);
				a.setPropertyTax(res);
				p.updateProperty(a);
				System.out.println("Property Tax is " + res);
				break;

			case 3:
				p.printAllProperty();
			case 4:
				return;

			default:
				System.out.println("Invalid choice");

			}
		}
	}

}
