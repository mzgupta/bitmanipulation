package com.mz.bitmanipulation.problems;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepeatedDNASequencesTest {
	RepeatedDNASequences problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new RepeatedDNASequences();
	}

	@Test
	public void test() {
		List<String> answer = problem
				.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
		Assert.assertTrue(answer.contains("AAAAACCCCC"));
		Assert.assertTrue(answer.contains("CCCCCAAAAA"));

		answer = problem.findRepeatedDnaSequences("AAAAAAAAAAA");
		Assert.assertTrue(answer.contains("AAAAAAAAAA"));

	}

}
