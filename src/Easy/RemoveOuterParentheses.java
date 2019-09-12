package Easy;

public class RemoveOuterParentheses {

	// Remove Outermost Parentheses:
	// https://leetcode.com/problems/remove-outermost-parentheses/

	public String removeOuterParentheses(String S) {

		StringBuilder sb = new StringBuilder(S);

		int count = 0;
		int j = 0;
		int numDel = 0;

		for (int i = 0; i < S.length(); i++) {

			if (S.charAt(i) == '(')
				count++;
			else
				count--;

			if (count == 0) {
				sb.deleteCharAt(i - numDel);
				sb.deleteCharAt(j - numDel);
				j = i + 1;
				numDel += 2;
			}
		}

		return sb.toString();
	}

}
