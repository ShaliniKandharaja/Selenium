package javacollection;

public class Safari extends Edge{
	
	public void readerMode() {
		System.out.println("readerMode --> Safari Class");
	}
	
	public void fullScreenMode() {
		System.out.println("fullScreenMode --> Safari Class");
	}
	
	public static void main(String[] args) {
		
		Safari saf=new Safari();
		saf.closeBrowser();
		saf.navigateBack();
		saf.openURL();
		saf.clearCatche();
		saf.openIncognito();
		saf.clearCookies();
		saf.takeSnap();
		saf.readerMode();
		saf.fullScreenMode();
	}
	
	

}
