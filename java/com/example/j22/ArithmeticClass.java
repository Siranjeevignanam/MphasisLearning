package com.example.j22;

public abstract class ArithmeticClass implements Arithmetic2 {

	
	AddDto ob;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Num 1 : "+this.ob.getNum1()+ " Num 2 : "+this.ob.getNum2()+ " Num 3 : "+this.ob.getNum3());
	}

	

	@Override
	public void setData(AddDto obj) {
		// TODO Auto-generated method stub
		this.ob=obj;
	}

}
