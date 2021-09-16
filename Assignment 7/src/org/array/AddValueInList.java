package org.array;

import java.util.ArrayList;
import java.util.List;

public class AddValueInList {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		
		System.out.println(li);
		
		//to add the value 50 in the 2nd index of list
		li.add(2, 50);
		System.out.println("to add the value 50 in the 2nd index of list");
		System.out.println(li);
		
		//add value 70 at the end of the list
		li.add(9, 70);
		System.out.println("add value 70 at the end of the list");
		System.out.println(li);
		
		//add value 80 at the 8th index of list
		li.add(8, 80);
		System.out.println("add value 80 at the 8th index of list");
		System.out.println(li);
		
		//add the value 100 at the last index of 10 in the list
		li.add(10, 100);
		System.out.println("add the value 100 at the last index of 10 in the list");
		System.out.println(li);
	}


}
