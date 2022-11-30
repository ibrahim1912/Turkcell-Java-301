package collections.sets.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
		hashSet.add(2);
		hashSet.add(0);
		hashSet.add(5);
		hashSet.add(4);
		hashSet.add(4); //eklemez
		
		System.out.println("Size: " + hashSet.size());
		System.out.println("Bos mu: " + hashSet.isEmpty());
		
		System.out.println("*****************");
		
		LinkedHashSet<Car> hashSet2 = new LinkedHashSet<Car>();
		hashSet2.add(new Car("AA", "35A"));
		hashSet2.add(new Car("BB", "36B")); 
		hashSet2.add(new Car("CC", "34C"));
		hashSet2.add(new Car("DD", "33D"));
		hashSet2.add(new Car("DD", "33D"));
		hashSet2.add(new Car("CC", "34C")); //eklemez hashcode ve equals'ı plate'e göre yaptık

		Iterator<Car> iterator = hashSet2.iterator();
		while (iterator.hasNext()) {
			Car next = iterator.next();
			System.out.println(next);
		}

	}
}
