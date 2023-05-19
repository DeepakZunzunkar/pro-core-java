package com.dz.basics.modifiers;
/*
 * 
 * The final keyword in java is used to restrict the user. 
The java final keyword can be used in many context. Final can be:
	1.variable
	2.method
	3.class
*/

/*** Q) What is blank or uninitialized final variable ? ********/
/*A final variable that is not initialized at the time of declaration is known as blank final variable.
If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed,
it is useful. For example PAN CARD number of an employee.*/

/*** Q.Can we initialize blank final variable? **/
// Yes, but only in constructor

/***static blank final variable ***/
/*A static final variable that is not initialized at the time of declaration 
is known as static blank final variable. 
It can be initialized only in static block.*/


public class FinalDemo1 {

	final int speedlimit;
	
	//static blank final variable
	static final int data;

	static{
		// if we don't initialize here then we will get compile time error.
		data=50;
	}
	
	FinalDemo1(){
		
		// if we don't initialize here then we will get compile time error.
		speedlimit=100;
		System.out.println(speedlimit);
	}
	
	public static void main(String[] args) {
		
		FinalDemo1 b=new FinalDemo1();
//		System.out.println(FinalDemo1.data);
//		System.out.println(data);
		System.out.println(b.data);
	}
}

/********************final class*********************/
//If you make any class as final, you cannot extend it.
/*
 final class Car{
	
}
class Altroz extends Car{
	void run(){
		System.out.println("running..");
	}
	public static void main(String[] args) {
		Altroz h=new Altroz();
		h.run();
	}
}*/
//op: compiler time error

/****************************final method *******/
//If you make any method as final, you cannot override it.

/*class bike{
	final void run(){
		System.out.println("running..");
	}
}
class honda extends bike{
	
	void run(){
		System.out.println("running ata speed of 100kmps");
	}
	public static void main(String[] args) {
		honda h=new honda();
		h.run();
	}
}*/
//op: compiler time error

/****************************final veriable **********/
//If you make any variable as final, 
//you cannot change the value of final variable(It will be constant).

/*class Squuty {
	
	final int speedlimit=50;
	
	void run(int speedlimit){
		this.speedlimit=speedlimit;
	}
	
	public static void main(String[] args) {
		
		new Squuty().run(100);
	}
}*/
//output : compiler error
