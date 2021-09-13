package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.*;

public class Vehicle {
	public void VehicleNecessery() {
		// TODO Auto-generated method stub
		System.out.println("NO VEHICLE NO ENTRY");
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.VehicleNecessery();
		
		TwoWheller tw = new TwoWheller();
		tw.bike();
		tw.cycle();
		
		ThreeWheeler th = new ThreeWheeler();
		th.Auto();
		
		FourWheeler fw = new FourWheeler();
		fw.bus();
		fw.car();
		fw.lorry();
	}
}
