package collections.iterator;

import java.util.Iterator;

public class StudentIterator {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Hilal Kaplan");
		int[] notes = new int[5];
		notes[0] = 90;
		notes[1] = 70;
		notes[2] = 80;
		notes[3] = 95;
		notes[4] = 100;
		student.setNotes(notes);
		
		Iterator<Integer> iterator = student.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	
	}

}
