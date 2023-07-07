package com.dz.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// creating stream object.
public class Stream02 {

	public static void main(String[] args) {
		
//		01. empty stream
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e->{
			System.out.println(e);
		});
		
//		02. stream array , collection , objects.

//		String name[]= {"sachin","manish","ganu","rahul","krunal" };
//		Stream<String> nameStream = Stream.of(name);
		
		Stream<String> nameStream = Stream.of("sachin","manish","ganu","rahul","krunal");
		nameStream.forEach(System.out::println);
		
//		Dout ?
		/*Stream<int[]> numbsStream = Stream.of(new int[]{2,4,5,15,11,22,35});
		numbsStream.forEach(nbr->{
			System.out.println(nbr.length);
		});*/
		
		IntStream numbsStream = Arrays.stream(new int[]{2,4,5,15,11,22,35});
		numbsStream.forEach(nbr->{
			System.out.print(nbr);
		});
		
		
//		03. using builder pattern  
		Stream<Object> build = Stream.builder().build();
		
		
//		04 List , Set , Map 
		HashSet<Object> hset = new HashSet<>();
		hset.add(19);
		hset.add(20);
		hset.add(40);
		hset.add(43);
		hset.add(59);
		hset.add(15);
		hset.add(10);
		
		hset.stream().forEach(h->{
			System.out.println(h);
		});
	}
}
