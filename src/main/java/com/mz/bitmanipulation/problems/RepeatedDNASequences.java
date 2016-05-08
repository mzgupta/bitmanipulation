package com.mz.bitmanipulation.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> answer = new HashSet<String>();
		if (s != null && s.length() >= 10) {
			Set<String> set = new HashSet<String>();
			int i = 0;
			String dna = s.substring(i, i + 10);
			set.add(dna);
			for (i = 1; i <= s.length() - 10; i++) {
				dna = s.substring(i, i + 10);
				if (!set.add(dna)) {
					answer.add(dna);
				}
			}
		}
		return new ArrayList<String>(answer);
	}
}
