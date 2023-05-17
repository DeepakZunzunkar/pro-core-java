package com.dz.basics;

public class DataTypes {

	// Java is not considered as pure object oriented programming language
	// because several opp's future is not supported by java like multiple inheritance ,operator overloaing .. etc..
    // moreover we are depending on primitive data types which are non-object.
	
	//Primitive Data Types
		//1. Numeric
				// 1. Integral Data types
						// 1. byte 
						// 2. short
						// 3. int 
						// 4. long
	
	
				// 2. Floating Points Data types
					//- float
					//- double
	
		//2. Non - Numeric 
			   // - boolean
			   //  - char


	// except boolean and char , remaining data type are considered as signed data type because we can represent them in both +ve and -ve numbers
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean b1;
	float f1=10.5f;
	
	public static void main(String[] args) {
		
		DataTypes obj=new DataTypes();
		obj.show1();
		obj.show2();//dout
		obj.show3();
		obj.show4();
		obj.show5();
		obj.show6();	
		
		System.out.println(obj);
	}
	
	void show1(){
		System.out.println("premitive variable and default value : \n");
		System.out.println("byte "+b);		//assign default value
		System.out.println("short " +s);
		System.out.println("int "+i);
		System.out.println("long "+l);
		System.out.println("float "+f);
		System.out.println("double "+d);
		System.out.println("char "+ch);
		System.out.println("boolean "+b1);
		System.out.println(f1);
		System.out.println("-------------------");
	}
	
	void show2(){
		System.out.println("\n integer literal demo :\n");
		int a=13;
		int b=012;	//octal form
		int c=0x12a;//hexadecimal literal form				//integer literal demo
		Byte d=012;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	void show3(){
		System.out.println("\nfloting point literal demo : \n");
		float f1=99.97f;
		double d1=9.9e-9;
		double d2=9.9E+9;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(d2);
	}
	void show4(){
		System.out.println("\ncharacter literal demo : \n");
		char ch1='a';
		int x1='a';
		
		char ch2 ='A';
		int x2=ch2;
		
		System.out.println(ch1);
		System.out.println(x1);
		System.out.println(ch2);
		System.out.println(x2);
	}
	void show5(){
		System.out.println("\nBoolean Literal Demo : \n");
		boolean b1=false;
		boolean b2=true;
		boolean b3=b2;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
	
	void show6(){
		System.out.println("\nString literal Demo :\n");
		String s1="";
		String s2="123abc+";
		String s3="1";
		
		System.out.println("s1 ="+s1);
		System.out.println(s1.length());
		System.out.println("s2 ="+s2);
		System.out.println(s2.length());
		System.out.println("s3 ="+s3);
		System.out.println(s3.length());
		
	}
}
