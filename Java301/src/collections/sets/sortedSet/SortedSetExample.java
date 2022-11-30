package collections.sets.sortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(23);
		sortedSet.add(12);
		sortedSet.add(0);
		
		Iterator<Integer> iteretor = sortedSet.iterator();
		while(iteretor.hasNext()) {
			Integer next = iteretor.next();
			System.out.println(next);
		}
		
		System.out.println("***************************");
		
		SortedSet<Student> studentSortedSet = new TreeSet<>();
		studentSortedSet.add(new Student(25,"Ibrahim"));
		studentSortedSet.add(new Student(4,"Elif"));
		studentSortedSet.add(new Student(59,"Sevgi"));
		studentSortedSet.add(new Student(60,"Sevgi")); 
		//name göre sıralandığı zaman unique değil eklenmez
		
		System.out.println(studentSortedSet.size());
		
		Iterator<Student> iteretor2 = studentSortedSet.iterator();
		while(iteretor2.hasNext()) {
			Student next = iteretor2.next();
			System.out.println(next);
		}
		
	}
}
