package day10;

import java.util.Scanner;

public class timer {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("Time");
	Scanner scan =new Scanner(System.in);
	
	for (int i=scan.nextInt(); i>0; i--){
		System.out.println("minute "+ i);//15 to 0
		for(int j=59; j>=0;j--) {
			
			System.out.println("second"+j); //60 to 0 
			
			Thread.sleep(1000);
		}

}
	scan.close();
}
}

