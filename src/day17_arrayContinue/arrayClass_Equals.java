package day17_arrayContinue;

import java.util.Arrays;

public class arrayClass_Equals {

	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 };
		int intArr1[] = { 10, 15, 22, 20, 35};
		 System.out.println(Arrays.equals(intArr, intArr1));
		 Arrays.sort(intArr1);
		 Arrays.sort(intArr);
		 System.out.println(Arrays.equals(intArr, intArr1));

                 

	}

}
