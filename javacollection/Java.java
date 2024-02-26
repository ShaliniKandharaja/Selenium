package javacollection;

public class Java {
	
	
	public void reportStep(String msg,String staus) {
		
		System.out.println("Message is : " +msg);
		System.out.println("Status is : " +staus);
		
	}
	
	public void reportStep(String msg,String staus,boolean snap) {
		System.out.println("Message is : " +msg);
		System.out.println("Status is : " +staus);
		System.out.println("snap has taken : " +snap);
			
	}
	
	public static void main(String[] args) {
		Java java=new Java();
		java.reportStep("Report1", "Completed");
		java.reportStep("Report2", "Inprogress", true);
	}

}
