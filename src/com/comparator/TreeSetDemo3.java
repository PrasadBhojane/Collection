package com.comparator;
import java.util.*;

public class TreeSetDemo3
{
	public static void main(String[]args)
	{
		TreeSet t = new TreeSet(new MyComparator()); //passing object of MyComparator for customized sorting order
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20); //duplicate element
		
		System.out.println(t);
	}
}
class MyComparator implements Comparator //calling comparator method for customized sorting order. i.e. Descending Order.

{
	public int compare(Object obj1, Object obj2)
	{
		Integer I1 = (Integer)obj1; //type casting obj1 as integer
		Integer I2 = (Integer)obj2; //type casting abj2 as integer
		
		if(I1<I2)  //giving condition for descending order.
			return +1;
		else if(I1>I2)
			return -1;
		else
			return 0;
		// OR_ return -I1.compareTo(I2);
		// OR_ return T2.compareTo(I1);
	}
}
/**
 * Sorting done using compare() method
 * for more understanding check printed notes
 * druga vid no. 140
 */
