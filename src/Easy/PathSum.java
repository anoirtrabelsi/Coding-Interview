package Easy;

public class PathSum {

	// Path Sum : https://leetcode.com/problems/path-sum/

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null)
			return false;

		if (root.right == null && root.left == null && root.val == sum) // If it's a leaf node and the sum matches our
																		// target we return true
			return true;

		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val); // Otherwise check right
																								// and left subtress

	}

}
