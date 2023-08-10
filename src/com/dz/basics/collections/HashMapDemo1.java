package com.dz.basics.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashMap m1 = new HashMap();
		m1.put(1, "dinesh");
		m1.put(2, "amit");
		m1.put(4, "sanket");
		m1.put(3, "sunil");

		System.out.println(m1);
		System.out.println(m1.put(2, "deepak"));// it will put values as deepak
												// and return old value amit
		System.out.println(m1);

		System.out.println("\n__________map.KeySet()_______________");

		// only keys object
		Set key = m1.keySet(); // it return set interface Object
		System.out.println(key);// only keys object
		System.out.println(key.getClass().getName());
		System.out.println("\n__________map.values()_______________");
		// only values Objects
		Collection values = m1.values();// it return collection Object
		System.out.println(values);// only values
		System.out.println(values.getClass().getName());
		System.out.println("\n__________map.entrySet()_______________");
		// Both key and values
		Set entry = m1.entrySet();
		System.out.println(entry);
		System.out.println(entry.getClass().getName());
		// using iterator
		System.out.println("\n********using iteror**************");
		Iterator itr1 = entry.iterator();
		while (itr1.hasNext()) {
			Map.Entry m = (Map.Entry) itr1.next();
			System.out.println(m.getKey() + "........." + m.getValue());
			if (m.getValue().equals("sanket")) {
				m.setValue("Rajnee");
			}
		}

		System.out.println(entry);
		System.out.println("*****=========********");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.putAll(m1);
		System.out.println(hm);
		System.out.println(hm.get(1)); // it return values of given key object
		System.out.println(hm.remove(4));// it return removing object
		System.out.println(hm);
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("deepak"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());

		hm.put(null, null);

		System.out.println(hm);
		hm.put(1, "test1");
		System.out.println(hm);
		hm.put(null, "test2");
		System.out.println(hm);
	}
}
