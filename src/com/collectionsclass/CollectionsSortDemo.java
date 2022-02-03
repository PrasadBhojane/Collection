package com.collectionsclass;
import java.util.*;

public class CollectionsSortDemo {
	public static void main(String[]args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer (10)); //ClassCastException
		//l.add(null); //NullPointerException
		
		System.out.println("Before sorting:"+l);
		Collections.sort(l);
		System.out.println("After sorting:"+l);
	}
}
/**
 * collections class is present in java.util package
 * sort() method is present in collections class
 * default natural sorting order.
 * durga vid no. 147
 */
