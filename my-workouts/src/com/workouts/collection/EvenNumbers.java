package com.workouts.collection;

import java.util.Iterator;

public class EvenNumbers {

    /*
     * Given an array nums of integers, return how many of them contain an even number of digits.
     * Input: nums = [12,345,2,6,7896]
		Output: 2
		Explanation: 
		12 contains 2 digits (even number of digits). 
		345 contains 3 digits (odd number of digits). 
		2 contains 1 digit (odd number of digits). 
		6 contains 1 digit (odd number of digits). 
		7896 contains 4 digits (even number of digits). 
		Therefore only 12 and 7896 contain an even number of digits.

     */

	public static void main(String[] args) {
		int[] num = { 555,901,482,1771};
		int count = 0;
		for (int i : num) {
			String s=String.valueOf(i);
			if(s.length() % 2 == 0){
				count++;
			} 
			
		}
		
		System.out.println(count);

	}
}
