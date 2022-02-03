package com.cursor;
import java.util.*;

public class IteratorDemo 
{
	public static void main(String[]args)
	{
		ArrayList l = new ArrayList(); //arraylist object
		for (int i = 0 ; i<=10; i++)
		{
			l.add(i);
		}
		System.out.println(l); //[0, 1, 2,...,10]
		Iterator itr = l.iterator(); //Iterator object
		while (itr.hasNext()) // iterator has next element
		{
			Integer I = (Integer)itr.next(); // get that next element
			if (I%3==0) //print only element which can be divided by 3
				System.out.println(I); //0369
			else
				itr.remove(); // if it can't be divided by 3 then remove
		}
		System.out.println(l); //0369
	}
}
/**
 * Iterator is a type of Cursor in Collection
 * durga vid no. 137
 */
