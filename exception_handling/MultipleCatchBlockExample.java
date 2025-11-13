package exception_handling;

public class MultipleCatchBlockExample {
	
	 public static void main(String[] args) {
	        try {
	            int result = 10 / 0; // Throws ArithmeticException
	            String str = null;
	            System.out.println(str.length()); // Would throw NullPointerException

	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException: Cannot divide by zero!");
	        } catch (NullPointerException e) {
	            System.out.println("Caught NullPointerException: Null object used!");
	        } catch (Exception e) {
	            System.out.println("Caught General Exception: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }

}

// Java checks catch blocks top to bottom, so more specific exceptions must come first, and general ones (like Exception) last.
//If you reverse the order (e.g., put Exception first), you'll get a compile-time error.

// try – Code that may throw an exception

// catch – Handle the exception

// finally – Always executes (clean-up)

// throw – To explicitly throw an exception

// throws – Declares exceptions a method might throw