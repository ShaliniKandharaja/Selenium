package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	/* TreeSet - KeyPoints
	 * Maintains ascending sorted order
	 * Does NOT allow null
	 * Slower than HashSet & LinkedHashSet
	 * Uses Red-Black tree internally */
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicates are not allowed

        System.out.println(set);

	}

}

/* ✔ Use HashSet

When you need fast performance and don’t care about order.

✔ Use LinkedHashSet

When you need insertion order.

✔ Use TreeSet

When you need elements in sorted order. */
