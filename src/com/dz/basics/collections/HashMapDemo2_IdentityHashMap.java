package com.dz.basics.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapDemo2_IdentityHashMap {

public static void main(String[] args) {
		
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(i1, "amit");
		hm.put(i2, "deepak");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		IdentityHashMap<Integer, String> im=new IdentityHashMap<Integer,String>();
		im.put(i1, "amit");
		im.put(i2, "deepak");
		
		System.out.println(im);
		System.out.println(im.size());
		
		
	}
}
