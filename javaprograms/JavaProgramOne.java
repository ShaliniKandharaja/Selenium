package javaprograms;

public class JavaProgramOne {

	public static void main(String[] args) {
		/* Given a string s consisting of words and spaces, return the 
		length of the last word in the string.
        A word is a maximal substring consisting of non-space characters only.

		Example 1:
			Input: s = "Hello World"
			Output: 5
			Explanation: The last word is "World" with length 5.
		 */

		String s="Hello World";
		String s2="   fly me   to   the moon  ";
		String s3="luffy is still joyboy";

		JavaProgramOne java=new JavaProgramOne();
		
		int lastWordLength=java.getLastWordLength(s);
		int lastWordLength2=java.getLastWordLength2(s2);
		int lastWordLength3=java.getLastWordLength3(s3);
		
		
		System.out.println("In Example one length of the last word: "+lastWordLength);
		System.out.println("In Example two length of the last word: "+lastWordLength2);
		System.out.println("In Example three length of the last word: "+lastWordLength3);

	}

	public int getLastWordLength(String s) {

		//Split the string by space and get the last word
		String words[]=s.split(" ");

		int totalLength=words.length;

		//It retrieves the last word from the array
		String lastWord=words[totalLength-1];

		return lastWord.length();
	}
	/*
	 * Example 2:
         Input: s2 = "   fly me   to   the moon  "
         Output: 4
         Explanation: The last word is "moon" with length 4.
	 */
	public int getLastWordLength2(String s2) {

		//Split the string by space and get the last word
		String words[]=s2.split(" ");

		int totalLength=words.length;

		//It retrieves the last word from the array
		String lastWord2=words[totalLength-1];

		return lastWord2.length();

	}
	
	/*
	 Input: s3 = "luffy is still joyboy"
       Output: 6
       Explanation: The last word is "joyboy" with length 6.
	 */
	
	public int getLastWordLength3(String s3) {

		//Split the string by space and get the last word
		String words[]=s3.split(" ");

		int totalLength=words.length;

		//It retrieves the last word from the array
		String lastWord3=words[totalLength-1];

		return lastWord3.length();

	}
	
	

}



