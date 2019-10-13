package Easy;

public class SplitString {

	// Split a String in Balanced Strings:
	// https://leetcode.com/problems/split-a-string-in-balanced-strings/

	public int balancedStringSplit(String s) {

		int balance = 0;
		int ans = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L')
				balance++;
			else
				balance--;

			if (balance == 0)
				ans++;
		}

		return ans;
	}

}
