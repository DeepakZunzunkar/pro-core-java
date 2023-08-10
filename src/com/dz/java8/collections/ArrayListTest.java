package com.dz.java8.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTest {

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
		
		System.out.println("1.Even Number ______________________________");
		// here it is going to read each and every element present inside al ,
		// if it is even number collect that even number to the list and give it to the
		// new List object.
		List<Integer> evenNmbrs = al.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println("even numbers " + evenNmbrs);
		System.out.println("_________________________________________________________");
	}
}
