package com.cursor;
import java.util.*;
public class CursorDemo 
{
	public static void main(String[]args)
	{
		Vector v = new Vector();
		
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator litr = v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}
}
/**
 * durga vid no. 137
 * Cursor types
 * For interfaces we can't create object, the object created with name Enumeration, Iterator and ListIterator interface - are implemented class objects only.
 * To get there implementation class in java.util package above methods are available
 */
