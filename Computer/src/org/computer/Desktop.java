package org.computer;

public class Desktop extends Computer{
	private void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("Size of Dektop is : 52inch");
	}
		public static void main(String[] args) {
			Desktop dt = new Desktop();
			dt.computerModel();
			dt.desktopSize();
		}

}
