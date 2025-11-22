package com.example.day3;

import java.util.function.Predicate;

interface Test1<T,T1>
{
	public T1 f1(T x);
}

public class Demo3 {
	
	public static void main(String args [])
	{
		Test1<String,Integer> ob=(x)->(x.length());
		System.out.println(ob.f1("Some values"));
		Predicate<Integer> ob1=(x)->(x%2==0);
		if(ob1.test(3))
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("False");
		}
	}

}
