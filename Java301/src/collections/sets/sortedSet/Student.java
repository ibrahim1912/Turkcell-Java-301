package collections.sets.sortedSet;

public class Student implements Comparable<Student>{

	private int age;
	private String name;

	public Student() {

	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Age : " + age + " , Name : " + name;
	}

	@Override
	public int compareTo(Student o) {
		//return o.age - this.age;  //buyukten kucuge sıralar
		return this.name.compareTo(o.name); //a dan z ye sıralar
	}
}
