package com.mz.bitmanipulation.problems;

import org.junit.Before;
import org.junit.Test;

public class CountingBitsTest {
	private CountingBits problem;

	@Before
	public void setUp() throws Exception {
		problem = new CountingBits();
	}

	@Test
	public void testCountBits() {
		int[] counts = problem.countBits(10);

		for (int i = 0; i < counts.length; i++) {
			System.out.print(counts[i]+",");
		}
		System.out.println();
	}

	@Test
	public void testCountBits2() {
		int[] counts = problem.countBits(2<<9);

		for (int i = 0; i < counts.length; i++) {
			System.out.print(counts[i]+",");
		}
		System.out.println();
		
	}


}
