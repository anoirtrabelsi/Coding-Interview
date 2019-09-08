package Medium;

import java.util.Stack;

public class DailyTemperature {

	// Daily Temperatures: https://leetcode.com/problems/daily-temperatures/

	// Bruteforce solution: O(n²):

	public int[] dailyTemperatures(int[] T) {
		int[] result = new int[T.length];
		for (int i = 0; i < T.length; i++) {
			int j = i + 1;
			for (; j < T.length; j++) {
				if (T[j] > T[i]) {
					result[i] = j - i;
					break;
				}
			}

			if (j == T.length)
				result[i] = 0;
		}
		return result;
	}

	// Leetcode solution: O(n):

	public int[] dailyTemperaturesStack(int[] T) {

		Stack<Integer> indices = new Stack<Integer>();

		int[] result = new int[T.length];

		for (int i = T.length - 1; i >= 0; i--) {
			while (!indices.isEmpty() && T[i] >= T[indices.peek()])
				indices.pop();

			result[i] = indices.isEmpty() ? 0 : indices.peek() - i;
			indices.push(i);
		}

		return result;
	}

}
