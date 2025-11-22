package com.example.day1;

public class Addition {

	int num1,num2;
	static int num3;
	public Addition() {
		System.out.println("This is a zero argument constructor");
	}
	public void finalize()
	{
		System.out.println("I am in destructor");
	}
	{
		System.out.println("Anonymous");
	}
	public void read()
	{
		System.out.println("Enter two numbers");
		num1=Read.sc.nextInt();
		num2=Read.sc.nextInt();
		
	}
	
	public void setData
	(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public void compute()
	{
		this.num3=this.num1+this.num2;
	}
	
	public void display()
	{
		System.out.println("Sum is "+this.num3);
	}
}
