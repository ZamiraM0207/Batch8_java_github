package day20_Arraylist;

public class HomeworkReview {

	public static void main(String[] args) {
		//Input:
		//	int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
			/*
			            task1:
			                9 10 11 12 13
			                4 5 6 7 8
			                1 2 3
			            task2:
			            	3 2 1
			            	8 7 6 5 4
			            	13 12 11 10 9
			        	task3:
			        		13 12 11 10 9
			        		8 7 6 5 4
			        		3 2 1
			 */	

////                    0            1                 2
//int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
////                   0 1 2      0 1 2 3 4      0  1  2  3  4




//System.out.print(arr2D[2][0]+ " ");
//System.out.print(arr2D[2][1]);
//System.out.println();
//
//System.out.print(arr2D[1][0]+ " ");
//System.out.print(arr2D[1][1]);
//System.out.println();
//
//System.out.print(arr2D[0][0]+ " ");
//System.out.print(arr2D[0][1]+ " ");
//System.out.println(arr2D[0][2]);
//

//               0 1  2  3  4
//int nums[]  = {9,10,11,12,13};

//for(int i = 4 ; i >=0 ; i --) {
////	System.out.println(i);
//	System.out.println(nums[i]);
//}


//for(int i = nums.length-1 ; i >=0 ; i --) {
////	System.out.println(i);
//	System.out.println(nums[i]);
//}	


//task1:
//9 10 11 12 13
//4 5 6 7 8
//1 2 3

//                 0            1                 2
int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
//                 0 1 2      0 1 2 3 4      0  1  2  3  4

for(int i = arr2D.length-1 ; i >=0 ; i --) {
//	System.out.println(i);
//	System.out.println(Arrays.toString(arr2D[i]));
	
	for(int j = 0; j < arr2D[i].length; j++ ) {
		
		System.out.print(arr2D[i][j]+" ");
		
	}
	System.out.println();
	
}


//                    0            1                 2
//int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
//                   0 1 2      0 1 2 3 4      0  1  2  3  4
//task2:
//	3 2 1
//	8 7 6 5 4
//	13 12 11 10 9

//[1, 2, 3]
//[4, 5, 6, 7, 8]
//[9, 10, 11, 12, 13]

for(int i = 0; i < arr2D.length; i++ ) {
//	System.out.println(Arrays.toString(arr2D[i]));
	for(int j = arr2D[i].length-1 ; j >=0 ; j --) {
		
//		System.out.print(j+" ");
		
		System.out.print(arr2D[i][j]+" ");
		
	}
	System.out.println();
}



//task3:
//	13 12 11 10 9
//	8 7 6 5 4
//	3 2 1
//            0            1                 2
//int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
//           0 1 2      0 1 2 3 4      0  1  2  3  4		


for(int i = arr2D.length-1 ; i >= 0 ; i--) {
	for(int j = arr2D[i].length-1; j>=0 ; j--) {
		System.out.print(arr2D[i][j]+" ");
	}
	System.out.println();
}



}

}

