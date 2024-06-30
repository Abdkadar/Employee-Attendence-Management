package com.workouts.collection;

import java.util.Arrays;
import java.util.Comparator;

public class SquareRoot {

	/*
	 * Given an integer array nums sorted in non-decreasing order, return an array
	 * of the squares of each number sorted in non-decreasing order. Input: nums =
	 * [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After squaring, the array
	 * becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
	 */
	public static void main(String[] args) {
		int[] num = { -4, -1, 0, 3, 10 };

		for (int i : num) {
			i = i * i;
			if (i < 0) {
				i = -i;
			}
			System.out.println(i+"");
		}
		Arrays.sort(num);
		for (int j : num) {
			System.out.println(j+"");
		}
	}
}
