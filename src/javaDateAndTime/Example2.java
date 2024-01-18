package javaDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example2 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		System.out.println("================================");
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);
		
		System.out.println("================================");
		
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		
		
	}
	
}
