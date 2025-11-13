package lao.polymorphism;

public class Cat extends Animal{
	
	@Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
	
	public static void main(String[] args) {
       
        Animal a2 = new Cat(); // Upcasting
        a2.makeSound(); // Output: The cat meows
    }
	
}
