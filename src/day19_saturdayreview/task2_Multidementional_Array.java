package day19_saturdayreview;

import java.util.Arrays;
import java.util.Scanner;

public class task2_Multidementional_Array {

	public static void main(String[] args) {
	//Create a 4 x 4 int 2D array using scanner class
	//loop through the array such that if it's odd increament 3, 
	//if even do nothing
		
		
		Scanner in = new Scanner(System.in);
		int[][] theArray = new int[4][4];
		
		/*
		1 2 3
		4 5 6 3
		7 8 9 0
		*/
		
		
		for(int i = 0; i < theArray.length; i++) {
			for(int j = 0; j < theArray[i].length; j++) {
				theArray[i][j] = in.nextInt();
				
				
			}
		}
		
		
		for (int i=0;i<theArray.length;i++) {
			for(int j = 0; j<theArray[i].length; j++) {
				if (theArray[i][j] %2 ==1) {
					theArray[i][j]+=3;
				
				}
			}			
		}
		
		
		
		
		
		for(int[] anArray: theArray) {
			System.out.println(Arrays.toString(anArray));
		}}

}
