package com.mz.bitmanipulation.problems;

public class RangeBitWiseAnd {
	public int rangeBitwiseAnd(int m, int n) {
		int answer = 0;
		for (int i = 30; i >= 0; i--) {
			int mask = 1 << i;
			if ((mask & m) == (mask & n)) {
				answer |= (mask & m);
			} else {
				break;
			}
		}
		return answer;
	}

}
