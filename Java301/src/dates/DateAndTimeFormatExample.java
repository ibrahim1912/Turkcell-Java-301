package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTimeFormatExample {

	public static void main(String[] args) {
		LocalDate date =  LocalDate.now();
		String small = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date);
		String medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(date);
		String big = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(date);
		String full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(date);
		
		System.out.println("Small: " + small);
		System.out.println("Medium: " + medium);
		System.out.println("Big: " + big);
		System.out.println("Full: " + full);
		
		String formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(date);
		System.out.println(formatDate);
		
		LocalTime time = LocalTime.now();
		String smallTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(time);
		String mediumTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(time);
		
		System.out.println("Small Time: " + smallTime);
		System.out.println("Medium Time: " + mediumTime);
		
		String formatTime = DateTimeFormatter.ofPattern("mm.HH.ss").format(time);
		System.out.println(formatTime);
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("mm.HH.ss");
		System.out.println(ofPattern.format(time));
		
		
	}

}
