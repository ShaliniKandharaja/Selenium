package javaprograms;

public class IsPrime {

	public static void main(String[] args) {
		
		int num=7;
		boolean isPrime=true;
		
		//0 and 1 are not prime numbers
		if(num<=1) {
			isPrime=false;
		}
		else {
			//check divisibility from 2 to num/2
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(num +" is a prime number");
		}else {
			System.out.println(num +" is not a prime number");
		}
	}
		

	}


