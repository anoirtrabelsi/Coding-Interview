package Easy;

import java.util.*;

public class ValidParentheses {

	// Valid Parentheses: https://leetcode.com/problems/valid-parentheses/

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == '(' || c == '{' || c == '[')
				stack.push(c);
			else if (c == ')' || c == '}' || c == ']')
				if (stack.isEmpty() || c != match(stack.pop()))
					return false;
		}

		return true;
	}

	public static char match(char c) {

		switch (c) {
		case '(':
			return ')';
		case '[':
			return ']';
		case '{':
			return '}';
		default:
			return ' ';
		}

	}
}
