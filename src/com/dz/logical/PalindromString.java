package com.dz.logical;

public class PalindromString {

	public static void main(String[] args) {

		String str = "aba";
		String reverse = reverseString(str);

		String status = reverse.equals(str) ? "palendrom" : "not palendrom";
		System.out.println(status);
	}

	private static String reverseString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

}
