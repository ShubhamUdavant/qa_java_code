package org.company;

public class CompanuInfo {
	private void companyName(String name) {
		// TODO Auto-generated method stub
		System.out.println(" "+name);
	}
	private void companyName(int roll, String name) {
		// TODO Auto-generated method stub
		System.out.println(" "+roll+ " "+name);
	}
	public static void main(String[] args) {
		CompanuInfo ci = new CompanuInfo();
		ci.companyName("Shubham");
		ci.companyName(320, "Karan");
	}
}
