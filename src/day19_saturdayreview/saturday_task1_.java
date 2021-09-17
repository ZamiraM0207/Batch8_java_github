package day19_saturdayreview;

import java.util.Arrays;

public class saturday_task1_ {

	public static void main(String[] args) {
		
		
		
		
		int[] myArray= {1, 2, 4, 13, 5, 8, 41, 20};
		
//solution 1
		for(int i:myArray) {
			if (i%2==1) {
				i=i+3;
			
				System.out.print(i+",");
			}else {
				System.out.print(i+",");
				}
			
			
			
/*solution 2 
 * or (int i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 == 1) {
				myArray[i] += 3;
			}
		}
		System.out.println(Arrays.toString(myArray));

 */
				
				}
		
	
		}
	
	
	
	}


