package Easy;

import java.util.*;

public class TwoSum {

	// Two Sum: https://leetcode.com/problems/two-sum/


	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> index = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++)
			index.put(nums[i], i);

		for (int i = 0; i < nums.length; i++) {
			if (index.containsKey(target - nums[i])) {
				int pos = index.get((target - nums[i]));
				if (i != pos)
					return new int[] { i, pos };
			}
		}

		return null;
	}

}
