package com.mz.bitmanipulation.problems;

public class SingleNumber {
	public int singleNumber1(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans ^= nums[i];
		}
		return ans;
	}

	public int[] singleNumber2(int[] nums) {
		int[] ans = new int[2];
		int xor = 0;

		for (int i = 0; i < nums.length; i++) {
			xor ^= nums[i];
		}
		xor = xor & ~(xor - 1);

		for (int i = 0; i < nums.length; i++) {
			if ((xor & nums[i]) == 0) {
				ans[0] = ans[0] ^ nums[i];
			} else {
				ans[1] = ans[1] ^ nums[i];

			}
		}

		return ans;
	}

	public int singleNumber3(int[] nums) {
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				count = count + ((nums[j] >>> i) & 1);
			}
			if (count > 0 && (count % 3) != 0) {
				ans |= (1 << i);
			}
		}
		return ans;
	}
}
