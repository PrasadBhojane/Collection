package com.cursor;
import java.util.*;
public class ListIteratorDemo 
{
	public static void main(String[]args)
	{
		LinkedList l= new LinkedList(); //linked list object
		l.add("Balkrishna");
		l.add("Venki");
		l.add("Chiru");
		l.add("Nag");
		System.out.println(l);  //[Balakrishna, venki, chiru, nag]
		ListIterator ltr = l.listIterator(); //ListIterator object
		while(ltr.hasNext())
		{
			String s = (String)ltr.next();
			if(s.equals("Venki"))
			{
				ltr.remove(); //[Balakrishna, chiru, nag]
			}
			else if(s.equals("Nag"))
			{
				ltr.add("Chaitu"); //[Balakrishna, chiru, nag, chaitu]
			}
			else if(s.equals("Chiru"))
			{
				ltr.set("Charan"); //[Balakrishna, charan, nag, chaitu]		
			}
		}
		System.out.println(l);  //[Balakrishna, charan, nag, chaitu]
	}
}
/*
 * durga vid. no. 137
 * List iterator is the child interface of Iterator and Iterator is a type of Cursor in Collection
 */
