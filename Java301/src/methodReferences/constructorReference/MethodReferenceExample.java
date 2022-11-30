package methodReferences.constructorReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceExample {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Hilal",20000));
		personList.add(new Person("Efe",3400));
		personList.add(new Person("Elif",6970));
		
		//anonim sınıflar
		List<String> personNames =  personList.stream().map(new Function<Person, String>() {

			@Override
			public String apply(Person t) {
				return t.getName();
			}
		}).collect(Collectors.toList());
		personNames.forEach(System.out::println);
		
		System.out.println("**************************************");
		   
		List<Integer> personSalaries =  personList.stream()
				.map(Person::getSalary)
				.collect(Collectors.toList());
		personSalaries.forEach(System.out::println);
		
		System.out.println("**************************************");
		
		List<String> names = new ArrayList<>();
		names.add("İbrahim");
		names.add("Sevim");
		names.add("Hüseyin");
		
		//constructor reference Person::new
		List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
		persons.forEach(System.out::println);
	}
	
}
