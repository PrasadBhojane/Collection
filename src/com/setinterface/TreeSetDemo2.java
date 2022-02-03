package com.setinterface;
import java.util.*;

public class TreeSetDemo2 
{
	public static void main(String[]args)
	{
		TreeSet t = new TreeSet();
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		System.out.println(t);
	}
}

/**
 * Check why not getting Output as- RE:ClassCastException
 * 
 * If we are depending on default natural sorting order compulsory the object should be homogeneous and comparable,
 * -other wise we will get RE: ClassCastException.
 * StringBuffer doesn't implements comparable interface.
 * durga vid no. 139
 */
