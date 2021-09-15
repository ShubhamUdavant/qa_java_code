package org.string;

import java.util.Scanner;

public class ReplaceWord2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			String repla = s1.replaceAll("Adayar","Omr");
			System.out.println(repla);
	}

}
