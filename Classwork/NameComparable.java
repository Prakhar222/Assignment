package com.yash.newconcepts.collection;

public class NameComparable implements Comparable<Customer> {
	String name;

@Override

public int compareTo(Customer obj) {
    return this.name.compareTo(obj.name);
}
}
