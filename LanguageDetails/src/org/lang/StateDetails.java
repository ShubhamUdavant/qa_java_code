package org.lang;

public class StateDetails {
	private void southIndia() {
	// TODO Auto-generated method stub
			System.out.println("SOUTH INDIAN");
	}
	private void northIndia() {
		// TODO Auto-generated method stub
			System.out.println("NOTH INDIAN");
	}
	public static void main(String[] args) {
		StateDetails sd = new StateDetails();
		sd.southIndia();
		sd.northIndia();
		
		LanguageInfo li = new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();		
	}
}
