package com.dz.basics.collections;

import java.util.WeakHashMap;

public class HashMapDemo3_WeakHashMap {

	public static void main(String[] args) throws InterruptedException {
		Temp t = new Temp();
		// HashMap<Temp, String> hm=new HashMap<Temp,String>();
		WeakHashMap<Temp, String> hm = new WeakHashMap<Temp, String>();
		
		hm.put(t, "amit");
		System.out.println(hm);
		t = null;
		System.gc();
		Thread.sleep(500);
		System.out.println(hm);
	}
}
