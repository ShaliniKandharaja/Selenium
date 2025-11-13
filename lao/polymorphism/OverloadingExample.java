package lao.polymorphism;

public class OverloadingExample {
	
	// Method with one int parameter
    public void display(int num) {
        System.out.println("Displaying int: " + num);
    }

    // Overloaded method with one String parameter
    public void display(String text) {
        System.out.println("Displaying String: " + text);
    }

    // Overloaded method with two parameters
    public void display(int num, String text) {
        System.out.println("Displaying int and String:"+num+" "+text);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.display(10);                  // Output: Displaying int: 10
        obj.display("Hello");            // Output: Displaying String: Hello
        obj.display(20, "Java");         // Output: Displaying int and String: 20, Java
    }

}
