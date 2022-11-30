package lambdaExpressions.lambdaLab3;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Gender{
		MAN,WOMAN
	}
	private String name;
	private LocalDate birthDate;
	private Gender gender;
	private String email;
	
	public Person() {
		
	}

	public Person(String name, LocalDate birthDate, Gender gender,String email) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return LocalDate.now().getYear() - birthDate.getYear();
	}
	
	@Override
	public int hashCode() {
		return this.email.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		Person person = (Person)other;
		return this.email.equals(person.email);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Birth Date: " + birthDate + ", Gender: " + gender + ", Email: " + email + ", Age: " + getAge();
	}
}
