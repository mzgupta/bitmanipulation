package com.mz.bitmanipulation.problems;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int x = 0;
		for (int i = 1; i <= nums.length; i++) {
			x = x ^ (i ^ nums[i - 1]);
		}
		return x;
	}

}
