package Easy;

public class DetectCapital {

	// Detect Capital: https://leetcode.com/problems/detect-capital/

	public boolean detectCapitalUse(String word) {

		if (word.length() == 0)
			return true;

		int numUpper = 0;

		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)))
				numUpper++;
		}

		if (numUpper == 0 || numUpper == word.length())
			return true;

		if (numUpper == 1)
			return Character.isUpperCase(word.charAt(0));

		return false;
	}

}
