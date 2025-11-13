package lao.string;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 876797;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;  // Get last digit
            sum =sum + digit;     //sum=sum+digit        // Add to sum
            num =num/10;             // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
	}


