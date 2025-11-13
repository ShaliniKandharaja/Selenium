package string_concepts;

public class StringBufferExamples {
	
	public static void main(String[] args) {
		
		//String is IMMUTABLE
		System.out.println("String is IMMUTABLE");
		String name="Arya";
		System.out.println("Apending name "+name.concat("Prasath"));
		System.out.println(name);
		
		//StringBuffer is MUTABLE
		System.out.println("StringBuffer is MUTABLE");
		StringBuffer  name1=new StringBuffer("Arya");
		System.out.println("Apending name "+name1.append("Prasath"));
		System.out.println(name1);
		
		//StringBuffer Methods
		//reverse
		System.out.println(name1.reverse());
		
		//Replace
		StringBuffer replaceThis=new StringBuffer("Arul");
		System.out.println(replaceThis.replace(0, 4, "Riya"));
		
		//Delete
		StringBuffer deleteThis=new StringBuffer("XYZRiya");
		System.out.println(deleteThis.delete(0, 3));
		
		//Insert
		StringBuffer insertThis=new StringBuffer("Moni");
		System.out.println(insertThis.insert(4, "Sha"));
		
		//Capacity
		System.out.println(insertThis.capacity());
		
		// Like String we have chatAt, SubString, length methods as well.
	}

}
