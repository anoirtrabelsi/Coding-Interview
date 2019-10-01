package Easy;

public class SquareSum {

	// Judge Square Sum: https://leetcode.com/problems/sum-of-square-numbers/

	public static boolean judgeSquareSum(int c) {

		for (int i = 0; i < Math.sqrt(c); i++) {
			int rest = c - i * i;

			if ((int) Math.sqrt(rest) == Math.sqrt(rest))

				return true;

		}
		return false;

	}

}
