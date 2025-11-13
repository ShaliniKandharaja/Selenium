package lao.static_keyword;

public class StaticVariables {
	
	/*
	 * Example to show static variable shared among objects.
	 */
	
	static int accountBalance;
	String depositedBy;
	
	public static void main(String args[]) {
		StaticVariables obj1=new StaticVariables();
		obj1.accountBalance=1000;
		obj1.depositedBy="Ranjitha";
		
		StaticVariables obj2=new StaticVariables();
		obj2.accountBalance=2000;   // Since accountBalance is static , for all the methods we got 2000 only.
		obj2.depositedBy="Shalini";
		//Static variable will have same value for all instances(Objects) of Class
		System.out.println("Object1 Integer "+obj1.accountBalance); // Static variable we can call without creating object also
		System.out.println("Object1 String "+obj1.depositedBy);
		
		System.out.println("Object1 Integer "+obj2.accountBalance);
		System.out.println("Object1 String "+obj2.depositedBy);
		
	}

}
