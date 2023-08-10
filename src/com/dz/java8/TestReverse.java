package com.dz.java8;

public class TestReverse  {

	
	
	public static void main(String[] args) {
		
		ReverseString rt=(str)->{
			
			String rev="";	
			for(int i=str.length()-1;i>=0;i--){
				
				rev=rev+str.charAt(i);
				
			}
			return rev;
		};
		
		System.err.println(rt.reverse("amit"));
	}

}
