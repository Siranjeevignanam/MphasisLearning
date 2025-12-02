package com.project;

import java.util.Scanner;

import com.project.controller.Login;
import com.project.controller.PropertyTax;
import com.project.controller.Total;
import com.project.controller.VehicleTax;

public class Main {
	public static void main(String args[]) throws Exception {
		VehicleTax v = new VehicleTax();
		PropertyTax p = new PropertyTax();
		Total t = new Total();
		Login l = new Login();

		String hyphen = "-";
		System.out.println(hyphen.repeat(30));
		System.out.println("Welcome to taxation app");
		System.out.println(hyphen.repeat(30));

		boolean lo = l.login();

		if (lo) {
			while (true) {

				System.out.println("\nEnter your choice : \n1-Property tax \n2-Vehicle tax \n3-Total \n4-Exit  ");
				Scanner sc = new Scanner(System.in);
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					p.method();
					break;
				case 2:
					v.method();
					break;
				case 3:
					t.totalTax();
					break;
				case 4:
					System.out.println("Thank you for using");
					return;
				default:
					System.out.println("Wrong choice");
				}
			}
		}

	}

}
