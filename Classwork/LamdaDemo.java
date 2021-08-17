package com.yash.newconcepts;
interface Demo1
{
	void add(int x,int y);
	default void msg()
	{
		System.out.println("Hello");
	}
}
public class LamdaDemo {
	Demo1 d= (int x,int y)->System.out.println(x+y);
			{
		d.add(2,3);

			};
}
