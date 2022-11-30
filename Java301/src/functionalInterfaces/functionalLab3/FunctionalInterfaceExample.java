package functionalInterfaces.functionalLab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(12,"Hilal",100));
		students.add(new Student(45,"Elif",88));
		students.add(new Student(16,"Efe",94));
		
		students.forEach((s) -> System.out.println(s));
		
		System.out.println("**************************");
		
		//anonymous class
		Collections.sort(students,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getGradeAverage()-o1.getGradeAverage();
			}
		});
		
		students.forEach((s) -> System.out.println(s));
		
		System.out.println("**************************");
		
		//with lambda
		Collections.sort(students,(a,b) -> b.getGradeAverage() - a.getGradeAverage());
		students.forEach((s) -> System.out.println(s));
		
		System.out.println("**************************");
		Collections.sort(students,(a,b) -> a.getName().compareTo(b.getName()));
		students.forEach((s) -> System.out.println(s));
	}

}
