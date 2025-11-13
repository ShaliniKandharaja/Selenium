package collection;

import java.util.HashMap;
import java.util.Map;
/* Map - KeyPoints
 * Keys must be unique
 * Values can be duplicate
 * A key maps to only one value
 * No index-based access (unlike List)
 */
public class HashMapDemo {

	/* HashMap - KeyPoints
	 * Fastest Map implementation
	 * No ordering of keys
	 * Allows one null key + multiple null values
	 * Not synchronized (not thread-safe) 
	 */
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(4, "PineApple");
		map.put(3, "Gova");
		map.put(1, "Orange"); // Overrides previous value
		
		System.out.println(map);
		

	}

}
