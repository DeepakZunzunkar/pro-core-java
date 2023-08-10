package com.dz.logical.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HighestCommon {

	public static void main(String[] args) {

		String s = "amithiaammmmami";

//		aproch1(s);
		aproch2(s);
		int count = 0;

		Map<String, Integer> mp = new HashMap<String, Integer>();

		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = 0; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (!mp.containsKey(Character.toString(s.charAt(i)))) {
				mp.put(Character.toString(s.charAt(i)), count);
			}
			count = 0;
		}

		int max=0;
		int min=1;
		String chmax="";
		String chmin="";
//		mp.forEach((k,v)->{
//			System.out.println(k+" : "+v);
//		});
		
		Set<Entry<String,Integer>> entrySet = mp.entrySet();
		for(Map.Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
			if(max<entry.getValue()) {
				chmax=entry.getKey();
				max=entry.getValue();
			}
			
			
			if(entry.getValue()==1) {
				min=1;
				chmin=entry.getKey();
				min=entry.getValue();
			}
			
			if(entry.getValue()<min) {
				chmin=entry.getKey();
				min=entry.getValue();
			}
		}
		System.out.println("highest occuring charcter :" +chmax+ " ,occurs " +max+ " times");
		System.out.println("lowest occuring charcter :" +chmin+ " ,occurs " +min+ " times");
	}

	private static void aproch2(String s) {
		//find highest occurrence of a
		int l1=s.length();
		System.out.println(l1);
		String newStr=s.replace("a","");
		System.out.println(newStr);
		int l2=newStr.length();
		System.out.println(l2);
		System.out.println(" occuence of a "+(l1-l2));
		
	}

	private static void aproch1(String s) {

//		op1
		/*
		 * int count = 0; int maxcount = 0; char ch1 = 0; char ch2 = 0; char mxChar = 0;
		 * for (int i = 0; i <= s.length() - 1; i++) { ch1 = s.charAt(i); for (int j =
		 * 0; j <= s.length() - 1; j++) { ch2 = s.charAt(j); if (ch1 == ch2) { count++;
		 * }
		 * 
		 * if (maxcount < count) { maxcount = count; mxChar = ch1; } } //
		 * System.out.println("char "+ch1+" count "+count); count = 0; }
		 * System.out.println("highest occuring charcter :" + mxChar + " ,occurs " +
		 * maxcount + " times");
		 */
		int count = 0;
		int maxcount = 0;
		int index = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = 0; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
				if (maxcount < count) {
					maxcount = count;
					index = i;
				}
			}
			count = 0;
		}
		System.out.println("highest occuring charcter :" + s.charAt(index) + " ,occurs " + maxcount + " times");
	}

}
