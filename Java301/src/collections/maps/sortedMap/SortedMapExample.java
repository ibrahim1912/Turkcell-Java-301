package collections.maps.sortedMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		SortedMap<String,String> sortedMap = new TreeMap<>();
		sortedMap.put("Ev", "Home");
		sortedMap.put("Kalem", "Pencil");
		sortedMap.put("Araba", "Car");
		sortedMap.put("Ev", "Home"); //unique eklemez
		
		System.out.println("Size: " + sortedMap.size());
		
		String value = sortedMap.get("Araba");
		System.out.println(value);
		
		Set<Entry<String,String>> entiries = sortedMap.entrySet();
		Iterator<Entry<String,String>> iterator = entiries.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			System.out.println(next); //key sırasına göre getirir
		} 

	}

}
