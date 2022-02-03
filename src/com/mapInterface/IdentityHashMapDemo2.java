package com.mapInterface;
import java.util.*;

class IdentityHashMapDemo2  //IdentityHashMap demo
{
	public static void main(String[]args)
	{
		IdentityHashMap m = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		m.put(i1,"Pawan");
		m.put(i2,"Kalyan");
		System.out.println(m); //Output: {10=Pawan, 10=Kalyan}
	}
}
class HashMapDemo2 //HashMap demo
{
	public static void main(String[]args)
	{
		HashMap<Integer, String> m = new HashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		m.put(i1,"Pawan");
		m.put(i2,"Kalyan"); //duplicate value will be replaced, i.e. Pawan with kalyan.
		System.out.println(m); //Output: {10=kalyan}
	}    
}
/**
 * IdentityHashMap demo
 * durga vid no. 142
 */
