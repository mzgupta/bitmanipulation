package com.mz.bitmanipulation.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOf1BitsTest {

	NumberOf1Bits problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new NumberOf1Bits();
	}

	@Test
	public void test() {
		Assert.assertEquals(0, problem.hammingWeight(0));
		Assert.assertEquals(1, problem.hammingWeight(1));
		Assert.assertEquals(32, problem.hammingWeight(-1));
	}

	@Test
	public void test2() {
		Assert.assertEquals(0, problem.hammingWeight2(0));
		Assert.assertEquals(1, problem.hammingWeight2(1));
		Assert.assertEquals(32, problem.hammingWeight2(-1));
	}

}
