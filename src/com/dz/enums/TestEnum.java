package com.dz.enums;

import com.dz.enums.Constant.Days;

public class TestEnum {

	//1. it is introduce in java 1.5 
	//2. if we want to represent group of named constant then we should go for enum
	//3. it can include methods and fields just like regular classes.
	//4. When we create an enum class, the compiler will create instances (objects) of each enum constants.
	//5. all enum constant is always public static final by default.
	
	public static void main(String[] args) {
		
//		System.out.println(Months.JAN);
		
		System.out.println(Days.fri.getDay());
		System.out.println(Days.fri.getIndex());
	}
}
