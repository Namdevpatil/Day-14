package javaDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Example5 {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();

		System.out.println(time);

		System.out.println("================================");

		//ZoneId zoneId = ZoneId.systemDefault();
		
		ZoneId zoneId = ZoneId.of("America/Los_Angeles");

		LocalTime timeWithZone = LocalTime.now(zoneId);

		System.out.println(timeWithZone);

		//System.out.println("================================");

	}

}
