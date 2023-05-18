package com.dz.basics;

import java.text.DecimalFormat;

public class Calculator {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		testRoundOffUsingMath();
		
	}
	
	
	public static Long roundOff1(Double val) {
		return Math.round(val);
	}
	
	public static Double roundOff2(Double val) {
		return Math.round(val*100)/100.0;
	}
	
	// RoundOff upword 	95.6 or 95.5 ---> 96
	// roundOff downword 95.4 --> 94
	public static void testRoundOffUsingMath(){
		
		Double premiumAmount = 300.50;
		Double coverageAmount =300.40;
		
		Long prmAmnt=Math.round(premiumAmount);
		Long covrgAmnt=Math.round(coverageAmount);
		
		System.out.println(df.format(prmAmnt));
		System.out.println(df.format(covrgAmnt));
		
		
		 // 12 montly ,24 semi monthly ,bi-weekly 26 , weekly 52
		Integer payRollFreq = 26; 
		Double crgAmnt= (coverageAmount *payRollFreq)/12;
		System.out.println(crgAmnt+" after roundOff --> "+Math.round(crgAmnt)+" formmated -->"+df.format(Math.round(crgAmnt)));
		
		// here round off decimal places
		System.out.println(crgAmnt+" after roundOff --> "+Math.round(crgAmnt*100)/100.0);
		
		Long emplyCvrgAmnt= (covrgAmnt*payRollFreq)/12;
		System.out.println(emplyCvrgAmnt);
		
		Double employeeCovrageAmount  = (covrgAmnt.doubleValue()*payRollFreq)/12;
		
		System.out.println(emplyCvrgAmnt);
		System.out.println(employeeCovrageAmount);
		System.out.println(Math.round(employeeCovrageAmount));
		
	}
	
}


class Product{
	
	Integer id;
	
	Double price;
	Double discount; 
	
}