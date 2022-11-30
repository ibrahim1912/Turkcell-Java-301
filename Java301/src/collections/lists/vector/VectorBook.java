package collections.lists.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorBook {

	public static void main(String[] args) {
		Vector<Book> vector = new Vector<Book>();
		vector.add(new Book("Suc ve Ceza",new Writer("Dostoyevski")));
		vector.add(new Book("Cehennem",new Writer("Dan Brown")));
		vector.add(new Book("Hobbit",new Writer("Tolkien")));
		
		System.out.println("Size: " + vector.size());
		System.out.println("Capacity: " + vector.capacity());
		
		Iterator<Book> iterator =  vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
