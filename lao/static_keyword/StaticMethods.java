package lao.static_keyword;

public class StaticMethods {
	
	public static void method1() {
		//we can not call non static method, Inside a static method.
		//nonStatic();
		System.out.println("This is method1");
	}
	
	public void nonStatic() {
		//we can call static method, Inside a non static method.
		//method1();
		System.out.println("This is non static method");
	}
	
	//we can call static method, without creating an object.
	public static void main(String args[]) {
		method1();
		StaticMethods stat=new StaticMethods();
		stat.nonStatic();
	}

}
