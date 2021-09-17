package day17_arrayContinue;

public class multiDimensionalArray {

	public static void main(String[] args) {
		
//        0 1 2 3 4
int nums[] = {1,2,3,4,5};

//         0 1 2 3
int nums2[] = {6,7,8,9};

//         0   1  2  3 4
int nums3[] = {10,11,12,13,14};

//             0     1     2
int numbers[][] = {nums,nums2,nums3};

//System.out.println(numbers.length);

//System.out.println(numbers[0][2]); // 3
//
//System.out.println(numbers[2][2]);
//
//System.out.println(numbers[1][3]);
//

for (int i = 0 ; i < numbers.length; i++) {

//System.out.println(Arrays.toString(numbers[i]));

for(int j = 0 ; j < numbers[i].length ; j++) {
	
	if (numbers[i][j] % 2 == 0) {
		System.out.println(numbers[i][j]);
	}

}


}

}

}

