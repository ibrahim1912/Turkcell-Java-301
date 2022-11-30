package collections.sets.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(2);
		treeSet.add(0);
		treeSet.add(22);
		treeSet.add(3);
		treeSet.add(3); //eklemez
		System.out.println("Size: " + treeSet.size());
		
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		System.out.println("*************");
		
		TreeSet<City> treeSet2 = new TreeSet<City>();
		treeSet2.add(new City("35","Izmir"));
		treeSet2.add(new City("06","Ankara"));
		treeSet2.add(new City("45","Manisa"));
		treeSet2.add(new City("45","Manisa"));
		
		Iterator<City> iterator2 = treeSet2.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());  //compare metotuyla code a göre küçülten büyüğe oldu
		}
		 
		System.out.println("Size: " + treeSet2.size());
		

	}

}
