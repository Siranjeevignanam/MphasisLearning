package com.example.j2;

import com.example.day1.Read;

public class Calculator {
	
	public static void main(String args[]) {

		Arithmetic obj[]=new Arithmetic[10];
		obj[0]=new Add();
		obj[1]=new Subtract();
		obj[2]=new Multiply();
		obj[3]=new Divide();
		
		System.out.println("Enter a number from 1 to 4");
		int ch=Read.sc.nextInt();
		System.out.println("Enter two numbers");
		obj[ch-1].set(Read.sc.nextInt(), Read.sc.nextInt());
		obj[ch-1].cal();
		obj[ch-1].display();
		
	}
	
	
	
	

}
