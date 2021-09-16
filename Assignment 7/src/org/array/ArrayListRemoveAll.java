package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAll {

	public static void main(String[] args) {
		List li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(80);
		
		//removeall function use
		l1.removeAll(li);
		System.out.println(l1);
	}
}
