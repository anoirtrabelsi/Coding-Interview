package Easy;

import java.util.*;

public class HappyNumber {

	// Happy numbers: https://leetcode.com/problems/happy-number/

	public boolean isHappy(int n) {

		Set<Integer> nums = new HashSet<Integer>();
		nums.add(n);

		int x = 0;

		while (true) {

			while (n != 0) {
				x += (n % 10) * (n % 10);
				n /= 10;
			}

			n = x;
			x = 0;

			if (n == 1)
				return true;

			if (nums.contains(n))
				return false;

			nums.add(n);

		}

	}

}
