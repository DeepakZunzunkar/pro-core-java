package com.dz.logical;

public class PalindromeNumber {

	//replica
	public static void main(String[] args) {
		
		int num=323;
		
		String reslt= (num==test(num))?"number is palendro":"number is not palendro";
		System.out.println(reslt);
		
		for(int i=10;i<=100;i++) {
			if(i==test(i)) {
				System.out.print(i+",");
			}
		}
	}

	private static int test(int num) {

		int temp=num;
		int reminder=0;
		int reverse=0;
		while(num!=0) {
			reminder=num%10;
			reverse=(reverse*10)+reminder;
			num/=10;
		}
		return reverse;
	}
}
