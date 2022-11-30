package collections.sets.setLabs;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetLab2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cikmak icin -1 giriniz");
		
		LinkedHashSet<Integer> integers = new LinkedHashSet<Integer>();
		int i = 0;
		while((i = scanner.nextInt()) != -1) {
			integers.add(i);
		}
		scanner.close();
		System.out.println("Sayi adedi: " + integers.size());
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		}
		
	}

}
