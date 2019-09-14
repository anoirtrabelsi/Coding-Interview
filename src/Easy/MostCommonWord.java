package Easy;

import java.util.*;

public class MostCommonWord {

	// Most Common word: https://leetcode.com/problems/most-common-word/

	public static String mostCommonWord(String paragraph, String[] banned) {

		Map<String, Integer> count = new HashMap<String, Integer>();

		for (String s : paragraph.split("[\\p{Punct}\\s]+")) {
			s = s.toLowerCase();
			count.put(s, count.getOrDefault(s, 0) + 1);
		}

		Set<String> bannedWords = new HashSet<String>();
		for (String s : banned)
			bannedWords.add(s);

		int max = Collections.max(count.values());

		while (true) {
			for (String w : count.keySet()) {
				if (count.get(w) == max) {
					if (!bannedWords.contains(w))
						return w;
					else
						count.put(w, 0);
				}

			}

			max = Collections.max(count.values());
		}

	}

}
