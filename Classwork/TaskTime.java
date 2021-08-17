package com.yash.newconcepts.multithreading;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TaskTime { 
	public static void main(String[] args) {  
		// creating timer task, timer  
		Timer t = new Timer();  
		TimerTask tt = new TimerTask() {  
			@Override  
			public void run() {  

				System.out.println("working on");  

			};  
		};  
		t.schedule(tt, new Date(),1000); ;  
	}  


}
