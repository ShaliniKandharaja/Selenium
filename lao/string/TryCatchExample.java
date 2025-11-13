package lao.string;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
        	e.printStackTrace();
            System.out.println("Cannot divide by zero!");
        }
		finally {
            System.out.println("This block always runs.");
        }

        System.out.println("Program continues after try-catch block.");

	}

}
