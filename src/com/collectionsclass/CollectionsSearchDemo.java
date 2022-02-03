package com.collectionsclass;
import java.util.*;

public class CollectionsSearchDemo {
	public static void main(String[]args) {
		
		ArrayList<String> l = new ArrayList<>();
		
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		
		System.out.println(l);
		
		Collections.sort(l); //natural sorting
		System.out.println(l); 
		
	    System.out.println(Collections.binarySearch(l, "Z"));
	    
	    System.out.println(Collections.binarySearch(l, "J")); //predictable reuslt.
	}
}
/**
 * Before calling binarySearch() method compulsory the list should be sorted otherwise,
 * we will get unpredictable results.
 * Collections binary search method
 * durga vid no. 148
 */
