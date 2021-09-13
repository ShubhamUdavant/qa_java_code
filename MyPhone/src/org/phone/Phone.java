package org.phone;

public class Phone {
	private void phoneInfo(int number) {
		// TODO Auto-generated method stub
System.out.println(+number);
	}
	private void phoneInfo(String name) {
		// TODO Auto-generated method stub
System.out.println(""+name);
	}
	private void phoneInfo(String name, int number) {
		// TODO Auto-generated method stub
System.out.println(""+name+ " " +number);
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo(245);
		p.phoneInfo("shubham");
		p.phoneInfo("Shubham", 345);
	}

}
