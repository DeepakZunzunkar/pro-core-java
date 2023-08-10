package com.dz.logical.string;

public class CountInString {

	public static void main(String[] args) {

//		highest occurent of character

		String s = "ajhbsjakjakk";

//		countCharInString(s);
		
		String ss="hi how are  you, fine...... thanku";
		countTheWordInString(ss);
		
	}

	private static void countTheWordInString(String ss) {
		
		int count=1;
		for(int i=0; i<ss.length()-1;i++){
			
			if( (ss.charAt(i) == ' ') && (ss.charAt(i+1)!=' ')) {
				count++;
			}
		}  
		System.out.println(count);
	}

	private static void countCharInString(String s) {

		// find highest occurrence of a
		int l1 = s.length();
//		System.out.println(l1);
		String newStr = s.replace("a", "");
//		System.out.println(newStr);
		int l2 = newStr.length();
//		System.out.println(l2);
		System.out.println(" occuence of a " + (l1 - l2));

	}
}
