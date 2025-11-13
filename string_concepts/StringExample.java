package string_concepts;

public class StringExample {

	public static void main(String args[]) {

		String name="Agni";
		int number=3;

		//Returns character value of particular index
		System.out.println(name.charAt(0));

		//return String length
		System.out.println(name.length());

		//Check the equality of String with given value
		System.out.println(name.equals("Arul"));

		//Check the equality of String with given value without case sensitivity
		System.out.println(name.equalsIgnoreCase("ARUL"));

		//Check if String is empty or not
		System.out.println(name.isEmpty());

		//Return index of character
		System.out.println(name.indexOf("A"));

		//Return particular portion of String
		System.out.println(name.substring(1));

		//Return particular portion of String beginning and End Index
		System.out.println(name.substring(1,3));

		//Appends the String to the given String
		System.out.println(name.concat("Prasath"));

		//replace existing character with given character
		System.out.println(name.replace("g","G"));
		System.out.println(name.replace("Arul", "Agni"));

		//Return true of false based on given character present or not
		System.out.println(name.contains("A"));

		// Trim will remove the white spaces Before and After
		System.out.println(name.trim());

		//Convert To lower case
		String name2="SHALINI";
		System.out.println(name2.toLowerCase());

		//Convert to Upper Case
		String name3="ranjini";
		System.out.println(name3.toUpperCase());

		//Returns joined String with given delimiter
		System.out.println(String.join("-", "Learn", "Automation", "Online"));
		System.out.println(String.join("/", "04", "04", "2000"));

		//Split
		String Sentence="Am,I,teaching,good?";
		String[] Words=Sentence.split(",");

		for (String string : Words) {
			System.out.println(string);
		}

		/* for (datatype element : Collection){
		   // Use the element
	       }  */
	}

}
