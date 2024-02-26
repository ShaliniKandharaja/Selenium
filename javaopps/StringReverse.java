package javaopps;

public class StringReverse {

	String variable="TestLeaf";
	
	public static void main(String[] args) {
		
		String variable="TestLeaf";              // 0 1 2 3 4 5 6 7
		char[] charArray=variable.toCharArray(); // T E S T L E A F
		
//		for (int i=0 ; i< charArray.length ; i++) {
//			
//			System.out.print(charArray[i]);
//			
//		}
		
          for (int i=charArray.length-1 ; i>=0 ; i--) {
			
			System.out.print(charArray[i]);
			
		}
		
	}
}
