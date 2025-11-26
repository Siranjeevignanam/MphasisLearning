package com.project;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println("Enter a choice");
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	PropertyTax p=new PropertyTax();
	switch(ch)
	{
	case 1: p.method();
		
		default:System.out.println("Wrong choice");
	}
}
}
