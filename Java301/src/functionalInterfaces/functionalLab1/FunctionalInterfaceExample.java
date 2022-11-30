package functionalInterfaces.functionalLab1;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
	
		Math math = (a,b) -> System.out.println(a + b);
		
		math.calculate(12.5,2.2);
		
		System.out.println("**********************");
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Izmir");
		cities.add("Van");
		cities.add("Ankara");
		
		
		//consumer
		System.out.println("Consumer without lambda");
		cities.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		System.out.println("**********************");
		System.out.println("Consumer with lambda");
		cities.forEach((c) -> System.out.println(c));
		
		System.out.println("**********************");
		
		
		//predicate
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				
				return t.toLowerCase().startsWith("a");
			}
		};
		
		System.out.println("Predicate without lambda");
		for (String city : cities) {
			if(predicate.test(city)) {
				System.out.println(city);
			}
		}
		
		System.out.println("**********************");
		System.out.println("Predicate with lambda");
		
		Predicate<String> predicate2 = (c) -> c.toLowerCase().startsWith("a");
		for (String city : cities) {
			if(predicate2.test(city)) {
				System.out.println(city);
			}
		}
		

	}

}
