package Easy;

import java.util.*;

public class UncommonWords {

	// Uncommon Words from Two Sentences:
	// https://leetcode.com/problems/uncommon-words-from-two-sentences/

	public String[] uncommonFromSentences(String A, String B) {

		Map<String, Integer> firstMap = new HashMap<String, Integer>();

		Map<String, Integer> secondMap = new HashMap<String, Integer>();

		for (String s : A.split(" "))
			firstMap.put(s, firstMap.getOrDefault(s, 0) + 1);

		for (String s : B.split(" "))
			secondMap.put(s, secondMap.getOrDefault(s, 0) + 1);

		List<String> uncommon = new ArrayList<String>();

		for (String s : firstMap.keySet()) {
			if (firstMap.get(s) == 1 && !secondMap.containsKey(s))
				uncommon.add(s);
		}

		for (String s : secondMap.keySet()) {
			if (secondMap.get(s) == 1 && !firstMap.containsKey(s))
				uncommon.add(s);
		}

		return uncommon.toArray(new String[uncommon.size()]);
	}

}
