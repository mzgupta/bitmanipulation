package com.mz.bitmanipulation.problems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PowerOfFourTest {

	private PowerOfFour problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new PowerOfFour();
	}

	@Test
	public void testIsPowerOfFour() {
		assertFalse(problem.isPowerOfFour(0));
		assertFalse(problem.isPowerOfFour(2));
		assertFalse(problem.isPowerOfFour(5));
		assertFalse(problem.isPowerOfFour(8));

		assertTrue(problem.isPowerOfFour(1));
		assertTrue(problem.isPowerOfFour(4));
		assertTrue(problem.isPowerOfFour(16));
		assertTrue(problem.isPowerOfFour(64));
		assertTrue(problem.isPowerOfFour(Integer.MIN_VALUE));

	}

}
