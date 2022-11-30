package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("İzmir");
		arrayList.add("Bursa");
		arrayList.add("Ankara");
		arrayList.add("İstanbul");
		arrayList.add("Adana");

		arrayList.stream().filter((s) -> s.startsWith("A")).map((s) -> s.toUpperCase())
				.sorted((s1, s2) -> s1.compareTo(s2)).forEach((s) -> System.out.println(s));

		System.out.println("*********************");

		arrayList.stream().filter((s) -> s.startsWith("İ")).map(String::toLowerCase).sorted()
				.forEach((s) -> System.out.println(s));

		System.out.println("*********************");

		int[] numbers = { 2, 4, 1, 8, 5, 34, 21 };
		Arrays.stream(numbers)
			.filter((x) -> x > 5)
			.map((x) -> x * 2)
			.sorted()
			.forEach(System.out::println);

		System.out.println("*********************");
		
		Stream.of("e","c","b","a").findFirst().ifPresent(System.out::println);
	}

}
