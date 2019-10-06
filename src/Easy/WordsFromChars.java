package Easy;

public class WordsFromChars {

	// Find Words That Can Be Formed by Characters:
	// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

	public static int countCharacters(String[] words, String chars) {

		int sum = 0;

		int[] counts = new int[26];

		for (int i = 0; i < chars.length(); i++)
			counts[chars.charAt(i) - 'a']++;

		int[] temp = counts.clone();

		for (String s : words) {

			int i;

			for (i = 0; i < s.length(); i++) {
				if (--counts[s.charAt(i) - 'a'] < 0)
					break;
			}

			if (i == s.length())
				sum += s.length();

			counts = temp.clone();

		}
		return sum;
	}
}
