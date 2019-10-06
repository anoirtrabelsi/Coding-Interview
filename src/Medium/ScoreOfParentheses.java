package Medium;

public class ScoreOfParentheses {

	// Score of Parentheses: https://leetcode.com/problems/score-of-parentheses/

	//A really genius solution! (Not mine)
	
	public int scoreOfParentheses(String S) {

		int score = 0;

		int depth = 0;

		for (int i = 0; i < S.length(); i++) {

			if (S.charAt(i) == '(')
				depth++;
			else {
				depth--;

				if (S.charAt(i - 1) == '(')
					score += 1 << depth;
			}
		}
		return score;
	}

}
