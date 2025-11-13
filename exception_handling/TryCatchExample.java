package exception_handling;

public class TryCatchExample {
	
	
	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0; // This will throw ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!");
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }
	

}
