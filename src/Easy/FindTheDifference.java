package Easy;


public class FindTheDifference {

	// Find the difference: https://leetcode.com/problems/find-the-difference/

	// Occurence array solution:

	public char findTheDifference(String s, String t) {

		int[] occ = new int[26];

		for (int i = 0; i < s.length(); i++)
			occ[s.charAt(i) - 'a']++;

		for (int i = 0; i < t.length(); i++) {
			occ[t.charAt(i) - 'a']--;
			if (occ[t.charAt(i) - 'a'] < 0)
				return t.charAt(i);
		}
		return ' ';
	}

	// Leetcode solution using bit manipulation:

	public char findTheDifference_Bits(String s, String t) {

		char c = t.charAt(t.length() - 1);

		for (int i = 0; i < s.length(); i++) {
			c ^= s.charAt(i);
			c ^= t.charAt(i);
		}

		return c;
	}

}
