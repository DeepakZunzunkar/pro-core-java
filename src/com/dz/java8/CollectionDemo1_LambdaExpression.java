package com.dz.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.dz.java8.stream.Emp;

public class CollectionDemo1_LambdaExpression {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(40);
		al.add(43);
		al.add(59);
		al.add(15);
		al.add(10);
		al.add(5);
		al.add(9);
		al.add(77);
		al.add(45);

		System.out.println(al);

//		sorting in traditional way
		/*
		 * sortInTraditionalWay(al); System.out.println(al);
		 */

//		sorting using lambda expression

		/*
		 * Comparator<Integer> c=(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0;
		 * Collections.sort(al,c);
		 */

		Collections.sort(al, (i1, i2) -> i2.compareTo(i1));
		System.out.println(al);

//		Stream 

		// here it apply sysout on every element in list .
//		al.stream().forEach(System.out::println);
		System.err.println("_________________________________________________________");
		// here it is going to read each and every element present inside al ,
		// if it is even number collect that even number to the list and give it to the
		// new List object.
		List<Integer> evenNmbrs = al.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println("even numbers " + evenNmbrs);
		System.err.println("_________________________________________________________");
		sortObjectUsingLambdaExpression();
	}

	private static void sortObjectUsingLambdaExpression() {

		List<Emp> al = new ArrayList<>();

		al.add(new Emp(444, "rajnee"));
		al.add(new Emp(111, "sumit"));
		al.add(new Emp(222, "dinesh"));
		al.add(new Emp(555, "gaurav"));
		al.add(new Emp(333, "dz"));

		System.out.println(al);
		
		//based on ascending order of employee id
		Collections.sort(al,(e1,e2)->(e1.getId()<e2.getId())?-1:(e1.getId()>e2.getId())?1:0);
		System.out.println(al);
		
		//sort based on alphabetical order of emp name
		Collections.sort(al,(e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println(al);
		
		//map
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(100, "amit");
		map.put(101, "manish");
		map.put(102, "sumit");
		map.put(103, "sachin");
		
		/*map.forEach((k,v)->{
		});*/
		
		Map<Integer, String> map1=new HashMap<Integer, String>();
		
		map.entrySet().stream()
		.filter(mp-> mp.getKey()!=102)
		.forEach(mmm->{
//			System.out.println(mmm.getKey()+" : "+mmm.getValue());
			map1.put(mmm.getKey(),mmm.getValue());
		});
		
		List<Entry<Integer, String>> keyVal = map.entrySet().stream()
					  .filter(mp-> mp.getKey()!=101)
					  .collect(Collectors.toList());
		
		keyVal.forEach(ss->{
			System.out.println(ss.getKey()+" : "+ss.getValue());
		});
		
	}

	private static void sortInTraditionalWay(List<Integer> al) {

		Collections.sort(al, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {

				/*
				 * if(i1 > i2) { return -1; }else if(i1 < i2) { return 1; }else if(i1==i2) {
				 * return 0; }
				 */

//				return (i1 > i2) ? -1 : (i1 < i2)? 1 : 0 ;
				return i2.compareTo(i1);
			}

		});
	}

}

