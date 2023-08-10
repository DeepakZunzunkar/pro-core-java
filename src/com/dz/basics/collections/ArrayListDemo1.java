package com.dz.basics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {

//	1. what is concurrent Modification Exception ?
//: The ConcurrentModificationException generally occurs when working with Java Collections.
//	This exception may be thrown by methods that have detected concurrent modification of an object 
//	when such modification is not permissible.
	
//	it is not generally permissible for one thread to modify a Collection while another thread is iterating over it.
//	the results of the iteration are undefined under these circumstances.
//	Some Iterator implementations ,may choose to throw this exception.
//	if this behavior is detected. Iterators that do this are known as fail-fast iterators.
	
//	This exception can occur in both multithreaded and single-threaded Java environments.
//  Multithreaded environment - If a thread is traversing over a Collection using an Iterator 
//							    and another thread attempts to add or remove elements to the Collection.
//	Single-threaded environment - When an element is attempted to be removed from an ArrayList using the remove() method 
//								while it is being traversed using an enhanced for loop.
	
	
	
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
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
		
		raiseConcurrentException(al);
		
	}

	private static void raiseConcurrentException(ArrayList<String> al) {
		
		Iterator<String> itr1=al.iterator();
		al.add("Pappu");
		
		while(itr1.hasNext()) {
			String name = itr1.next();
			if(name.startsWith("A")) {
				itr1.remove();
			}
		}
		System.out.println(al);
//		al.add("Pappu");
		
//		solution: after completion of iteration do add operation.
		
	}
}
