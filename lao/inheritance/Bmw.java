package lao.inheritance;

public class Bmw extends Car{ //Inheritance using extends keyword
	
	public static void main(String args[]) {
		Bmw obj=new Bmw();
		obj.engine();  // Child can inherit method from Parent Class
		System.out.println("Number of wheels are "+obj.wheels); // Child can inherit Variables also from Parent Class
	}

}
