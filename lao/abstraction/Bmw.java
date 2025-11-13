package lao.abstraction;
//Child Class should Implement all abstract methods of Parent, Otherwise Child class also will be an abstract class.

public class Bmw extends Car implements UpComingProjects{ // Class using Interface -->implements Keyword
	
	@Override
	public void engineSecret() {
		System.out.println("Cars Engine BMW");
	}
	
	@Override
	public void companyValut() {
		System.out.println("Companys Valut BMW");
	}
	
	public void method1() {
		System.out.println("This is method1-BMW");
		
	}

	public void method2() {
		System.out.println("This is method2-BMW");
		
	}
	
	public static void main(String args[]) {
//		Car car=new Bmw();
//		car.companyValut();
//		car.engineSecret();
//		car.employee();
		
		Bmw b=new Bmw();
		b.method1();
		b.method2();
		b.employee();
	}
	

}
