package Easy;

public class SumLeftLeaves {

	// Sum of Left Leaves: https://leetcode.com/problems/sum-of-left-leaves/

	static public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {

		sumOfLeftLeaves(root, false);

		return sum;

	}

	public void sumOfLeftLeaves(TreeNode root, boolean isLeft) {

		if (root == null)
			return;

		if (isLeft && root.left == null && root.right == null)
			sum += root.val;

		sumOfLeftLeaves(root.left, true);
		sumOfLeftLeaves(root.right, false);
	}
}
