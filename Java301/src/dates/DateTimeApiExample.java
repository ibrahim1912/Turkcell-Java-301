package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeApiExample {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Now: " + localDate);
		
		LocalDate of = LocalDate.of(1980, 12, 13);
		System.out.println(of);
		
		System.out.println(LocalDate.parse("2020-12-21"));
		
		System.out.println((localDate) + ": After a day: " + localDate.plus(1,ChronoUnit.DAYS));
		System.out.println(localDate.plusDays(3));
		
		System.out.println((localDate) + ": After a month: " + localDate.plus(1,ChronoUnit.MONTHS));
		
		System.out.println("Name of day: " + localDate.getDayOfWeek());
		System.out.println("Number of month: " + localDate.getDayOfMonth());
		
		System.out.println((localDate) + " is after " + (of) + " : " + localDate.isAfter(of));
		System.out.println((localDate) + " is before " + (of) + " : " + localDate.isBefore(of));
		
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your birth day: ");
		LocalDate inputDate = LocalDate.parse(scanner.nextLine());
		System.out.println("Your age: " + (LocalDate.now().getYear() - inputDate.getYear()));
		scanner.close();
	}
}
