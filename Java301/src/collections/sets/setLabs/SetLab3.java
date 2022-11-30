package collections.sets.setLabs;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetLab3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SortedSet<Student> sortedSet = new TreeSet<>();
		System.out.println("Ogrenci eklemek icin (E), uygulamadan cikmak icin (X) basiniz");
		
		while((scanner.nextLine()).equals("E")) {
			System.out.print("Numara: ");
			int number = Integer.parseInt(scanner.nextLine());
			System.out.print("Isim: ");
			String firstName = scanner.nextLine();
			System.out.print("Soyad: ");
			String lastName = scanner.nextLine();
			System.out.print("Sinif: ");
			String classroom = scanner.nextLine();
			sortedSet.add(new Student(number,firstName,lastName,classroom));
			
		}
		
		scanner.close();
		
		System.out.println("Toplam ogrenci sayisi: " + sortedSet.size());
		Iterator<Student> iterator = sortedSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
