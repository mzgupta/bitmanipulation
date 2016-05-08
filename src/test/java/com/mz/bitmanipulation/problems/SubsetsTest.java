package com.mz.bitmanipulation.problems;

import org.junit.Before;
import org.junit.Test;

public class SubsetsTest {
	Subsets problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new Subsets();
	}

	@Test
	public void test() {
		int[] nums = { 1, 2, 3 };
		System.out.println(problem.subsets(nums));
		nums = new int[] { 1, 2, 3, 4 };
		System.out.println(problem.subsets(nums));
	}

}
