package collection;

import java.util.Map;
import java.util.TreeMap;
/* TreeMap - KeyPoints
 * Stores keys in sorted/ascending order
 * Uses Red-Black Tree
 * Does not allow null key
 * Slower than HashMap & LinkedHashMap 
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();

		map.put(50, "Dog");
		map.put(20, "Cat");
		map.put(10, "Lion");
		map.put(40, "Tiger");
		map.put(30, "Rabbit");

		System.out.println(map);
		
		System.out.println(map.get(20)); // Returns value in particular key
		
		System.out.println(map.containsKey(50));
		
		map.remove(10);
		System.out.println(map);
		
		System.out.println(map.containsValue("Tiger"));
		
		System.out.println(map.keySet()); // Returns all keys
		
		System.out.println(map.values()); // Returns all values
		
		System.out.println(map.entrySet()); // Returns all key+value pairs
		
		// Map Iteration
		for (Integer key : map.keySet()) {
		    System.out.println(key + " = " + map.get(key));
		}

	}

}
