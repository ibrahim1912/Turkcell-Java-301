package collections.sets.setLabs;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetLab1 {

	public static void main(String[] args) {
		// sayısal loto uygulaması
		// 1 ile 49 arasında 6 tane rakam üretsin
		Scanner scanner = new Scanner(System.in);
		System.out.print("Satir icin sayi giriniz: ");
		int input = scanner.nextInt();
		scanner.close();
		
		SortedSet<Integer> integers = new TreeSet<Integer>();
		for (int i = 0; i < input; i++) {
			doldur(integers);

			Iterator<Integer> iterator = integers.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + "\t");
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		System.out.print("Kazanan numara : ");
		SortedSet<Integer> integers2 = kazananNumara();
		Iterator<Integer> iterator2 = integers2.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
	
		System.out.println();
		System.out.println("*******************");
		boolean result = kimKazandı(integers, integers2);
		System.out.println(result);
		
	}

	public static void doldur(SortedSet<Integer> integers) {
		integers.clear();
		Random random = new Random();
		while (integers.size() < 6) {
			int sayi = random.nextInt(10) + 1;
			integers.add(sayi);
		}

	}
	
	public static SortedSet<Integer>  kazananNumara() {
		SortedSet<Integer> integers = new TreeSet<Integer>();
		doldur(integers);
		return integers;
	}
	
	public static boolean kimKazandı(SortedSet<Integer> integers,SortedSet<Integer> integers2) {
		boolean result = false;
		int counter = 0;
		if(integers.equals(integers2)) {
			result = true;
			return result;
		}
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			Iterator<Integer> iterator2 = integers2.iterator();
			while (iterator2.hasNext()) {
				Integer next2 = iterator2.next();
				
				if(next.hashCode() == next2.hashCode()) {
					counter++;
				}
			}
		}
		if(counter == 3) {
			System.out.println("You win 3 ");
			return true;
		}
		if(counter == 4) {
			System.out.println("You win  4");
			return true;
		}
		if(counter == 5) {
			System.out.println("You win 5 ");
			return true;
		}
		
		
		return result;

	}

}
