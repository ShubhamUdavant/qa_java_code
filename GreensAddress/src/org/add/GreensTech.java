package org.add;

public class GreensTech {

	private void geensOmr(String order) {
		// TODO Auto-generated method stub
System.out.println(""+order);
	}

	private void geensOmr(String order, String type) {
		// TODO Auto-generated method stub
System.out.println(""+order+""+type);
	}
	
	private void geensOmr(int number) {
		// TODO Auto-generated method stub
System.out.println(""+number);
	}
	public static void main(String[] args) {
		GreensTech gt = new GreensTech();
		gt.geensOmr("1 to 5");
		gt.geensOmr("1 to 5", "fifth");
		gt.geensOmr(91);
	}
	
}
