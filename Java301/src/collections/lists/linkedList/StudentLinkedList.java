package collections.lists.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentLinkedList {

	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<Student>();
		students.add(new Student(12,"Efe","Berber"));
		students.add(new Student(1,"Hilal","Kaplan"));
		students.add(new Student(60,"Osman","Cakar"));
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
