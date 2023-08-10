package com.dz.logical;

//sum of digits raised to the power three equals the number itself
public class ArmstrongNumber {

	
	public static void main(String[] args) {
		
		int num = 371; //153,371
		
		String status =(num==test(num))? "number is armstrong":"number is not armstrong";
		System.out.println(status);
		System.err.println("________________________");
		for(int i=1;i<=1000;i++) {
			if(i==test(i)) {
				System.out.println(i);
			}
		}
	}

	private static int test(int num) {
		
		int remider=0;
		int targate=0;
		while(num!=0) {
			remider=num%10;
//			System.out.println("Remider "+remider );
			num=num/10;
//			System.out.println("Remaining "+num);
			targate=targate+(remider*remider*remider);
//			System.out.println(targate);
		}
		return targate;
	}
}
