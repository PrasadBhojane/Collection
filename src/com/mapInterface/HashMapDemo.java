package com.mapInterface;
import java.util.*;

public class HashMapDemo 
{
	public static void main(String[]args)
	{
		HashMap<String, Integer> m = new HashMap<>();
		
		m.put("chiranjeevi", 700); //(key, value)
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
		
		System.out.println(m); //{K=V, K=V,...}  // Output Order is based on Hashcode of keys.
		
		System.out.println(m.put("chiranjeevi", 1000));// key is already there, i.e.700, so old value will be replaced with new value i.e.1000, and it returns old value in console.
		
		Set<String> s = m.keySet();
		System.out.println(s); //[K, K,...] //only keys will be printed
		
		Collection<Integer> c = m.values();
		System.out.println(c); // only values will be printed
		
		Set s1 = m.entrySet();
		System.out.println(s1); // [K=V, K=V,...] //set of entries will be printed.
		
		Iterator itr = s1.iterator(); //to get entry object one by one we have to use cursor- iterator
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next(); //typecasting
			
			System.out.println(m1.getKey() +"..."+m1.getValue()); //(key...value)
			
			if(m1.getKey().equals("nagarjuna")) 
			{
				m1.setValue(10000); // value associated with nagarjuna is changed to 10000
			}
		}
		System.out.println(m);
	}
}
/**
 * Hashmap
 * durga vid no. 142
 */
