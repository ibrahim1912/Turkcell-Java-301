package collections.maps.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,City> hashMap = new HashMap<Integer,City>();
		hashMap.put(34, new City("Istanbul",20_000_000));
		hashMap.put(35, new City("Izmir",6_000_000));
		hashMap.put(6, new City("Ankara",8_000_000));
		
		System.out.println("Size: " + hashMap.size());
		
		City city = hashMap.get(34);
		System.out.println(city);
		
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			City value = hashMap.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("***********************");
		
		Collection<City> values = hashMap.values();
		Iterator<City> iterator2 = values.iterator();
		while(iterator2.hasNext()) {
			City next = iterator2.next();
			System.out.println(next);
		}
		
		System.out.println("***********************");
		
		Set<Entry<Integer,City>> entries = hashMap.entrySet();
		Iterator<Entry<Integer, City>> iterator3 = entries.iterator();
		while(iterator3.hasNext()) {
			Entry<Integer,City> next = iterator3.next();
			System.out.println("Key: " + next.getKey() + ", Value: " + next.getValue());
			System.out.println("---------");
		}
		
	}

}
