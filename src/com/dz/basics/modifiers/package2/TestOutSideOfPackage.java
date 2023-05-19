package com.dz.basics.modifiers.package2;

import com.dz.basics.modifiers.package1.A;
import com.dz.basics.modifiers.package1.B;

public class TestOutSideOfPackage 
{
	public static void main(String[] args)
	{
		A a1=new A();
		System.out.println(a1.a1);
		System.out.println(a1.m1());
//		System.out.println(a1.m2()); //default not accessible outside of package
//		System.out.println(a1.m3()); //private  
//		System.out.println(a1.m4());
		
		B b1=new B();
		System.out.println(b1.m1());
//		System.out.println(b1.m2)); 
//		System.out.println(b1.m3));
//		System.out.println(b1.m4());		
		
//		System.out.println(b1.m5());
//		System.out.println(b1.m6());

		
		
		A ab=new B();
		System.out.println(ab.m1());
//		System.out.println(ab.m2()); 
//		System.out.println(ab.m3());
//		System.out.println(ab.m4());
//		System.out.println(ab.m5());
//		System.out.println(ab.m6());
	
		System.out.println("-----out side package-------");
		C c1=new C();
		System.out.println(c1.m1());
//		System.out.println(c1.m2()); 
//		System.out.println(c1.m3());
		System.out.println(c1.m4());	// protected 
//		System.out.println(c1.m7());
		System.out.println(c1.m8());	// protected
		
		A ac=new C();
		System.out.println(ac.m1());
//		System.out.println(ac.m2()); 
//		System.out.println(ac.m3());
//		System.out.println(ac.m4());
//		System.out.println(ac.m7());
//		System.out.println(ac.m8());
		
		
	}
}
