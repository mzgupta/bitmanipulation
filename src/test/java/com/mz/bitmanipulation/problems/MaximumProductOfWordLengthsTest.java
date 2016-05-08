package com.mz.bitmanipulation.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumProductOfWordLengthsTest {
	MaximumProductOfWordLengths problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new MaximumProductOfWordLengths();
	}

	@Test
	public void test() {
		String[] words = { "abc" };
		Assert.assertEquals(0, problem.maxProduct(words));

		words = new String[] { "bac", "a" };
		Assert.assertEquals(0, problem.maxProduct(words));

		words = new String[] { "bac", "d" };
		Assert.assertEquals(3, problem.maxProduct(words));

		words = new String[] { "abcw", "baz", "foo", "bar", "xtfn", "abcdef" };
		Assert.assertEquals(16, problem.maxProduct(words));

	}

}
