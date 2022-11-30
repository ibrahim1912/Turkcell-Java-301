package collections.maps.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<String, Double> hashMap = new HashMap<String, Double>();
		hashMap.put("Pc", 20200.0);
		hashMap.put("Mouse", 134.50);
		hashMap.put("Monitor", 1234.66);
		
		System.out.println("Size: " + hashMap.size());
		
		getKeysAndValues(hashMap);
		
		hashMap.remove("Mouse");
		getSpaceAndStar();
		getKeysAndValues(hashMap);
		
		System.out.println("Is empty: " + hashMap.isEmpty());
		
		hashMap.replace("Pc", 30000.0);
		getSpaceAndStar();
		getKeysAndValues(hashMap);
	}
	
	public static void getKeysAndValues(HashMap<String, Double> hashMap ) {
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Double value = hashMap.get(key);
			System.out.println(key + " = " +  value);
			System.out.println("--------------------");
		}
	}
	
	public static void getSpaceAndStar() {
		System.out.println();
		System.out.println("**************************");
		System.out.println();
	}

}
