package collections.sets.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Adana");
		hashSet.add("Izmir");
		hashSet.add("Van");
		hashSet.add("Izmir"); // unique tutar eklemez

		System.out.println("Size: " + hashSet.size());

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		System.out.println("******************");

		HashSet<Worker> hashSet2 = new HashSet<Worker>();
		hashSet2.add(new Worker("1", "Ali"));
		hashSet2.add(new Worker("2", "Hasan")); // national id ye göre unique oldu hash code u da ona çevirdik
		hashSet2.add(new Worker("3", "Kemal"));
		hashSet2.add(new Worker("2", "Hasan"));

		Iterator<Worker> iterator2 = hashSet2.iterator();
		while (iterator2.hasNext()) {
			Worker next = iterator2.next();
			System.out.println(next);
		}

		
	}
}
