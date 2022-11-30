package collections.lists.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(12);
		linkedList.add(20);
		linkedList.add(12);
		linkedList.add(7);
		linkedList.add(1, 33);

		System.out.println("Size: " + linkedList.size());

		Iterator<Integer> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Ilk eleman: " + linkedList.get(0));
		System.out.println("Son eleman: " + linkedList.get(linkedList.size() - 1));

		linkedList.addFirst(74);
		System.out.println("Ilk eleman: " + linkedList.getFirst());

		linkedList.addLast(65);
		System.out.println("Son eleman: " + linkedList.getLast());
	
		linkedList.remove(6); //indexe göre siler
		
		
		Iterator<Integer> iterator2 = linkedList.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		
		int indexOf = linkedList.indexOf(20);
		System.out.println("Index Of: " + indexOf);
		
		System.out.println(linkedList.get(24)); //hata verir

	}
}
