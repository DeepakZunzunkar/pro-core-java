package com.dz.java8;

import java.util.function.Function;
import java.util.function.Predicate;

import com.dz.model.Emmployee;

public class Demo1 {
	
		//normal way of writing method
		public static int squareIt(int n){
			
			return n*n;
		}
		
		public void m1() {
			System.out.println("some one call me");
		}
		
		public static void main(String[] args){
		
			// Function
			Function<Integer, Integer> f=i->i*i;		//one line code
			
			System.out.println("square of 4 "+f.apply(4));
			System.out.println("square of 5 "+f.apply(5));
			System.out.println("---------------------------------");
			System.out.println("square of 4 "+squareIt(4));
			System.out.println("square of 5 "+squareIt(5));
			
			System.out.println("---------------------------------");
			
			//Predicate
			Predicate<Integer> p=i->i%2==0;
			System.out.println(p.test(4));
			System.out.println("-------------------------------");
			
			
			Predicate<Emmployee> prd1=emp -> emp.getGender().equalsIgnoreCase("M");
			Predicate<Emmployee> prd2=emp -> emp.getSalary()>5000;
			
			if(prd1.and(prd2).test(new Emmployee("M",6000.00))) {
				System.out.println("ok..");
			}else {
				System.out.println("not ok..");
			}
		}
}
