package com.example.day3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicates {

	public static void main(String args [])
	{
		Predicate<Integer> ob=(a)->(a%2==0);
		
		System.out.println(ob.test(26));
		List<Integer> l1=new ArrayList<>();
		Consumer<Integer> c= (a)->System.out.println(a*a);
		
		c.accept(32);
		
//	Supplier<Integer> s=()-> {LocalDate n =LocalDate.now();
//			return n;};
	}
	
	
}
