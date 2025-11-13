package collection;

import java.util.HashSet;
import java.util.Set;

//Set - KeyPoints
//No duplicates
//Order may or may not be maintained depending on implementation
//Allows null (except TreeSet)
public class HashSetDemo {
	 /* HashSet - KeyPoints
	  * Does not maintain order
	  * Stores elements based on hashing
	  * Fastest among all Set implementations
	  * Allows one null element */
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicates not allowed in Set

        System.out.println(set);

	}

}
