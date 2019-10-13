package Easy;

import java.util.*;

public class LongestPalindrome {

	// Longest Palindrome: https://leetcode.com/problems/longest-palindrome/

	public int longestPalindrome(String s) {

		Map<Character, Integer> count = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++)

			count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);

		boolean hasOdd = false;
		int sum = 0;

		for (int x : count.values()) {
			sum += x - x % 2;
			if (x % 2 != 0)
				hasOdd = true;
		}

		return hasOdd ? sum + 1 : sum;
	}

}
