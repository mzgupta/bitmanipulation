package com.mz.bitmanipulation.problems;

public class MaximumProductOfWordLengths {
	public int maxProduct(String[] words) {
		int max = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				max = Math.max(max, productLength(words[i], words[j]));
			}
		}
		return max;
	}

	private int productLength(String w1, String w2) {
		if ((bitMap(w1) & bitMap(w2)) == 0) {
			return w1.length() * w2.length();
		}
		return 0;
	}

	private int bitMap(String w1) {
		int bits = 0;
		for (int i = 0; i < w1.length(); i++) {
			int x = (int) (w1.charAt(i) - 'a');
			bits = bits | (1 << x);
		}
		return bits;
	}

}
