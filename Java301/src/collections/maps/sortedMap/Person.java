package collections.maps.sortedMap;

import java.io.Serializable;

public class Person  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String tc;
	private String name;
	private Gender gender;
	
	public Person() {
		
	}

	public Person(String tc, String name, Gender gender) {
		super();
		this.tc = tc;
		this.name = name;
		this.gender = gender;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return this.tc.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		Person person = (Person)other;
		return this.tc.equals(person.tc);
	}
	
	@Override
	public String toString() {
		return "Tc: " + tc + ", Name:  " + name + ", Gender: " + gender;
	}
}
