package methodReferences.staticMethodReference;

import java.util.ArrayList;

public class MethodReferenceExample {

	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(2);
		integers.add(232);
		integers.add(8);
		
		//lambda expression
		integers.forEach((i) -> System.out.println(i));
		
		System.out.println("************************");
		
		//method reference
		integers.forEach(System.out::println);

	}

}
