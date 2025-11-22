package com.example.j2;

public class Main2 {
	
	public void display()
	{
		System.out.println("Sub class");
	}
	
	
	public static void main(String args[]) {
		Add1 ab=new Add1();
        ab.a.set(17,18);
        ab.cal();
        ab.a.display();
        
        Main2 m=new Main2();
        m.display();
//        super.display();
	}
}
