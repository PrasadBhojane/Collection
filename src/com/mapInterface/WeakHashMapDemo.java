package com.mapInterface;
import java.util.*;

public class WeakHashMapDemo 
{
	public static void main(String[]args)throws Exception
	{
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t,"durga");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(m);
	}
}
class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize method called");
	}
}

// Output:
// {temp=durga}
// Finalize method called
// {} //garbage collector destroyed the object.

/**
 * Above example is of WeakHashMap.
 * 
 * In the above program if we replaced WeakHashMap with HashMap then,
 * -temp object is not eligible for gc(garbage collector). In this case output will be:
 * {temp=durga}
 * {temp=durga} //GC doesn't destroyed the object.
 * 
 * durga vid no. 143
 */
