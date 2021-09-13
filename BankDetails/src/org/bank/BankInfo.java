package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("This is Yout Saving Account");
	}
	
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("This is your Fixed Account");
	}
	
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		
		bi.saving();
		bi.fixed();
		bi.deposti();
	}

}
