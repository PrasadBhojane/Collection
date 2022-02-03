package com.cursor;
import java.util.*;
public class EnumerationDemo 
{
	public static void main(String[]args)
	{
		Vector v = new Vector(); //vector object
		for (int i=0; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v); //[0, 1, 2,..., 10]
		Enumeration e = v.elements(); //we can get Enumeration object by using elements() in vector class
		while(e.hasMoreElements()) //if more no. of elements are there-
		{
			Integer I = (Integer)e.nextElement(); // -can you please provide next element
			if(I%2 ==0) //if it is even
				System.out.println(I); //0, 2, 4, 6, 8, 10
		}
		System.out.println(v); //[0, 1, 2,..., 10]
	}
}
/**
 * Enumeration is a type of cursor in collection.
 * Cursor is used to get objects one by one from the collection.
 * durga vid no. 136
 */
