package com.yash.newconcepts.collection;

import java.util.* ;
public class IteratorExample
{
  public static void main ( String[] args)
  {
    // Create and populate the list
    ArrayList<String> names = new ArrayList<String>();
    names.add( "Ram" );   
    names.add( "Mohan" ); 
    names.add( "Sohan" );

    // Create an iterator for the list
    Iterator<String> iter = names.iterator();
   
    while ( iter.hasNext() )
      System.out.println( iter.next() );

  }
}
