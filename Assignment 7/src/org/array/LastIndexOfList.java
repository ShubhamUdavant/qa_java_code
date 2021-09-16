package org.array;

import java.util.ArrayList;
import java.util.List;

public class LastIndexOfList {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add(60);
		li.add(50);
		li.add(90);
		li.add(20);
		li.add(10);
		li.add(40);
		li.add(60);
		System.out.println(li);
		
		//Last index of 10
		int lo = li.lastIndexOf(10);
		System.out.println("Last index of 10 is  "+lo);
		
		//find the index of 50
		int io = li.indexOf(50);
		System.out.println("Index of 50 is  "+io);
		
		//Get the index value of 90
		int it = li.indexOf(90);
		System.out.println("Index value of 90  "+it);
		
		//all index values of 10
		int ii = li.indexOf(10);
		System.out.println("All index value of 10  "+ii);
	}

}
