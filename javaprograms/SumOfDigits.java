package javaprograms;

public class SumOfDigits {

	public static void main(String[] args) {
		int a = 14896;
		int sum = 0; 
		
		while (a > 0) 
		{ int digit = a % 10; // extract last digit 
		sum = sum + digit; // add digit to sum 
		a = a / 10; // remove last digit 
		} 
		System.out.println("Sum of digits = " + sum); 
	
		}

	}


