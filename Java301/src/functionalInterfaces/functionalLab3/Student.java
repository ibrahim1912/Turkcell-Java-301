package functionalInterfaces.functionalLab3;

public class Student {

	private int number;
	private String name;
	private int gradeAverage;
	
	
	public Student() {
		
	}


	public Student(int number, String name, int gradeAverage) {
		super();
		this.number = number;
		this.name = name;
		this.gradeAverage = gradeAverage;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGradeAverage() {
		return gradeAverage;
	}


	public void setGradeAverage(int gradeAverage) {
		this.gradeAverage = gradeAverage;
	}
	
	@Override
	public String toString() {
		return "Number: " + number + ", Name: " + name + ", Grade Average: " + gradeAverage;
	}
}
