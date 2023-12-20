package week1.day2;

public class Browser {
	
	 public String launchBrowser(String browserName){
		 System.out.println("Browser launched successfully");
		 return browserName;
		 
}
	 
	 public void loadUrl(){
	 int x=10*20-20;
	 System.out.println(x);
	 System.out.println("Application url loaded successfully");
	 
}
	 
	 public static void main(String[] args) {
		 Browser bro=new Browser();
		 
		 String broswer=bro.launchBrowser("Chrome");
		 System.out.println(broswer);
		 bro.loadUrl();
	}
	 
}
