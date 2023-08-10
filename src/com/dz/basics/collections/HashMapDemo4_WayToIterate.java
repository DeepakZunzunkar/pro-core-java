package com.dz.basics.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo4_WayToIterate {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		String s1 = "Abc";
		String s2 = "FB";
		String s3 = "abc";
		String s4 = "Ea";
		String s5 = "xyz";

		map.put(s1, s1.hashCode());
		map.put(s2, s2.hashCode());
		map.put(s3, s3.hashCode());
		map.put(s4, s4.hashCode());
		map.put(s5, s5.hashCode());

		System.out.println("\n_____for-each loop________________");
		// Method #1: Iterating over entries using For-Each loop
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		System.out.println("###################################");
		// Method #2: Iterating over keys or values using For-Each loop
		// iterating over keys only
		for (String key : map.keySet()) {
			System.out.println("Key = " + key);
		}

		// iterating over values only
		for (Integer value : map.values()) {
			System.out.println("Value = " + value);
		}

		System.out.println("\n_____using iterator________________");
		System.out.println("####### Using Generics ############################");

		// Method #3: Iterating using Iterator.
		Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, Integer> entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		System.out.println("####### witout Using Generics ############################");
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			String key = (String) entry.getKey();
			Integer value = (Integer) entry.getValue();
			System.out.println("Key = " + key + ", Value = " + value);
		}

		System.out.println("###################################");
		// Method #4: Iterating over keys and searching for values
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("Key = " + key + ", Value = " + value);
		}

		System.out.println("\n_____java 1.8 enhance for-each loop________________");
		// Using Java 8 ForEach
		map.forEach((k, v) -> System.out.println("key : " + k + " value: " + v));
	}
}
