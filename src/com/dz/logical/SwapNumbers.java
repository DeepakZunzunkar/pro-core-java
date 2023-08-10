package com.dz.logical;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 5;
		int b = 4;
		System.out.println("a = " + a + "  b = " + b);

//		withoutThirdVariable(a,b);

		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a = " + a + "  b = " + b);
	}

	private static void withoutThirdVariable(int a, int b) {

		a = a + b; // 9

		b = a - b; // 9-4 =5
		a = a - b;

		System.out.println("a = " + a + "  b = " + b);

	}

}
