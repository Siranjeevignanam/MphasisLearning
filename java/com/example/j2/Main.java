package com.example.j2;

public class Main {
	
	public static void main(String [] args)
	{
		Arithmetic ar =new Arithmetic(); //loose coupling
		
//		Add a=new Add();
//		Subtract s=new Subtract();
//		Multiply m=new Multiply();
//		Divide d= new Divide();
		
		ar.set(17,19);
		ar.cal();
		ar.display();
		
		ar=new Subtract();
		
		ar.set(17,19);
		ar.cal();
		ar.display();
		
		
		
	}

}
