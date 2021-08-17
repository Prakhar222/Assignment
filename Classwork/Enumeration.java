package com.yash.newconcepts.collection;
import java.util.*;
import java.lang.*;
public class Enumeration {

		  public static void main ( String[] args)
		  {
		    // Create and populate the list
		    ArrayList<String> names = new ArrayList<String>();
		    names.add( "Ram" );   
		    names.add( "Mohan" ); 
		    names.add( "Sohan" );

		 // creating object of type Enumeration<String>
            java.util.Enumeration<String> e = Collections.enumeration(names);
            
            while (e.hasMoreElements())
                System.out.println(e.nextElement());

		  }
		}

