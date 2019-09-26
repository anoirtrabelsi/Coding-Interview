package Easy;

public class LongestUniValuePath {

	// Longest Univalue Path: https://leetcode.com/problems/longest-univalue-path/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int max;

	public int longestUnivaluePath(TreeNode root) {

		if (root == null)
			return 0;

		helper(root, root.val);

		return max;

	}

	public int helper(TreeNode root, int val) {

		if (root == null)
			return 0;

		int left = helper(root.left, root.val);
		int right = helper(root.right, root.val);

		max = Math.max(max, left + right);

		if (root.val == val)
			return 1 + Math.max(left, right);
		return 0;
	}
}
