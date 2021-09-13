
public class Desktop implements HardWare, Software {
private void destktopModel() {
	// TODO Auto-generated method stub
	System.out.println("Intefaces multiple inheritance");
}
@Override
	public void hardwareResource() {
		// TODO Auto-generated method stub
		System.out.println("All obout software class");
	}
@Override
	public void softwareResource() {
		// TODO Auto-generated method stub
		System.out.println("all about hardware class");
	}

public static void main(String[] args) {
	Desktop dt = new Desktop();
	dt.destktopModel();
	dt.hardwareResource();
	dt.softwareResource();
}
}
