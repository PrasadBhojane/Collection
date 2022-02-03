package com.setinterface;
import java.util.*;

public class TreeSetDemo 
{
	public static void main(String[]args)
	{
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		//t.add(new Integer (10)); //Exception: ClassCastException
		//t.add(null); //Exception: NullPointerException //check printed notes for null acceptance concept.
		System.out.println(t); //[A, B, L, Z, a] // Default Natural sorting order.
	}
}

/**
 * TreeSet is a child class of NavigableSet Interface, which is child of SortedSet Interface
 * durga vid no. 139
 */
