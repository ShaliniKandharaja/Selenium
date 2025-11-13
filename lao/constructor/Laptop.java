package lao.constructor;

public class Laptop {

	String lapModel;
	String lapColour;

	//Parameterized Constructor
	Laptop(String Model,String Colour){
		lapModel=Model;
		lapColour=Colour;

	}

	public void sayAboutLaptop() {
		System.out.println("Laptop Model is " + lapModel);
		System.out.println("Laptop Colour is " + lapColour);
	}

	public static void main(String[] args) {
		//Laptop lap=new Laptop("TP", "BK");
		Laptop lap=new Laptop("HP", "White");
		Laptop lap1=new Laptop("Acer", "Black");
		lap.sayAboutLaptop();
		lap1.sayAboutLaptop();

	}

}
