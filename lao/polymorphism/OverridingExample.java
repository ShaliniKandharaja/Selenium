package lao.polymorphism;

public class OverridingExample {
	public static void main(String[] args) {
        Animal a1 = new Dog(); 
        Animal a2 = new Cat(); 

        a1.makeSound(); // Output: The dog barks
        a2.makeSound(); // Output: The cat meows
    }

}

//You do not need to extend a class in order to create an object of it.
//In Java, as long as the class is accessible (i.e., not private or package-restricted in some way), you can instantiate it freely like this
//You extend a class when you want to inherit behavior or override methods.
//But if you're just using the class, not modifying it — no need to extend it.