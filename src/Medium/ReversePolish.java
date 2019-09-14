package Medium;

import java.util.*;

public class ReversePolish {

	// Reverse Polish Notation:
	// https://leetcode.com/problems/evaluate-reverse-polish-notation/

	public static int evalRPN(String[] tokens) {

		Stack<Integer> stack = new Stack<Integer>();

		Set<String> ops = new HashSet<String>();
		ops.add("+");
		ops.add("-");
		ops.add("*");
		ops.add("/");

		for (String s : tokens) {

			if (!ops.contains(s))
				stack.push(Integer.parseInt(s));

			else {
				int secondOp = stack.pop();
				int firstOp = stack.pop();

				switch (s) {
				case "*":
					stack.push(firstOp * secondOp);
					break;
				case "+":
					stack.push(firstOp + secondOp);
					break;
				case "/":
					stack.push(firstOp / secondOp);
					break;
				case "-":
					stack.push(firstOp - secondOp);
					break;
				}
			}

		}

		return stack.peek();
	}
}
