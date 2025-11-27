package com.project;

import java.util.Scanner;

import com.project.property.PropertyTax;
import com.project.total.Total;
import com.project.vehicle.VehicleTax;

public class Main 
{
public static void main(String args[]) throws Exception
{
	VehicleTax v=new VehicleTax();
	PropertyTax p=new PropertyTax();
	Total t=new Total();
	System.out.println("Welcome to taxation app");
	System.out.println("Enter User name");
	String name=Read.sc.next();
	System.out.println("Enter password");
	String pw=Read.sc.next();
	
//	if(name.equals("Siranjeevi")&& pw.equals("swepravrem7781"))
//	{
		while(true)
		{
			
			System.out.println("Enter 1 for Property tax \nEnter 2 for Vehicle tax \nEnter 3 for Total \nEnter 4 for Exit  ");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: p.method();break;
			case 2: v.method();break;
			case 3:t.totalTax();break;
			case 4 : System.out.println("Thank you for using");break;
			default:System.out.println("Wrong choice");
			}
		}
//	}
//	else
//	{
//		System.out.println("Invalid credentials");
//		return;
//	}
	
}

}

