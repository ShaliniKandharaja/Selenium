package javaopps;

public abstract class CanaraBank implements Payments{
	
	
	public abstract void recordPaymentDetails(); 
		
	@Override
	public void cashOnDelivery() {
		System.out.println("cashOnDelivery -->CanaraBank Class ");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upiPayments -->CanaraBank Class");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments -->CanaraBank Class");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking -->CanaraBank Class");
		
	}

}
