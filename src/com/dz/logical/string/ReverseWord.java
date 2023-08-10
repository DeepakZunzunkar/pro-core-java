package com.dz.logical.string;

public class ReverseWord {

	public static void main(String[] args) {
		
		String word="amit";
		
		System.out.println(reverse(word));
		
	}
	
	public static String reverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
}
