package collections.lists.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String line = null;
		while (!(line = scanner.nextLine()).equals("exit")) {
			arrayList.add(line);
		}
		scanner.close();

		System.out.println("************************");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("************************");
		for (String item : arrayList) {
			System.out.println(item);
		}

		System.out.println("************************");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

	}

}
