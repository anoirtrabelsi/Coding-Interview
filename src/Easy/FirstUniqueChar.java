package Easy;

import java.util.*;

public class FirstUniqueChar {

	// First Unique Character in a String:
	// https://leetcode.com/problems/first-unique-character-in-a-string/

	public int firstUniqChar(String s) {

		Map<Character, Integer> count = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			
			if (count.get(s.charAt(i)) == null || count.get(s.charAt(i)) <2)
				
				count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (int i = 0; i < s.length(); i++)
			if (count.get(s.charAt(i)) == 1)
				return i;

		return -1;
	}

}
