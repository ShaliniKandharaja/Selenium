package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	/* LinkedHashSet - KeyPoints
	 * Maintains insertion order
	 * Slower than HashSet (because it uses a linked list internally)
	 * Allows one null */
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicates not allowed

        System.out.println(set);

	}

}
