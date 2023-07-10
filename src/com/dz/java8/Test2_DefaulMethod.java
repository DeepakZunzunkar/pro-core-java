package com.dz.java8;

interface Left{
	default void m1() {
		System.out.println("Left Interface m1 method ");
	}
	
}

interface Right{
	default void m1() {
		System.out.println("Right Interface m1 method ");
	}
}

public class Test2_DefaulMethod implements Left,Right{

	@Override
	public void m1() {

		System.out.println("our own Override m1 method ...");
		Left.super.m1();
//		Right.super.m1();
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method ");
		Test2_DefaulMethod t2=new Test2_DefaulMethod();
		t2.m1();
		
//		Left t2=new Test2_DefaulMethod();
//		t2.m1();
	}
}
