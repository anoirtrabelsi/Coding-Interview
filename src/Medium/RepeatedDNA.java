package Medium;

import java.util.*;

public class RepeatedDNA {

	// Repeated DNA Sequences: https://leetcode.com/problems/repeated-dna-sequences/

	public List<String> findRepeatedDnaSequences(String s) {

		List<String> result = new ArrayList<String>();

		Map<String, Integer> count = new HashMap<String, Integer>();

		int index = 0;

		while (index + 10 <= s.length()) {

			String str = s.substring(index, index + 10);

			count.put(str, count.getOrDefault(str, 0) + 1);

			if (count.get(str) == 2)
				result.add(str);

			index++;
		}
		return result;
	}

}
