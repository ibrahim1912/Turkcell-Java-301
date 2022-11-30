package collections.iterator;

import java.util.Iterator;

public class Student implements Iterable<Integer>{

	private String name;
	private int[] notes;
	
	private int index = 0;
	
	public Student() {
		
	}

	public Student(String name, int[] notes) {
		super();
		this.name = name;
		this.notes = notes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getNotes() {
		return notes;
	}

	public void setNotes(int[] notes) {
		this.notes = notes;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return index<notes.length;
			}

			@Override
			public Integer next() {
				return notes[index++];
			}
		};
	}
}
