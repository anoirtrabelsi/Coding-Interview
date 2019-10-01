package Easy;

import java.util.*;

public class MinStack {

	// Min Stack : https://leetcode.com/problems/min-stack/

	private Stack<Integer> stack;
	private Stack<Integer> min;

	public MinStack() {
		stack = new Stack<Integer>();
		min = new Stack<Integer>();
	}

	public void push(int x) {
		stack.push(x);

		if (min.isEmpty() || x < min.peek())
			min.push(x);

	}

	public void pop() {

		int pop = stack.pop();

		if (min.peek() == pop)
			min.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min.peek();
	}

}
