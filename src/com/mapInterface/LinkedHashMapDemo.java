package com.mapInterface;
import java.util.*;

public class LinkedHashMapDemo 
{
	public static void main(String[]args)
	{
		LinkedHashMap<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		m.put("chiranjeevi", 700); //(key, value)
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
		
		System.out.println(m); //{K=V, K=V,...}  // Insertion order is preserved.
		
	}
}	
/**
 * LinkedHashMap
 * durga vid no. 143
 */
