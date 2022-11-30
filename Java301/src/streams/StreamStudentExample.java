package streams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamStudentExample {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(8, "Hilal", 20));
		arrayList.add(new Student(6, "Efe", 40));
		arrayList.add(new Student(9, "Elif", 5));
		arrayList.add(new Student(12, "Osman", 40));

		arrayList.stream()
		.filter((s) -> s.getAge() > 10)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("------------------------------------");
		arrayList.forEach(System.out::println);
		
		System.out.println("------------------------------------");
		Map<Integer, List<Student>> group = arrayList
				.stream()
				.collect(Collectors.groupingBy(s ->s.getAge()));

		Set<Integer> keySet = group.keySet();
		Iterator<Integer> iterator =  keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("Age: " + key + " " + group.get(key));
		}
		
		System.out.println("------------------------------------");
		double averageAge = arrayList.stream().collect(Collectors.averagingInt(o->o.getAge()));
		System.out.println("Average : " + averageAge);
		
		System.out.println("------------------------------------");
		IntSummaryStatistics statistics = arrayList.stream()
				.collect(Collectors.summarizingInt(o->o.getAge()));
		System.out.println(statistics);
	}

}
