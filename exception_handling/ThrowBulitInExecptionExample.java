package exception_handling;

public class ThrowBulitInExecptionExample {
	
	
	    public static void main(String[] args) {
	        int age = -5;

	        try {
	            if (age < 0) {
	                throw new IllegalArgumentException("Age cannot be negative");
	            }
	            System.out.println("Valid age: " + age);

	        } catch (IllegalArgumentException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }

	    }
	

}
