package com.dz.basics.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();

		al.add("Ganu");
		al.add("Avinash");
		al.add("Ashish");
		al.add("Manish");
		al.add("Ganu");		//duplicate			
		al.add("Ketan");
		al.add("Suraj");
		al.add("Amol");
		al.add("Nitesh");
		al.add("Akshay");

		System.out.println(al);	
		Collections.sort(al);
		al.add("Pappu");
		System.out.println(al);
		
		ListIterator<String> listIterator = al.listIterator();
		
		al.add("Naresh");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
	}
}
