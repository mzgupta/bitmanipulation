package com.mz.bitmanipulation.problems;

public class CountingBits {
	public int[] countBits(int num) {
		int[] counts = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			counts[i] = countBit(i);
		}
		return counts;
	}

	private int countBit(int i) {
		int sum = 0;
		while (i > 0) {
			if ((i & 1) == 1) {
				sum++;
			}
			i = i >> 1;
		}
		return sum;
	}

	public int[] countBits2(int num) {
		int[] counts = new int[num + 1];
		counts[0] = 0;
		int size = 1;
		for (int i = 1; i <= num; i++) {
			counts[i] = counts[i - size] + 1;
			if ((i & (i + 1)) == 0) {
				size = size << 1;
			}
		}
		return counts;
	}

}
