package com.yash.newconcepts.collection;

import java.util.ArrayList;
import java.util.Collections;
public class Watches {

  public static void main(String[] args) {
    ArrayList<String> watches = new ArrayList<String>();
    watches.add("Smart Watch");
    watches.add("Digital Watch");
    watches.add("Sport Watch");
    watches.add("Analog Watch");
    //System.out.println(watches);
    System.out.println(watches.size());
    watches.remove(0);
    watches.add("Swisros");
    watches.set(0, "Titan");
    Collections.sort(watches);
    System.out.println(watches);
    for (String i : watches) {
        System.out.println(i);
      }
    watches.clear();
    System.out.println(watches);


    
  }
}


