package collections.sets.navigableSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		NavigableSet<Integer> navigableSet = new TreeSet<>();
		navigableSet.add(45);
		navigableSet.add(0);
		navigableSet.add(-1);
		navigableSet.add(45); //eklemedi unique olmalı
		navigableSet.add(3);
		
		System.out.println("Size: " + navigableSet.size());
		
		Iterator<Integer> iterator = navigableSet.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
		
		System.out.println("Ceiling: " + navigableSet.ceiling(40)); //40 veya daha büyük değeri getir
		System.out.println("Floor: " + navigableSet.floor(40)); // 40 veya en yakın daha düşüğünü getirir.
		System.out.println("Lower: " + navigableSet.lower(45)); //verilen değerden daha küçüğünü getir
		System.out.println("Higher: " + navigableSet.higher(45)); //verilen değerden daha büyüğünü getir

		System.out.println("*****************");
		
		SortedSet<Integer> sortedSet = navigableSet.headSet(3); //değer olarak 15 ten aşagısını yazdır
		Iterator<Integer> iterator2 = sortedSet.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
