package com.yash.newconcepts.multithreading;

public class MultithreadingDemo implements Runnable {
	public void run(){  
		Thread.State state = Thread.currentThread().getState();  
		 System.out.println("Running thread name: "+ Thread.currentThread().getName());  
	        System.out.println("State of thread: " + state);  
		try
		{
			System.out.println("My thread is in running state.");  
			int a=25;
			int b=3;
			int c = a+b;
			int d = a-b;
			System.out.println("addition is "+c);
			Thread.sleep(2000);
			System.out.println("Substraction is "+d);



		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}   
	public static void main(String args[]) throws InterruptedException{  
		MultithreadingDemo r=new MultithreadingDemo();   
		Thread t=new Thread(r);
		MultithreadingDemo r1=new MultithreadingDemo();   
		Thread t1=new Thread(r1); 
		MultithreadingDemo r2=new MultithreadingDemo();   
		Thread t2=new Thread(r2);
		t.start(); 
		try
		{
			while(t.isAlive())
			{
				System.out.println("thread is live");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
		//   t.join();

		t1.start();
		//  t1.join();

		t2.start();
		//  t2.join();

		t2.setPriority(1);
		System.out.println("Priority of thread t1 is: " + t1.getPriority());
		System.out.println("Priority of thread t1 is: " + t1.getPriority()); 


	}  
}
