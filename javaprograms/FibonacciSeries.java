package javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=8;
		// 0 1 1 2 3 5 8 13
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
