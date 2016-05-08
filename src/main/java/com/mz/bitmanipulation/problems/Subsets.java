package com.mz.bitmanipulation.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> answer = new ArrayList<List<Integer>>();
		int total = 1 << nums.length;
		for (int i = 0; i < total; i++) {
			List<Integer> set = new ArrayList<Integer>();
			for (int j = 0; j < nums.length; j++) {
				if ((1 & (i >>> j)) == 1) {
					set.add(nums[j]);
				}
			}
			answer.add(set);
		}
		return answer;
	}
}
