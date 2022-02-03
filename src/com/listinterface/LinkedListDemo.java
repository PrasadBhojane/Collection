package com.listinterface;
import java.util.*;

public class LinkedListDemo 
{
	public static void main(String[]args)
	{
		LinkedList l = new LinkedList(); //linked list object
		l.add("Prasad");
		l.add(30);
		l.add(null);
		l.add("Prasad");        //[Prasad, 30, null, Prasad]
		l.set(0, "Software");   //[Software, 30, null, Prasad]
		l.add(0,"durga");       //[durga, Software, 30, null, Prasad]
		l.removeLast();         //[durga, Software, 30, null]
		l.addFirst("ABC");      //[ABC, durga, Software, 30, null]
		System.out.println(l);
	}
}
/**
 * durga vid no. 135
 * collection framework - 9 key interfaces
 * List(I) Interface contains class>> LinkedList(c) class
 */
