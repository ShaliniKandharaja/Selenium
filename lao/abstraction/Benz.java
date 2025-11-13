package lao.abstraction;
//A Class can implement multiple Interfaces. But A Class cannot extends multiple classes
//Note : Multiple Inheritance in Java achieved through Interfaces

public class Benz extends Car implements UpComingProjects,Interface2 {
	
	@Override
	public void engineSecret() {
		System.out.println("Cars Engine Benz");
	}
	
	@Override
	public void companyValut() {
		System.out.println("Companys Valut Benz");
	}
	
	public void method1() {
		System.out.println("This is method1-Benz");
		
	}

	public void method2() {
		System.out.println("This is method2-Benz");
	}
	
	public static void main(String args[]) {
	/*	Car car=new Benz();
		car.companyValut();
		car.engineSecret();
		car.employee();  */
		
		Benz b1=new Benz();
		b1.method1();
		b1.method2();
		b1.companyValut();
		b1.engineSecret();
		b1.employee();  
		
	}

	

}
