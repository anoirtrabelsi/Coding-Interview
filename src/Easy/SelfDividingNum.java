package Easy;

import java.util.*;

public class SelfDividingNum {

	// Self dividing numbers: https://leetcode.com/problems/self-dividing-numbers/

	public List<Integer> selfDividingNumbers(int left, int right) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = left; i <= right; i++) {
			if (selfDivide(i))
				result.add(i);
		}

		return result;
	}

	public boolean selfDivide(int x) {
		int xTemp = x;

		while (x != 0) {
			if (x % 10 == 0 || xTemp % (x % 10) != 0)
				return false;
			x /= 10;
		}

		return true;
	}
}
