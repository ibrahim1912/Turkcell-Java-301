package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateAndTimeCalculateExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Date: ");
		LocalDate date = LocalDate.parse(scanner.nextLine());
		System.out.print("Time: ");
		LocalTime time = LocalTime.parse(scanner.nextLine());
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println("Date and Time : " + dateTime);

		System.out.println("(0 Add) (1 Remove) ");
		int operation = Integer.parseInt(scanner.nextLine());
		if (operation == 0 || operation == 1) {
			ChronoUnit[] chronoUnits = ChronoUnit.values();
			System.out.println("Unit: ");
			for (int i = 0; i < chronoUnits.length; i++) {
				System.out.print(chronoUnits[i] + "(" + (i) + ") ");
			}
			ChronoUnit unit = chronoUnits[Integer.parseInt(scanner.nextLine())];
			
			System.out.println("Value: ");
			int value = Integer.parseInt(scanner.nextLine());
			if(operation == 0) {
				System.out.println(dateTime.plus(value,unit));
			}else {
				System.out.println(dateTime.minus(value,unit));
			}
			
		} else {
			System.out.println("Please enter 0 or 1");
		}
		
		scanner.close();

	}

}
