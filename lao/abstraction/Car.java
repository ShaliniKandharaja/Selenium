package lao.abstraction;

//Abstract class → Can have both Implemented methods & Abstract methods as well
//It can have complete Abstract Methods as well , That’s Why ( 0 to 100% Abstraction)
//In Class → Any one function(method) is abstract → Class also should be abstract.
public abstract class Car {
	
	public abstract void engineSecret();
	
	public abstract void companyValut();
	
	public void employee() {
		System.out.println("Car Making Engineers");
	}

}
//We can not create object for Abstract Class
//A class can be declared as an abstract class, even though it doesn’t have abstract methods.

