package com.example.j21;

public abstract class  ArithmeticClass implements ArithmeticInterface {
int num1;
int num2;
int num3;
	@Override
	public void setData(int num1, int num2) {
	this.num1=num1;
	this.num2=num2;
	
		
	}

//	@Override
//	public void cal() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void display() {
		System.out.println("Num 1 : "+num1+" Num 2 : "+num2+" Num 3 : "+num3);
	}
	

}
