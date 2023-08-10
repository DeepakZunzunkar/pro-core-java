package com.dz.logical;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=12345;
//		aproch1(num);
		aproch2(num);
		
	}

	private static void aproch2(int num) {
		
		int rem=0;
		int rev=0;
		while(num!=0) {
			
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

	private static void aproch1(int num) {
		int rem=0;
		String rev="";
		while(num!=0) {
			
			rem=num%10;
			rev=rev+rem;
			num=num/10;
		}
		System.out.println(rev);
		
	}
}
