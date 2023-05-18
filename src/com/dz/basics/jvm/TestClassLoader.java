package com.dz.basics.jvm;

public class TestClassLoader {

	public static void main(String[] args) {
		
		
		System.out.println(String.class.getClassLoader());	//null
		System.out.println(TestClassLoader.class.getClassLoader());	//sun.misc.Launcher$AppClassLoader.class@1233

		//		System.out.println(Custumer.class.getClassLoader());	//sun.misc.Laucher$ExtClassLoader.class@4546
//		Assume Customer.class present in both extension and application class path and Test.class present in only application class path
	}
}
