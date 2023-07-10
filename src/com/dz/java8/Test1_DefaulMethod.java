package com.dz.java8;


interface i1{
	void m1();
	default void m2() {
		System.out.println("dumy implemenation...");
	}
	
	default void m3() {
		System.out.println("dumy implemenation...");
	}
	
	
//	A default method cannot override a method from java.lang.Object 
	/*default int hashCode() {
		return 10;
	}*/

}

// Implementation class which is not satisfy with default method implementation 
// only those can implement , rest implementation classes not compulsory required to implement .
public class Test1_DefaulMethod implements i1{

	@Override
	public void m1() {
		
	}
	
}

class Test1_DefaulMethod1 implements i1{

	@Override
	public void m1() {
		
	}
	
//	default method is allowed only in interface .
	/*public default void m2() {
		
	}*/
	
	public void m2() {
		System.out.println("Implemenation for default method ..");
	}
}


