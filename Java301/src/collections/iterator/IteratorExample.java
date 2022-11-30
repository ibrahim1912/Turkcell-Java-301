package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i <10; i++) {
			arrayList.add(random.nextInt(100));
		}
		
		System.out.println("Size: " + arrayList.size());
		System.out.println();
		
		for (Integer integer : arrayList) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			if(iterator.next() >= 50) {
				iterator.remove();
			}
		}
	}

}
