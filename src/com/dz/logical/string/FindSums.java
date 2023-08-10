package com.dz.logical.string;

public class FindSums {

	public static void main(String[] args) {
		

		System.out.println("__________________");
		calculateSum1();
		System.out.println("__________________");
		calculateSum2();
		System.out.println("__________________");
		calculateSum3();
		
		
	}

	//Consecutive digit as number
	private static void calculateSum3() {

		String s = "jklmn489pjro635ops";
		int sum=0;
		String num="";
		for(int i=0;i<=s.length()-1;i++) {
				
			char indxVal = s.charAt(i);
			if(Character.isDigit(indxVal)) {
				num=num+indxVal;
			}else {
				if(!num.equals("")) {
					sum=sum+Integer.parseInt(num);
					num="";
				}
			}
		}
		System.out.println("sum "+sum);
		
	}

	private static void calculateSum2() {
		
		String s = "jklmn489pjro635ops";
		String str="";
		for(int i=0;i<=s.length()-1;i++) {
				
			char indxVal = s.charAt(i);
			if(Character.isDigit(indxVal)) {
				str=str+indxVal;
			}
		}
		int num = Integer.parseInt(str);
		int rem=0;
		int sum=0;
		while(num!=0) {
			rem = num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum "+sum);
	}

	private static void calculateSum1() {

		int sum=0;
		String s="mn48pjr2gjho6ss";
		
		for(int i=0;i<=s.length()-1;i++) {
			
			char indxVal = s.charAt(i);
			if(Character.isDigit(indxVal)) {
				sum=sum+Integer.parseInt(Character.toString(indxVal));
			}
		}
		System.out.println("sum "+sum);
	}
}
