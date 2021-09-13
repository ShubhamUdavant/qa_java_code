package org.network;

public class Wifi {
	private void wifiName() {
	// TODO Auto-generated method stub
		System.out.println("Wifi's Name");
	}
	
	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();
		
		MobileData md = new MobileData();
		md.dataName();
		
		Lan l = new Lan();
		l.lanName();
		
		Wireless wl = new Wireless();
		wl.modamName();
	}
}
