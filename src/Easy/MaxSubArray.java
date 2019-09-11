package Easy;

public class MaxSubArray {

	// Maximum subarray: https://leetcode.com/problems/maximum-subarray/

	// Dynamic Programming:

	public int maxSubArray(int[] nums) {

		int result = Integer.MIN_VALUE;

		int[] dp = new int[nums.length];

		dp[0] = nums[0];

		result = Math.max(result, dp[0]);

		for (int i = 1; i < nums.length; i++) {
			dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
			result = Math.max(result, dp[i]);
		}

		return result;
	}

	/*
	 * Bruteforce O(n²):
	 * 
	 * public int maxSubArray(int[] nums) {
	 * 
	 * int result = Integer.MIN_VALUE;
	 * 
	 * for (int i = 0; i < nums.length; i++) { int currSum = nums[i]; for (int j = i
	 * + 1; j < nums.length; j++) { currSum += nums[j]; result = Math.max(currSum,
	 * result); } }
	 * 
	 * return result; }
	 */

}
