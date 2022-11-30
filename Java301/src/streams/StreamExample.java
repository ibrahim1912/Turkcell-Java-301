package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Izmir");
		arrayList.add("Bursa");
		arrayList.add("Ankara");
		arrayList.add("Istanbul");
		arrayList.add("Adana");
		

		Stream<String> stream = arrayList.stream();

		Stream<String> streamFiltered = stream.filter(new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.startsWith("A");
			}
		});
		
		Stream<String> streamMapped = streamFiltered.map(new Function<String,String>(){

			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
			
		});
		
		Stream<String> streamSorted = streamMapped.sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		streamSorted.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t); 
				
			}
		});
	}

}
