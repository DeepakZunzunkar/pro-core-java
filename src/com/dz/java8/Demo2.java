package com.dz.java8;

public class Demo2 {

	public static void main(String[] args) {
		
		
//		Ex:02
		Interf1 interf1=()->System.out.println("Hi...I am implemented by lambda expresssion ...");
		interf1.m();
		
		
		//Ex: 03
		//no need of Test2 class , same implementation we can provide though lambda expression.
		Interf2 intrf2=(a,b)-> { System.out.println("sum : "+ (a+b) ); };
		intrf2.sum(4, 5);
		intrf2.sum(5, 5);
		
		//Reference is compulsory to hold lambda expression and this reference must be functional interface.
		//Functional Interface can be used to provide reference for your lambda expression.
		
		// how compiler guess the type automatically ?
		// : compiler knows that functional Interface will contain only single abstract method .
		//	 and while implementing lambda expression we no need to provide type as because while compiling
		//   , compiler already know the type of argument to the method because there is only single abstract method.
		
		// Do compiler gets overHead of resolving all this ? and it affect performance ?
		//: there never be performance issue because code will be compile only once after compilation only now it will move to the production and execution start 
		//  performance is always related run time execution not related to compile time .
	}
}

//Ex :03
interface Interf2{
	
	public void sum(int a,int b);
	
}

class Test2 implements Interf2{

	@Override
	public void sum(int a, int b) {
		System.out.println("Add :"+(a+b));
	}
	
}


// Ex : 01 
// when we try to add one more abstract method in child interface B then,
// compiler will alert you because of this @FunctionalInterface  annotation 

@FunctionalInterface
interface A {
	public void m();
}

@FunctionalInterface   
interface B extends A{

//	public void m1();
	
}


//Ex: 02

@FunctionalInterface
interface Interf1 {

	public void m();
	
}

//no need of this class
class Test1 implements Interf1{				 

	@Override
	public void m() {						//for this we can implement functional interface with lambda expression also 
		System.out.println("Hellow ...");	//not required  to write separate top level class
	}										//lambda expression for this method is ()->System.out.println("Hellow ...");
}

