package com.mz.bitmanipulation.problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PowerOfTwoTest {

	private PowerOfTwo problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new PowerOfTwo();
	}

	@Test
	public void testIsPowerOfFour() {
		assertFalse(problem.isPowerOfTwo(0));
		assertFalse(problem.isPowerOfTwo(5));
		assertFalse(problem.isPowerOfTwo(Integer.MIN_VALUE));

		assertTrue(problem.isPowerOfTwo(2));
		assertTrue(problem.isPowerOfTwo(8));
		assertTrue(problem.isPowerOfTwo(1));
		assertTrue(problem.isPowerOfTwo(4));
		assertTrue(problem.isPowerOfTwo(16));
		assertTrue(problem.isPowerOfTwo(64));
		

	}

}
