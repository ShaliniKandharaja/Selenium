package lao.polymorphism;

public class Dog extends Animal{
	
	@Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
	
	public static void main(String[] args) {
		
        Animal a1 = new Dog(); // Upcasting
        a1.makeSound(); // Output: The dog barks
       
    }

}
