package org.array;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElementOfList {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		li.add(800);
		li.add(900);
		li.add(1000);
		li.add(450);
		
		System.out.println(li);
		
		//Replace the value 300 into 350 in the list
		li.set(2, 350);
		System.out.println("Replace the value 300 into 350 in the list");
		System.out.println(li);
		
		//Replace the value present in 7th index as 90
		li.set(7, 90);
		System.out.println("Replace the value present in 7th index as 90");
		System.out.println(li);
		
		//replace index 10 into 100
		li.set(10, 100);
		System.out.println("replace index 10 into 100");
		System.out.println(li);
}
}