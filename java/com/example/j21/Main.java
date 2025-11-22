package com.example.j21;

public class Main {
	
	public static void main(String args[])
	{
		ArithmeticInterface a=new Add();
		a.setData(17,27); 
		a.cal();
		a.display();
	}
	

}
