package lao.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {	

	public void arrayListExample() {
		// ArrayList will maintain insertion order
		List <String> arrayList = new ArrayList<String>();
		arrayList.add("Benz");
		arrayList.add("BMW");
		arrayList.add("Bugati");
		arrayList.add("Bently");
		arrayList.add("Bently");
		// ArrayList will allow duplicates
		System.out.println(arrayList);

		// To get element in particular index
		System.out.println(arrayList.get(0));
		// To get Index of Particular element
		System.out.println(arrayList.indexOf("Bently"));
		System.out.println(arrayList.lastIndexOf("Bently"));

		// To copy all to another List
		List <String> anotherList = new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);

		// To Clear List
		anotherList.clear();
		System.out.println(anotherList);

		// To remove particular element in List
		arrayList.remove(0);
		arrayList.remove("Bugati");
		System.out.println(arrayList);
		// we can add null element in ArrayList
		arrayList.add(null);
		System.out.println(arrayList);

		// To update element in particular position
		arrayList.set(2, "Tata");
		System.out.println(arrayList);

		//To Check list is empty or not
		System.out.println(arrayList.isEmpty());

		//Iterate
		for (String string : arrayList) {
			System.out.println("Using For each "+string);
		}

		System.out.println("---------------------------------------");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Using For Loop "+ arrayList.get(i));
		}

		System.out.println("---------------------------------------");
		// Forward traversing using ListIterator

		ListIterator<String> list_iterator=arrayList.listIterator();

		while(list_iterator.hasNext()) {
			System.out.println(list_iterator.next());
		}
		System.out.println("---------------------------------------");
		// Backward traversing using ListIterator
		while(list_iterator.hasPrevious()) {
			System.out.println(list_iterator.previous());
		}
		System.out.println("---------------------------------------");

		// Forward traversing using Iterator ( Forward traverse only possible in Iterator, not Backward traverse)

		Iterator<String>  iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				
	}


	public static void main(String[] args) {
		ArrayListExample obj=new ArrayListExample();
		obj.arrayListExample();

	}
	
	// ConcurrentmodificationException --> When list is Iterating , on the same time when we try to add element to that list, we get this error.

}
