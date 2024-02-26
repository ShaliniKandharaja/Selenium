package seleniumlocators;
import java.util.HashSet;
import java.util.Set;



public class UniqueCharacters {

	public static void main(String[] args) {
	
		String companyName = "google";
		
		Set<Character> unique=new HashSet<>();
		
		char[] charArray = companyName.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);
		}
		
		System.out.println(unique);
		
		

	}

}
