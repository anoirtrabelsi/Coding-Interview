package Medium;

import java.util.*;

public class Permute {

	// Permute: https://leetcode.com/problems/permutations/

	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		permuteHelper(nums, result, 0);
		return result;
	} 

	public void permuteHelper(int[] nums, List<List<Integer>> result, int from) {

		if (from == nums.length - 1) {
			List<Integer> perm = new ArrayList<Integer>();
			for (int x : nums)
				perm.add(x);

			result.add(perm);
			return;
		}

		for (int i = from; i < nums.length; i++) {
			swap(nums, i, from);
			permuteHelper(nums, result, from + 1);
			swap(nums, i, from);
		}

	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
