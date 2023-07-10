package com.dz.java8;

interface Interf3{
	
	public static void m1() {
		System.out.println("Interface Static Method ...");
	}
	
	public static void main(String[] args) {
		System.out.println("Interface static main Method ...");
	}
}

public class Test1_StaticMethod implements Interf3 {

	public static void main(String[] args) {
		
		Interf3.m1();
		Interf3.main(new String[] {"java","paython"});
		
//		invalid
		/*m1();
		Test1_StaticMethod.m1();
		Test1_StaticMethod t1=new Test1_StaticMethod();
		t1.m1();*/
	}
}
