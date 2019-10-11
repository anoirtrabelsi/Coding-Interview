package Easy;

import java.util.*;

public class WordPattern {

	// Word Pattern: https://leetcode.com/problems/word-pattern/

	public boolean wordPattern(String pattern, String str) {

		String[] words = str.split(" ");

		char[] chars = pattern.toCharArray();

		if (words.length != chars.length)
			return false;

		Map<Character, String> map = new HashMap<Character, String>();

		for (int i = 0; i < chars.length; i++) {
			if (!map.containsKey(chars[i])) {

				if (map.values().contains(words[i]))
					return false;
				map.put(chars[i], words[i]);
			}

			else if (!map.get(chars[i]).equals(words[i]))
				return false;
		}

		return true;
	}

}
