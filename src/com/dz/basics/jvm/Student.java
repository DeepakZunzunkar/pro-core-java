package com.dz.basics.jvm;

public class Student {

	private String name="amit";
	private int mark=100;
	
	//Declared constructor as private , so out-side of this class it is not visible to create object
	private Student()
	{
		System.out.println("private constructer access ");
	}
	
	public String getname()
	{
		return name;
	}
	public int getMark()
	{
		return mark;
	}
	public void m1()
	{
		System.out.println("student class method");
	}
	
	public static void main(String[] args) {
			
		Student s=new Student();
		s.m1();
	}
}
