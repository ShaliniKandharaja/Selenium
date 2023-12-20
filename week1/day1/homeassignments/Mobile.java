package week1.day1.homeassignments;

public class Mobile {
	
	public String makeCall(String mobileModel,float mobileWeight ){
		return mobileModel+" "+mobileWeight; 
			
	}
	
	public String sendMsg(boolean isFullCharged ,int mobileCost) {
		
		return mobileCost+" "+isFullCharged;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mob=new Mobile();
		String mobileDetails=mob.makeCall("Moto",250.5f);
		System.out.println(mobileDetails);
		String mobileDetails2=mob.sendMsg(true,10000);
		System.out.println(mobileDetails2);
		
		System.out.println("This is my mobile");

	}

}
