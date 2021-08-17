package com.yash.newconcepts.multithreading;

public class DemonThread extends Thread{  
		 public void run(){ 
			 
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
		  }  
		  else{  
		  System.out.println("user thread work");  
		 }  
		 }  
		 public static void main(String[] args){  
		  DemonThread t1=new DemonThread();//creating thread  
		  DemonThread t2=new DemonThread();  
		  DemonThread t3=new DemonThread();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
		 }  
		 
}
