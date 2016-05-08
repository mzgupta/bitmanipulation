package com.mz.bitmanipulation.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RangeBitWiseAndTest {
	RangeBitWiseAnd problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new RangeBitWiseAnd();
	}

	@Test
	public void test() {
		Assert.assertEquals(4, problem.rangeBitwiseAnd(5, 7));
	}

}
