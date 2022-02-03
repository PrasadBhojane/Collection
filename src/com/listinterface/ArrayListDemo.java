package com.listinterface;
import java.util.*;

public class ArrayListDemo 
{
	public static void main(String[]args)
	{
		ArrayList l = new ArrayList(); //array list object
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);  //[A, 10, A, null]
		l.remove(2);
		System.out.println(l);  //[A, 10, null]
		l.add(2,"M");
		l.add("N");
		System.out.println(l);  //[A, 10, M, null, N]		
	}
}
/**
 * durga vid no. 134
 * List(I) Interface contains class>> ArrayList(c) class
 */