package javaopps;

public class Amazon extends CanaraBank  {

	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Record of Payment Details--> Amazon class");
			
	}

	public static void main(String[] args) {
		Amazon amazon=new Amazon();
		amazon.cardPayments();
		amazon.cashOnDelivery();
		amazon.internetBanking();
		amazon.upiPayments();
		amazon.recordPaymentDetails();
		
	}
	
	


}
