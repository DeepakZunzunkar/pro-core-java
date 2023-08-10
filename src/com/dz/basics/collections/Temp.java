package com.dz.basics.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Temp {

	
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String[] args) {
		

		HashMap m1=new HashMap();
		m1.put(1, "dinesh");
		m1.put(2, "amit");
		m1.put(4, "sanket");
		m1.put(3, "sunil");
		
		System.out.println(m1.put(5, "amit"));
		System.out.println(m1.put(2, "raju"));
		
		Set s=m1.entrySet();
		
		/*for(Map.Entry m : (Map.Entry)s)
		{
			
		}*/
		System.out.println("*****");
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry m=(Map.Entry)it.next();
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
	}
}
