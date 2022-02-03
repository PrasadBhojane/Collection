package com.listinterface;
import java.util.*;

public class VectorListDemo 
{
	public static void main(String[]args)
	{
		Vector v = new Vector(); //vector object
		System.out.println(v.capacity()); //10 // default capacity
		for (int i = 1; i<=10; i++)
		{
			v.addElement(i); // element 1 to 10 will be added
		}
		System.out.println(v.capacity());
		v.addElement("A"); //11th element
		System.out.println(v.capacity()); // for 11th element capacity will be incremented by formulae = new cap. = current cap * 2 = 10*2=20
		System.out.println(v);


	}
}
/**
 * durga vid no. 136
 * VectorList Demo 
 */
