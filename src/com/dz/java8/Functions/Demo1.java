package com.dz.java8.Functions;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.dz.java8.stream.Emp;

public class Demo1 {

//	1. Predicate -- boolean value function , take input
//	2. Consumer -- only consume means only take input but no output
//	3. Function -- take both input and output
//	4. supplier -- only supply no input only output 
	
	public static void main(String[] args) {
		
//		1.
		Predicate<String> strLength=(str)-> str.length() > 5;
		System.out.println(strLength.test("Deepak"));
		
//		2. modifies the data 
		Emp emp=new Emp();
		Consumer<Emp> setName=(empployee)-> empployee.setName("DZ");
		
		setName.accept(emp);
		
		System.out.println(emp.getName());
		
		//3.Function
		// first arg is input type, second arg is output type;
		Function<String,Integer> funTest=num-> Integer.parseInt(num);
		
		System.out.println(funTest.apply("50"));
		
		Function<Integer, String> getSquear=num-> "squar of "+num+" is "+(num*num);
		System.out.println(getSquear.apply(3));
 		
		
		//supplier
		Supplier<Double> getRandomDouble=()->Math.random();
		System.out.println(getRandomDouble.get());
		
	}
}

