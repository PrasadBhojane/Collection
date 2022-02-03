package com.mapInterface;
import java.util.*;

public class HashtableDemo 
{
	public static void main(String[]args)
	{
		Hashtable<Temp2, String> h = new Hashtable<>();
		
		h.put(new Temp2(5), "A");
		h.put(new Temp2(2), "B");
		h.put(new Temp2(6), "C");
		h.put(new Temp2(15), "D");
		h.put(new Temp2(23), "E");
		h.put(new Temp2(16), "F");
		//h.put("DURGA", null); //RE: NPE
		
		System.out.println(h);
	}
}

/**
 * Check-- output is not matching with durga sir..
 * durga vid no. 145
 */
