package day4reviewsession;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		
		//find which day you were born 
		//find out if today is your birthday and if it is print happy birthday 
		
		LocalDate now=LocalDate.now();
		System.out.println(now);
		
		LocalDate mybirthday =LocalDate.of(1991,9,8);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
		
		System.out.println(mybirthday.format(df));
		
		int month1 =now.getMonthValue();
		int monthbirthday =mybirthday.getMonthValue();

		int day1 =now.getDayOfMonth();
		int daybirthday =mybirthday.getDayOfMonth();

		if (month1==monthbirthday && day1==daybirthday ) {
			System.out.println("happy birthday !!! ");
		
		}
	}

}
