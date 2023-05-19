package com.dz.basics.modifiers.package1;


public class TestWithinCurrentPackage {


	public static void main(String[] args) {
		
		A a=new A();
		System.out.println(a.m1()+" "+a.m2()+" "+a.m4()+" ");
		System.out.println(a.a1+" "+a.a2+" "+a.a4);
		System.err.println("------------------------");	
		B aa=new B();
		System.out.println(aa.m1()+" "+aa.m2()+" "+aa.m4()+" "+aa.m6());
		
		
		A aaa=new B();
		System.out.println(aaa.m1()+" "+aaa.m2()+" "+aaa.m4()+" ");
	}
}
