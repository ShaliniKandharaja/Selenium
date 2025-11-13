package lao.string;

public class ArrayExample {

	public static void main(String[] args) {
		
		 // Declare and initialize an array of 5 integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements using index
        System.out.println("First element: " + numbers[0]);  // 10
        System.out.println("Third element: " + numbers[2]);  // 30

        // Loop through the array and print all elements
        System.out.print("All numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

	}

}
