package collections.lists.linkedList;

public class Student {

	private int number;
	private String firstName;
	private String lastName;
	
	public Student() {
		
	}

	public Student(int number, String firstName, String lastName) {
		super();
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	@Override
	public String toString() {
		return "Number: " + number + ", Ad: " + firstName + ", Soyad: " + lastName;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object other) {
		Student student = (Student)other;
		return this.number == student.number;
	}
}
