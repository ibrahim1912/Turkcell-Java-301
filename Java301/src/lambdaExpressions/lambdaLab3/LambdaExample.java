package lambdaExpressions.lambdaLab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person("Hilal",LocalDate.parse("1996-12-12"),Person.Gender.WOMAN,"hilal.kaplan");
		Person person2 = new Person("Elif",LocalDate.parse("1988-05-06"),Person.Gender.WOMAN,"elif.berk");
		Person person3 = new Person("Ismail",LocalDate.parse("1989-09-09"),Person.Gender.MAN,"ismail.cansever");
		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(person);
		personList.add(person2);
		personList.add(person3);
		
		filterAsGender(personList, Person.Gender.WOMAN);
		System.out.println("*************************");
		filterAsAge(personList, 27);
		System.out.println("*************************");
		
		System.out.println("---------Lambda Expression----------------");
		
		filterAsPerson(personList,new PersonFilter() {
			
			@Override
			public boolean filter(Person person) {
				return person.getAge() > 27 && person.getGender().equals(Person.Gender.WOMAN);
			}
		});
		
		System.out.println("*************************");
		filterAsPerson(personList, (p) -> p.getAge()>=27 && p.getGender().equals(Person.Gender.WOMAN));
	}

	public static void filterAsGender(List<Person> persons,Person.Gender gender) {
		for (Person person : persons) {
			if(person.getGender().equals(gender)) {
				System.out.println(person);
			}
		}
	}
	
	public static void filterAsAge(List<Person> persons,int age) {
		for (Person person : persons) {
			if(person.getAge() >= age) {
				System.out.println(person);
			}
		}
	}
	
	public static void filterAsPerson(List<Person> persons,PersonFilter personFilter) {
		for (Person person : persons) {
			if(personFilter.filter(person)) {
				System.out.println(person);
			}
		}
	}
}
