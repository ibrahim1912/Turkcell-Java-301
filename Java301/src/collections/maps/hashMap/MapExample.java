package collections.maps.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(34, "Istanbul");
		hashMap.put(35, "Izmir");
		hashMap.put(6, "Ankara");
		hashMap.put(35, "Izmir2"); // unique key eklemez
		hashMap.put(95, "Izmir3"); // suan unique key degil ekler

		System.out.println(hashMap.size());
		System.out.println(hashMap.get(35)); // son eklenen key in value sunu yazdırır
		System.out.println(hashMap.get(15)); // null verir

		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			String value = hashMap.get(key);
			System.out.println(key + " : " + value);

		}
	}

}
