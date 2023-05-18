package com.dz.basics.jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1Student {

	
	public static void main(String[] args) {
		
		
		//not visible to create object
//		Student s=new Student();
	
		Class clzz=null;
		int count =0;
		try {
			
			clzz=Class.forName("com.dz.basics.jvm.Student");
			
			count=getDecaliredMethods(clzz);
			System.out.println("\nthe number of methods "+count);
			
			System.out.println("\n************");
			count =0;
			count =getDeclaredFields(clzz);
			
			System.out.println("number of varaibles :"+count);
			
			System.out.println("\n************");
			
			
			System.out.println("\nsuper class : "+clzz.getSuperclass()+"\n");
			
			// at this, we can not access a member of class Student, bcz it's private 
			/*Object o=clzz.newInstance();*/
			
			
//creating object of private constructor  class
	
			Object o=makeClassAsVisible(clzz);
			
			Student s=(Student)o;
			System.out.println(s.getname());
			System.out.println(s.getMark());
			
			System.out.println("\n************");
//even though we are using student.class multiple time, only one clss Class  object got created
			
			Object o1=makeClassAsVisible(clzz);
			Student s1=(Student)o1;
			
			Class c1=s.getClass();
			Class c2=s1.getClass();
			
			System.out.println(c1.hashCode()==c2.hashCode());
			System.out.println(s.hashCode()==s1.hashCode());
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
	
/*note
 	:for every loaded type only one class object will be created even though we 
		are using class multiple time in a our program.
*/	
	
	private static int getDeclaredFields(Class clzz) {
		int count =0;
		Field[] f=clzz.getDeclaredFields();
		System.out.println("Variables :");
		for(Field ff :f)
		{
			count++;
			System.out.println("\t\t"+ff.getName());
		}
		
		return count;
	}


	private static int getDecaliredMethods(Class clzz) {
		
		int count =0;
		Method[] m=clzz.getDeclaredMethods();
		System.out.println("Methods :");
		for(Method mm:m)
		{
			count++;
			System.out.println("\t\t"+mm.getName());
		}
		return count;
	}


	public static Object makeClassAsVisible(Class clzz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	
		Constructor[] cc=clzz.getDeclaredConstructors();
		cc[0].setAccessible(true);
		return cc[0].newInstance();
	}
}
