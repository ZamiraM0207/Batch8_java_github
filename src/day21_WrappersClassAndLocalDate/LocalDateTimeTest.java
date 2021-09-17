package day21_WrappersClassAndLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LocalDate today = LocalDate.now();
		
		LocalDateTime now = today.atTime(9, 24);
		
		System.out.println(now);
		
		LocalDateTime now1 = LocalDateTime.now();
		
		System.out.println(now1);
		
		
		
		 DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
		 DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

		
		 System.out.println(now1.format(df));
		 System.out.println(now1.format(tf));
		 System.out.println(now1.format(dtf));
		 
		 // Find out which day were you born? (name of the day)
		 LocalDate bday = LocalDate.of(1999, 9, 8);
		 
		 DateTimeFormatter formater = DateTimeFormatter.ofPattern("MM/dd/yyyy, EEEE");
		 
		 System.out.println(bday.format(formater));
		 
		 
		 
		 System.out.println(today);
		 
		 
//		 System.out.println();
		 
		 int month1 = today.getMonthValue();//9
		 int month2 = bday.getMonthValue();
		 
		 int day1 = today.getDayOfMonth();
		 int day2 = bday.getDayOfMonth();
		 
		 System.out.println(day1);
		 System.out.println(day2);
		 
		 if (month1 == month2 && day1 == day2 ) {
			 System.out.println("Happy b day");
		 }

		
	}
}
