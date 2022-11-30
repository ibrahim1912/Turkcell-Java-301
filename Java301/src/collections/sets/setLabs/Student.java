package collections.sets.setLabs;

public class Student implements Comparable<Student> {

	private int number;
	private String firstName;
	private String lastName;
	private String classroom;
	
	public Student() {
		
	}

	public Student(int number, String firstName, String lastName, String classroom) {
		super();
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.classroom = classroom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	
	@Override
	public String toString() {
		return "Number: " + number + ", First Name: " + firstName + ",Last Name: " + lastName + ",Classroom: " + classroom;
	}
	
	@Override
	public int hashCode() {
		return this.number;
	}
	
	@Override
	public boolean equals(Object other) {
		Student student = (Student)other;
		return this.number == student.number;
		
	}

	@Override
	public int compareTo(Student o) {
		
		return this.number - o.number;
	}
	
}
