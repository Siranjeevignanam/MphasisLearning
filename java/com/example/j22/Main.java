package com.example.j22;

public class Main {
	
	public static void main(String args[])
	{
		AddDto a=new AddDto();
		a.setNum1(13);
		a.setNum2(15);
		
		Arithmetic2 b=new Add();
		b.setData(a);
		b.cal();
		b.display();
		
		
	}

}
