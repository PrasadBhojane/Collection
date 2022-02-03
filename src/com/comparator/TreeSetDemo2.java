package com.comparator;
import java.util.*;

class Employee implements Comparable
{
	String name; // Employee having 2 property- name and ID 
	int eid; //Employee ID

	Employee(String name, int eid) // constructor
	{
		this.name = name;
		this.eid = eid;
	}
	public String toString() // whenever we are trying to print employee object internal toString method will be called.
	{
		return eid+"--"+name;
	}
	public int compareTo(Object obj)
	{
		int eid1 = this.eid; // 1st employee id
		Employee e = (Employee)obj; //type casting
		int eid2 = e.eid; //2nd employee id
		
		if(eid1<eid2) // comparing 1st and 2nd id
		{
			return -1;
		}
		else if (eid1>eid2)
		{
			return 1;
		}
		else
			return 0; //duplicate element will be ignored
	}
}
public class TreeSetDemo2 
{
	public static void main(String[]args)
	{
		Employee e1 = new Employee("nag",100);
		Employee e2 = new Employee("balaiah",200);
		Employee e3 = new Employee("chiru",50);
		Employee e4 = new Employee("venki",150);
		Employee e5 = new Employee("nag",100); //duplicate element
		
		TreeSet t = new TreeSet(); //not passing any comparator, so it is Default natural sorting order i.e. with integer number i.e. using employee ID
		                           //default natural sorting using comparable interface i.e. compareTo method.
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t); //default natural sorting order.
		
		TreeSet t1 = new TreeSet(new MyComparator5()); //customized sorting using comparator interface - Compare() method
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		
		System.out.println(t1); //customized sorting order.
	}
}
class MyComparator5 implements Comparator // comparing and sorting based on alphabetical order.
{
	public int compare(Object obj1, Object obj2)
	{
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		
		return s1.compareTo(s2);
	}
}
