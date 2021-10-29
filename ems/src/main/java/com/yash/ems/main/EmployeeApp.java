package com.yash.ems.main;

// This is main class where all functions are called

import java.util.Scanner;

import com.yash.ems.serviceimpl.EmployeeServiceImpl;
//Creation of Employee class
public class EmployeeApp {
	public static void main(String[] args){
		lp:while(true)
		{
		Scanner sc=new Scanner(System.in);
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		System.out.println("\n");
        System.out.println("1.Show All Employee");
        System.out.println("2.Employee By Salary");
        System.out.println("3.Employee By Name");
        System.out.println("4.Employee By Department");
        System.out.println("5.Employee By ID");
        System.out.println("\nEnter Your Choice :");
        Scanner sc1=new Scanner(System.in);
        int choice=sc1.nextInt();
   
      //Here we can give menu to the user
           
            switch (choice)
            {
            case 1:
                service.getAllEmployee();
                break;
               
            case 2:
                service.getEmployeeBySalary();
                break;
               
            case 3:
                service.getEmployeeByName();
                break;
               
            case 4:
                service.getEmployeeByDept();
                break;
            case 5: 
                try
                {
                	service.getEmployeeById();
                }
                catch(Exception e) {
                    System.out.println(e);

                }
                
               //if user enter any invalid data 
            
            default:
            	System.out.println("Enter valid value");
                break;
            }
		}
        
	}
}
