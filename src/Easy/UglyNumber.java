package Easy;

public class UglyNumber {

	// Ugly number : https://leetcode.com/problems/ugly-number/

	public boolean isUgly(int num) {

		if (num <= 0)
			return false;

		if (num == 1)
			return true;
		if (num % 2 == 0)
			return isUgly(num / 2);
		if (num % 3 == 0)
			return isUgly(num / 3);
		if (num % 5 == 0)
			return isUgly(num / 5);

		return false;
	}

}
