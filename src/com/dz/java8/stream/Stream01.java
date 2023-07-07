package com.dz.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {

	
	public static void main(String[] args) {
		
		
//		Stream<String> strmStrng = Stream.of("amit","sumit","manish","amol,","nikhil","suraj");
//		Stream<Integer> strmInt = Stream.of(1,2,50,100);
		
		List<Integer> al = Arrays.asList(20,31,52,45,9,15,68);
//		al.add(99);  --> UnsupportedOperationException will get, Arrays.asList returns Immutable list object.   
		System.out.println(al);
		
		//without stream 
		List<Integer> newLst1=new ArrayList<Integer>();
		for(Integer i:al) {
			if(i%2==0) {
				newLst1.add(i);
			}
		}
		System.out.println("even numbers "+newLst1);
		
		//with stream
		List<Integer> evenNmbrs = al.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println("even numbers " + evenNmbrs);
	}
	
}
