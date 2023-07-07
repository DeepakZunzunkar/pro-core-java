package com.dz.starPatterns;

public class Pattern01 {

	
	public static void main(String[] args) {
		
		star();
	}

	private static void star() {
		
		for(int i=0;i<4;i++) {
			System.out.println("*");
			for(int j=4;j<=i;j--) {
				System.out.print("");
			}
		}
		
	}
}
