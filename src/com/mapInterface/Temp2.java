package com.mapInterface;

public class Temp2 {
	int i;

	Temp2(int i) // constructor
	{
		this.i = i;
	}

	public int hashcode() // i value will become hashcode of object
	{
		return i;
	}

	public String toString() // whenever we will try to print temp object internally toString() will be
								// called.
	{
		return i + ""; // can't override in toString() as i is int type, so added "" (empty string)
	}
}
