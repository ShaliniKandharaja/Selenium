package collection;

import java.util.LinkedHashMap;
import java.util.Map;
/* LinkedHashMap - KeyPoints
 * Maintains insertion order
 * Allows one null key + multiple null values
 * Slightly slower than HashMap
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(10, "Java");
		map.put(20, "Python");
		map.put(30, "Selenium");

		System.out.println(map);

	}

}
