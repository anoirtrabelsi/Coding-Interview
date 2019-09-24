package Easy;

public class BalancedTree {

	// Balanced Binary Tree: https://leetcode.com/problems/balanced-binary-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isBalanced(TreeNode root) {

		if (root == null)
			return true;

		return isBalanced(root.left) && isBalanced(root.right)
				&& Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1;

	}

	public int maxDepth(TreeNode root) {

		if (root == null)
			return 0;

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

}
