package com.setinterface;
import java.util.*;

public class HashSetDemo 
{
	public static void main(String[]args)
	{
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		
		System.out.println(h.add("Z")); //false // duplicates are not allowed.
		
		System.out.println(h); // insertion order is not preserved in SET interface so can't define exact output.
	}
}

/**
 * durga vid no. 138
 */
