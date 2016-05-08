package com.mz.bitmanipulation.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {
	private MissingNumber problem;

	@Before
	public void setUp() throws Exception {
		problem = new MissingNumber();
	}

	@Test
	public void testCountBits() {
		int x = problem.missingNumber(new int[] {0,1,2,3,4,6});
		Assert.assertEquals(5, x);
		
		x = problem.missingNumber(new int[] {0});
		Assert.assertEquals(1, x);

		x = problem.missingNumber(new int[] {0,1});
		Assert.assertEquals(2, x);
		
	}
}
