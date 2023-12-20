package week1.day2.homeassignments;

public class FibonacciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		
		System.out.println("Fibonacci Series:");
		
		int first=0;
		int second=1;
		
		for (int i=0; i<n; i++) {
			System.out.println(first+" ");
			
			int next=first+second;
			first=second;
			second=next;
			
		}

	}

}
