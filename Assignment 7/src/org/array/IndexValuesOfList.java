package org.array;

import java.util.ArrayList;
import java.util.List;

public class IndexValuesOfList {
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
		
		//Get the value present at 2nd index
		Integer itwo = li.get(2);
		System.out.println("value present at 2nd index " +itwo);
		
		//Get the value present at 4th index
		Integer ifour = li.get(4);
		System.out.println("Values present at 4th index  "+ifour);
		
		//Get the value present at 8th index
		Integer ieight = li.get(7);
		System.out.println("Values present at 8th index  "+ieight);
		
		//get each value of list by using enhanced for loop
		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(li);
		for(Integer x : l1) {
			System.out.println(x);
		}
	}

}
