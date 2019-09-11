package Easy;

import java.util.*;

public class DegreeOfArray {

	// Degree of an Array: https://leetcode.com/problems/degree-of-an-array/

	public static int findShortestSubArray(int[] nums) {

		// store index of left-most occurence of an element:
		Map<Integer, Integer> right = new HashMap<Integer, Integer>();
		// right-most occurence:
		Map<Integer, Integer> left = new HashMap<Integer, Integer>();
		// map element to its occurence:
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (left.get(nums[i]) == null)
				left.put(nums[i], i);

			right.put(nums[i], i);

			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
		}

		int degree = Collections.max(count.values());

		int result = Integer.MAX_VALUE;

		for (int key : count.keySet()) {
			if (count.get(key) == degree)
				result = Math.min(result, right.get(key) - left.get(key) + 1);
		}
		return result;
	}

}
