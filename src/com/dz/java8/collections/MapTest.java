package com.dz.java8.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "amit");
		map.put(101, "manish");
		map.put(102, "sumit");
		map.put(103, "sachin");

		/*
		 * map.forEach((k, v) -> { System.out.println(k + " " + v); });
		 */

		// there is stream method on map object directly.

		/*map.entrySet().stream().filter(mp -> mp.getKey() != 102).forEach(entry -> {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});*/

		List<Entry<Integer, String>> keyVal = map.entrySet().stream().filter(mp -> mp.getKey() != 101)
				.collect(Collectors.toList());

		keyVal.forEach(ss -> {
			System.out.println(ss.getKey() + " : " + ss.getValue());
		});
	}

}
