package javaDateAndTime;

import java.time.LocalDate;

public class Example3 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		System.out.println("================================");
		
		LocalDate yesterdaysDate = date.minusDays(4);
		
		System.out.println(yesterdaysDate);
		
		System.out.println("================================");
		
		LocalDate futureDate = date.plusDays(5);
		
		System.out.println(futureDate);
		
		
	}
	
}
