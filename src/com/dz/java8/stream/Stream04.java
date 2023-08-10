package com.dz.java8.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.dz.java8.DataUtility;

public class Stream04 {

	public static void main(String[] args) {

		Stream<Integer> listInt = Stream.of(12, 45, 561, 12, 121, 121);

		// duplicate in list .
		Set<Integer> elemnts = new HashSet<>();

		List<Integer> collect = listInt.filter(n -> !elemnts.add(n)).collect(Collectors.toList());
		collect.forEach(ss -> {
			System.out.println(ss);
		});

		// emp salary greater than x and retrive only name
		System.out.println("_____________________________");
		List<Emp> empList = DataUtility.getEmps();

		List<String> eees = empList.stream().filter(e -> (e.getSalary() > 40000.0)).map(mp -> mp.getName())
				.collect(Collectors.toList());
		eees.forEach(System.out::println);
		
		System.out.println("_____________________________");
		
//		Optional<String> findFirst = empList.stream().filter(e -> (e.getSalary() > 40000.0)).map(mp -> mp.getName()).findFirst();
//		System.out.println(findFirst.get());
		
		Stream<String> distinct = empList.stream().filter(e -> (e.getSalary() > 40000.0)).map(mp -> mp.getName());
		
	}
}
