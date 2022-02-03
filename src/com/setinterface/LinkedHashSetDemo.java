package com.setinterface;
import java.util.*;

public class LinkedHashSetDemo 
{
	public static void main(String[]args)
	{
		LinkedHashSet h = new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		
		System.out.println(h.add("Z")); //false // duplicates are not allowed.
		
		System.out.println(h); // [B, C, D, Z, null, 10]
	}
}

/**
 * LinkedHashSet is the child class of HashSet.
 * Insertion order is preserved in Linked hash set.
 * durga vid no. 138
 */
