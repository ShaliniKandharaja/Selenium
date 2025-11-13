package exception_handling;

public class CheckedExceptionExample {

	 String name="Shalini";
	public static void main(String[] args) {
		//We cannot access a non-static variable name from a static context main(), which is not allowed in Java directly.
		//Make name static  OR Create an object of the class to access the non-static variable.
		//System.out.println(name);

	}

}

/* 1. Make name static
 * static String name = "Shalini";
 * 
 * public static void main(String[] args) { System.out.println(name); }
 */ 


/* 2. Create an object of the class to access the non-static variable.
 * String name = "Shalini";
 * 
 * public static void main(String[] args) { CheckedExceptionExample obj = new
 * CheckedExceptionExample(); System.out.println(obj.name); }
 */



