package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeApiExample2 {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		System.out.println(LocalTime.parse("11:30"));
		
		System.out.println(LocalTime.of(14,20));
		
		System.out.println(LocalTime.parse("21:30").plus(1,ChronoUnit.HOURS));
		
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		
		System.out.println("***************************");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
				
		System.out.println(localDateTime.plus(1,ChronoUnit.DAYS));
		
		LocalDate localDate = LocalDate.parse("2022-01-02");
		LocalDateTime time1 = LocalDateTime.of(localDate, LocalTime.parse("03:32"));
		LocalDateTime time2 = LocalDateTime.of(localDate, LocalTime.parse("04:32"));
		System.out.println((time1) + " is before "+ (time2) + " : " + time1.isBefore(time2));
		System.out.println((time1) + " is after "+ (time2) + " : " + time1.isAfter(time2));
		
		System.out.println(ChronoUnit.MINUTES.between(time1, time2));
	}
	

}
