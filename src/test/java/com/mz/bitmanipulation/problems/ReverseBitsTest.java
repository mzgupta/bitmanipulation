package com.mz.bitmanipulation.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseBitsTest {
	ReverseBits problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new ReverseBits();
	}

	@Test
	public void test() {
		Assert.assertEquals(964176192, problem.reverseBits(43261596));
		Assert.assertEquals(0, problem.reverseBits(0));
		Assert.assertEquals(-1, problem.reverseBits(-1));
		Assert.assertEquals(Integer.MIN_VALUE, problem.reverseBits(1));
	}

}
