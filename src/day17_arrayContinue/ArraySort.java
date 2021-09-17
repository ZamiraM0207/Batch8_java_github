package day17_arrayContinue;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int nums[]= new int [] {5,3,1,6};
		
		System.out.println(nums[3]);
		System.out.println(nums[0]);
		System.out.println(nums.length);
		
		
		//System.out.println(Arrays.toString(nums));(print them in one line )
		//Array.sort(names); (sort them in small to big or in alphabetical order)
int nums[] = new int[] {5,3,1,2,4,9};
		
		System.out.println(nums[2]);
		
		System.out.println(nums[4]);
		
		System.out.println(nums.length);//5
		
		System.out.println(nums.length-1);
		
		System.out.println(nums[nums.length-1]);
		
//		for (int i = 0; i < 6; i++) {
//			System.out.println(nums[i]);
//		}
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		
		
		System.out.println(Arrays.toString(nums));
		
		
		
		String names[] = {"C","D","A","B"};
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
	}
}
