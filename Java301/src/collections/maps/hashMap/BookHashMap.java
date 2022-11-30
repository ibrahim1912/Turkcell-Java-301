package collections.maps.hashMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BookHashMap {

	public static void main(String[] args) {
		HashMap<Integer,Book> hashMap = new HashMap<Integer,Book>();
		hashMap.put(4, new Book("X",new Date(),"Osman Yilmaz"));
		hashMap.put(6, new Book("Y",new Date(),"Kamil Cörekci"));	
		hashMap.put(1, new Book("Z",new Date(),"Aslı Ceylan"));
		hashMap.put(0, new Book("A",new Date(),"Onur Beyhan"));
		
		System.out.println("Size: " + hashMap.size());
		
		getKeysAndValues(hashMap); //Sıralı getirdi garantisi yok
	}
	
	public static void getKeysAndValues(HashMap<Integer,Book> hashMap) {
		Set<Entry<Integer,Book>> entiries = hashMap.entrySet();
		Iterator<Entry<Integer,Book>> iterator = entiries.iterator();
		while(iterator.hasNext()) {
			Entry<Integer,Book> next = iterator.next();
			System.out.println(next);
			System.out.println("-----------------");
		}
	}

}
