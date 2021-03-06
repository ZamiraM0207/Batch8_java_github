package day21_WrappersClassAndLocalDate;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate tomorrow = date.plusDays(1);
		
		System.out.println(tomorrow);
		
		LocalDate yesterday = date.minusDays(1);
		
		System.out.println(yesterday);
		
		LocalDate lastYearToday = date.minusYears(1);
		System.out.println(lastYearToday);
		
		System.out.println(date.isLeapYear());
		System.out.println(lastYearToday.isLeapYear());
		
		int year = date.getYear();
		
		System.out.println(year);
		
		
		LocalDate today = LocalDate.now();
		
		LocalDate expectedDate = today.plusDays(2);
		
		System.out.println(expectedDate);
		
		// LocalDate.of
		
		LocalDate orderedDate = LocalDate.of(2021, 7, 15);
		
		LocalDate policyDate = orderedDate.plusDays(30);
		
		LocalDate returnDate = LocalDate.now();
		
		
		if (returnDate.isBefore(policyDate)) {
			System.out.println("You can return your item");
		}else {
			System.out.println("You can not return your item");
		}
		
		System.out.println(returnDate);
		System.out.println(policyDate);
		
		System.out.println(returnDate.isAfter(policyDate));
	
		
	}

}
