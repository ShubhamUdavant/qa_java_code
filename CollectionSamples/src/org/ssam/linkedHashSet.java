package org.ssam;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
	public static void main(String[] args) {
		Set<Integer> se = new LinkedHashSet<Integer>();
		se.add(10);
		se.add(20);
		se.add(30);
		se.add(40);
		se.add(50);
		se.add(10);
		
		//size of set "duplicate not counted"
		int size = se.size();
		System.out.println(size);
		
		//remove the value from set
		se.remove(30);
		System.out.println(se);
		
		//to check particular value is present or not
		boolean co = se.contains(20);
		System.out.println(co);
		
		//to check set is empty or not
		boolean em = se.isEmpty();
		System.out.println(em);
		
		//clear the set
		se.clear();
		System.out.println(se);
	}

}
