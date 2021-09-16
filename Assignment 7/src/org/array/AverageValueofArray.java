package org.array;

import java.util.Scanner;

public class AverageValueofArray {
	public static void main(String[] args) {
		int a[] = new int[10];
		int i = 0;
		float avg = 0;
		float multi = 0;
		int z = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element for array");
		
		for(int x=0; x<10; x++)
		{
			a[x]=sc.nextInt();
			z = a[x];
			multi = multi+z;
			
		}
		avg = multi/10;
		System.out.println("average of enter array is"+avg);
	}
}
