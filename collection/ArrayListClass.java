package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {


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

		//To get element in particular index
		System.out.println(arrayList.get(0));

		//// To get Index of Particular element
		System.out.println(arrayList.indexOf("Bugati"));
		System.out.println(arrayList.lastIndexOf("Bently"));


		// To copy all to another List
		List<String> anotherList=new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);


		// To Clear List
		anotherList.clear();
		System.out.println(anotherList);


		// To remove particular element in List
		arrayList.remove(0);
		arrayList.remove("Bently");
		System.out.println(arrayList);

		// we can add null element in ArrayList
		arrayList.add(null);
		System.out.println(arrayList);


		// To update element in particular position
		arrayList.set(2, "Tata");
		System.out.println(arrayList);


		//To Check list is empty or not
		System.out.println(arrayList.isEmpty());

		//For Loop
		System.out.println("For Loop");
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println("Elements in list are :"+arrayList.get(i));
		}

		System.out.println("-------------------------------------------------");

		//For each loop
		System.out.println("For each Loop");
		for(String str:arrayList) {
			System.out.println("Elements in list are :"+str);
		}

		System.out.println("-------------------------------------------------");

		//Iterator --> We can do forward traverse only
		System.out.println("Using Iterator");
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements in list are :"+iterator.next());
		}

		System.out.println("-------------------------------------------------");

		// Forward traversing using ListIterator
		System.out.println("Using ListIterator");
		ListIterator<String> list_iterator=arrayList.listIterator();
		while(list_iterator.hasNext()) {
			System.out.println(list_iterator.next());
		}
		System.out.println("---------------------------------------");
		// Backward traversing using ListIterator
		while(list_iterator.hasPrevious()){
			System.out.println(list_iterator.previous());
		}
		
		System.out.println("---------------------------------------");

	}
	public static void main(String[] args) {

		ArrayListClass al=new ArrayListClass();
		al.arrayListExample();


	}

}
