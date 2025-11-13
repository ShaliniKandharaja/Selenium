package exception_handling;

// Even though InvalidAgeException is a separate class, it's defined in the same file and isn't public, so it's allowed.
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);  //  // Passes the message to the parent Exception class
	}
}

public class CustomThrowExample {
	public static void main(String[] args) {
		int age = 15;

		try {
			if (age < 18) {
				throw new InvalidAgeException("Not eligible to vote.");
			}
			System.out.println("Eligible to vote.");

		} catch (InvalidAgeException e) {
			System.out.println("Custom exception caught: " + e.getMessage());
		}
	}
}

/*
 * class InvalidAgeException extends Exception 
 * You're creating a new exception type.
 * It inherits from Java’s Exception class, so it's a checked exception (must be
 * handled or declared with throws).
 * 
 * public InvalidAgeException(String message)
 * This is the constructor for your exception.
 * It takes a custom error message.
 * 
 * super(message)
 * It calls the constructor of the parent class (Exception), so the message can be retrieved later using getMessage().
 * 
 */


