package com.mz.bitmanipulation.problems;

public class NumberOf1Bits {
	// you need to treat n as an unsigned value

	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i < 32; i++) {
			count += ((n & (1 << i)) == 0) ? 0 : 1;
		}
		return count;
	}

	public int hammingWeight2(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}
}
