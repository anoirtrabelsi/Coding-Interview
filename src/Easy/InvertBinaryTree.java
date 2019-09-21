package Easy;

public class InvertBinaryTree {

	// Invert Binary Tree: https://leetcode.com/problems/invert-binary-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

	}

	public static TreeNode invertTree(TreeNode root) {

		if (root == null || root.left == null && root.right == null)
			return root;

		TreeNode tempLeft = root.left;

		root.left = invertTree(root.right);

		root.right = invertTree(tempLeft);

		return root;
	}

}
