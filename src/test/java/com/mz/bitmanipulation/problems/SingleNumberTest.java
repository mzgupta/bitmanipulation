package com.mz.bitmanipulation.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberTest {

	SingleNumber problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new SingleNumber();
	}

	@Test
	public void testSingle1() {
		int[] nums = { 1, 2, 1, 2, 5 };
		Assert.assertEquals(5, problem.singleNumber1(nums));

		nums = new int[] { 1 };
		Assert.assertEquals(1, problem.singleNumber1(nums));
	}

	@Test
	public void testSingle2() {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		int[] z = problem.singleNumber2(nums);
		Assert.assertTrue(hasNumbers(z, 3, 5));

		nums = new int[] { 0, 0, 1, 2 };
		z = problem.singleNumber2(nums);
		Assert.assertTrue(hasNumbers(z, 1, 2));

	}

	@Test
	public void testSingle3() {
		int[] nums = { 1, 1, 1, 2, 2, 2, 5 };
		Assert.assertEquals(5, problem.singleNumber3(nums));

		nums = new int[] { 1 };
		Assert.assertEquals(1, problem.singleNumber3(nums));
	}

	private boolean hasNumbers(int[] z, int i, int j) {
		for (int k = 0; k < z.length; k++) {
			if (z[k] == i || z[k] == j) {

			} else {
				return false;
			}
		}
		return true;
	}

}
