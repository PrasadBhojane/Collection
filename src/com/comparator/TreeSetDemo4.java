package com.comparator;
import java.util.*;

public class TreeSetDemo4 
{
	public static void main(String[]args) 
	{
		TreeSet t = new TreeSet(new MyComparator2());
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		
		System.out.println(t);
	}
}
class MyComparator2 implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return -s1.compareTo(s2);
	}
}
/**
 * StringBuffer objects into the treeset where sorting order is reverse alphabetical order.
 * durga vid no. 141
 */
