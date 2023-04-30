package com.dz.basics;

public class IdetifierBasic {

	//# identifier is case sensitive
	String empname="abc";
	String EMPNAME="pqr";
	String EmpName="xyz";
	
	//# allowed character in java 
//	int total_number#; // not valid
	int total_number;  // valid
	
	//# Identifier should not start with digits
//	String 123total;   // not valid
	
	
	//# there is no length limit but its lengthy name , reduce readabilty of code
	//int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;
	
	//# Can not use reserved word/ keywords as identifier
//	int if=10;
	
	public static void main(String[] args) {
		
		//#	All predefine java classes and interfaces we can use as identifier
		//  never use predefine java classes or interfaces as identifier because it is not good programming practice
		String String ="abc";
		System.out.println(String);
		
	}
	

	// there is difference between reserved word and pre-defined java classes .
	
}
