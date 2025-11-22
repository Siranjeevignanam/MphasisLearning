package com.example.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo4 {
	
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<>();
	l1.add(154);
	l1.add(100);
	l1.add(27);
	l1.add(58);
	l1.add(32);
	l1.add(90);
	l1.add(194);

	System.out.println(l1);
	System.out.println();
	
	
	
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i));
	}
	System.out.println("Using index...");
	System.out.println();
	
	
	
	
	for(int x:l1)
	{
		System.out.println(x);
	}
	System.out.println("Using for each");
	
	
//	l1.forEach(x) -> {System.out.println(x+" ");});
	
	
	l1.forEach(System.out::println);
	System.out.println("Using System.out::println");
	
	
	
	l1.forEach(Demo4::psv);
	System.out.println("using for each consumer and using static method");
	
	
	
	l1.forEach(Demo4::p1);
	System.out.println("square root");
	
	
	
	
	Iterator<Integer>it=l1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	System.out.println(l1.get(4));
	
	
	l1.remove(4);
	System.out.println(l1.get(4));//to remove by index
	
	l1.remove(new Integer(100));//to remove by value
	System.out.println(l1);
	
	List<Integer> l2=new ArrayList<>(Arrays.asList(new Integer[] {20,30,40,70,90,154})); //converts array as array list
	l1.addAll(l2); //since we are adding collection
	l1.retainAll(l2);
	l2.add(25);
	System.out.println(l2);
	//remove all,clear
	Collections.sort(l1);
	System.out.println(l1);
	l1.clear();
	System.out.println(l1);
	
	
	}

private static void psv(Integer x)
{
System.out.println(x+"--> "+(x*x));	
}

private static void p1(Integer x)
{
	System.out.println(x+"-->"+Math.sqrt(x));
}
}
