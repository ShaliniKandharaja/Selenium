package exception_handling;

public class UncheckedException {
	
	 static String name;
		public static void main(String[] args) {
			//We cannot access a non-static variable name from a static context main(), which is not allowed in Java directly.
			//Make name static  OR Create an object of the class to access the non-static variable.
			System.out.println(name.length());

		}

}
