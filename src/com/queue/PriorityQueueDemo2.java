package com.queue;
import java.util.*;

public class PriorityQueueDemo2 
{
	public static void main(String[]args)
	{
		PriorityQueue q = new PriorityQueue(15, new MyComparator()); //(int initial capacity, comparator c)
		
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		
		System.out.println(q);  //[Z, L, B, A]
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		
		return -s1.compareTo(s2);
	}
}
/**
 * Output is not having customized sorting order, because-
 * Some platforms or Operating system wont provide proper support for PriorityQueue.
 * durga vid no. 146
 */
