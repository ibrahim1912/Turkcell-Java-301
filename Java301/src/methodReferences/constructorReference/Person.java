package methodReferences.constructorReference;

public class Person {

	private String name;
	private int salary;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Salary: " + salary;
	}
}
