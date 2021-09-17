package day5ControlFlow;

import java.util.Scanner;

public class classroomtask {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please type a time ?");
		
		int Time=scan.nextInt();
		if(Time>=5 && Time<12) {
			System.out.println("Good Morning!");
		}
		if(Time>=12 && Time<17) {
			System.out.println("Good afternoon!");
		if (Time>=17 &&Time<24) {
			System.out.println("Good evening!");
			
		}


			
		}
	}

}