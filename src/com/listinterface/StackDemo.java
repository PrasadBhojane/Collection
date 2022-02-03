package com.listinterface;
import java.util.*;

public class StackDemo
{
	public static void main(String[]args)
	{
		Stack s = new Stack(); //stack object
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s); //[A, B, C]
		System.out.println(s.search("A")); //3 //offset of A
		System.out.println(s.search("Z")); //-1 //offset of Z not available so output will be -1
		//for more details of OFFSET, check printed notes
	}
}
/**
 * durga vid no. 136
 * Stack(c) class is child class of vector(c)
 * Stack(c) is specially designed class for Last In First Out order. i.e removal order will be [C, B, A]
 */
