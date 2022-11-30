package collections.lists.vector;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(3);
		vector.add("Kitap");
		vector.add("Kalem");
		vector.add("Masa");
		vector.add("Monitor");
		
		for(int i=0; i<vector.size(); i++) {
			String string = vector.get(i);
			System.out.println((i) + " " + string);
		}
		
		System.out.println("Kasitesi: " + vector.capacity());
		
		vector.clear();
		System.out.println("Size: " + vector.size());
		System.out.println("Kasitesi: " + vector.capacity());
	}

}
