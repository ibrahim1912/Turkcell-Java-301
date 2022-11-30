package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample3 {

	public static void main(String[] args) {
		
		IntStream.range(1, 10).forEach(System.out::println);
		
		Arrays.stream(new int[] {2,4,1,6,3})
			.map((x) -> x*2)
			.average()
			.ifPresent(x-> System.out.println("Average: " + x));

		int sum = IntStream.range(1, 101).sum();
		System.out.println("Sum: " + sum);
		
		Stream.of(2.2,3.3,4.5,1.22)
			.mapToInt(Double::intValue)  //(Integer::parseInt -- String convert integer)
			.max()
			.ifPresent(x -> System.out.println("Max: " + x));
		
		IntStream.range(1, 10).mapToObj(i -> i + "a").forEach(System.out::println);
		
		Stream.of("Ali","Cem","Hilal","Burak").filter(x->x.contains("a")).forEach(System.out::println);
		
	}

}
