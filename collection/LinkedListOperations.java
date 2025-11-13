package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {

	public  void listOperations() {
		// LinkedList is best for Insertion and Deletion of data

		LinkedList<Integer> Numlist=new LinkedList<Integer>();
		Numlist.add(2);
		Numlist.add(3);
		Numlist.add(4);

		System.out.println("Linked List :" +Numlist);

		Numlist.addFirst(1);

		System.out.println("Linked List after adding first:" +Numlist);

		Numlist.addLast(5);

		System.out.println("Linked List after adding last:"+ Numlist);

		// ArrayList --> Performs well in retrieval of data

		System.out.println("LinkedList first num "+Numlist.getFirst());
		System.out.println("LinkedList last num "+Numlist.getLast());

		System.out.println(Numlist.get(0));

		System.out.println("Third value of the list : "+ Numlist.get(3));

		System.out.println("Remove first :"+Numlist.removeFirst());
		System.out.println("Remove last :"+Numlist.removeLast());

		System.out.println("Linked List after remove:" +Numlist);

		//poll method  and pollfirst() deletes the first element in the list
		System.out.println(Numlist.poll());
		System.out.println(Numlist);
		System.out.println(Numlist.pollFirst());
		System.out.println(Numlist);

		Numlist.add(6);
		Numlist.add(7);

		System.out.println(Numlist);


		//pollLast deletes the last
		System.out.println(Numlist.pollLast());
		System.out.println(Numlist);


		//remove deletes the first element
		Numlist.remove();
		System.out.println(Numlist);

		//Adding // List will allow duplicates
		Numlist.addFirst(1);
		Numlist.add(2);
		Numlist.add(3);
		Numlist.add(4);
		Numlist.add(5);
		Numlist.add(5);
		Numlist.add(2);
		Numlist.addLast(8);
		System.out.println(Numlist);

		Numlist.removeFirstOccurrence(2);
		Numlist.removeLastOccurrence(5);

		System.out.println(Numlist);

		System.out.println("-----------------------------------------------------");

	}

	public void iterateLinkedListWithSimpleFor(){

		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("Simple For loop");
		
		for(int index=0; index<linkedList.size(); index++) {
			System.out.println(" Elements in LL are "+linkedList.get(index));
		}
		System.out.println("-----------------------------------------------------");

	}
	
	public void iterationWithAdvancedFor(){
		LinkedList<String> newList=new LinkedList<String>();
		newList.add("e");
		newList.add("f");
		newList.add("g");
		newList.add("h");
		System.out.println("For each loop");
		for(String var :newList ) {
			System.out.println(" Elements in LL are "+var);
		}
		System.out.println("-----------------------------------------------------");
	}

	public static void main(String args[]) {
		LinkedListOperations list=new LinkedListOperations();
		list.listOperations();
		list.iterateLinkedListWithSimpleFor();
		list.iterationWithAdvancedFor();
		list.iterateUsingIterator();
	}
	
	
	/*
	 * Iterate using Iterator
	 */
	public void iterateUsingIterator(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("i");
		linkedList.add("j");
		linkedList.add("k");
		linkedList.add("l");
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(" Elements in LL are "+iterator.next());
		}
		System.out.println("-----------------------------------------------------");
	}

}
