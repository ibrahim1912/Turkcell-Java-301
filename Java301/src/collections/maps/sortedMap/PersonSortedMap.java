package collections.maps.sortedMap;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PersonSortedMap {

	public static void main(String[] args) {
		SortedMap<Integer, Person> sortedMap = new TreeMap<Integer, Person>();
		sortedMap.put(6, new Person("1212","Ahmet",Gender.MAN));
		sortedMap.put(7, new Person("4343","Osman",Gender.MAN));
		sortedMap.put(2, new Person("3343","Hilal",Gender.WOMAN));
		
		System.out.println("Size: " + sortedMap.size());
		
		Set<Integer> keySet = sortedMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			Person value = sortedMap.get(key);
			System.out.println("Key: " + key + " = " + " Value: " + value); //key e göre sıralı getirdi
		}
		
	}
}
