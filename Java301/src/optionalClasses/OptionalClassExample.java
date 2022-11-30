package optionalClasses;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		Optional<String> emptyObject = Optional.empty();
		System.out.println(emptyObject.isPresent());
		
		System.out.println("--------------------");
		String value = "Hello";
		Optional<String> optional = Optional.of(value);
		System.out.println(optional.isPresent());
		
		System.out.println("--------------------");
		String s = null;
		Optional<String> optional2 = Optional.ofNullable(s);
		System.out.println(optional2.isPresent());
		
		
		System.out.println("--------------------");
		//null check
		String s2 = "Selam";
		if(s2 != null) {
			System.out.println(s2.length());
		}
		
		Optional<String> optional3 = Optional.ofNullable(s2);
		optional3.ifPresent(x -> System.out.println(x.length()));
		
		System.out.println("--------------------");
		String emptyName = null;
		String name = Optional.ofNullable(emptyName).orElse("Osman");
		System.out.println(name);
		
		System.out.println("--------------------");
		String city=null;
		String city2 = Optional.ofNullable(city).orElseGet(()->"İzmir");
		System.out.println(city2);
		
		System.out.println("--------------------");
		String str = "q";
		String string1 = Optional.ofNullable(str).orElse(test());
		String string2 = Optional.ofNullable(str).orElseGet(()->test());
		System.out.println("OrElse: " + string1);
		System.out.println("OrElseGet: " + string2);
		
		
	}

	public static String test() {
		System.out.println("Test runned");
		return "test";
	}
}
