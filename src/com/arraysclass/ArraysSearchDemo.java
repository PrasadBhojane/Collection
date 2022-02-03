package com.arraysclass;

import java.util.*;
import static java.util.Arrays.*; //static import

public class ArraysSearchDemo {
	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };
		Arrays.sort(a); // sort by natural order
		System.out.println(Arrays.binarySearch(a, 6)); // 1
		System.out.println(Arrays.binarySearch(a, 14)); // -5

		String[] s = { "A", "Z", "B" };
		Arrays.sort(s);
		/**
		 * If we are using static import then static import we can use directly -without
		 * class name.
		 */
		System.out.println(binarySearch(s, "Z")); // 2
		System.out.println(binarySearch(s, "S")); // -3

		Arrays.sort(s, new MyComparator2());
		System.out.println(binarySearch(s, "Z", new MyComparator2())); // 0
		System.out.println(binarySearch(s, "S", new MyComparator2())); // -2
		System.out.println(binarySearch(s, "N")); // unpredictable result.
	}
}

class MyComparator2 implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
/**
 * durga vid no. 149
 */
