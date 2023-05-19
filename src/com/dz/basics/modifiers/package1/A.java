package com.dz.basics.modifiers.package1;


public class A {

	public int a1=10;
	int a2=20;
	private int a3=30;
	protected int a4=40;
	
	
	public int m1(){
		//can be access anywhere ,within or outside of package
		/*System.out.println(a3);*///thats why need to write getters method
		return a1;
	}

	int m2() {
		//can be access only within current package
		return a2;
	}
	
	private int m3() {
		//can be access only within current class
		return a3;
	}
	protected int m4() {
		//can be access Anywhere within current package and only in child class from outside package only using child refference.
		return a4;
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		System.out.println(a.a4);
	}
}
