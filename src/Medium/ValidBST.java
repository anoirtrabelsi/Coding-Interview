package Medium;

public class ValidBST {

	// Validate Binary Search Tree:
	// https://leetcode.com/problems/validate-binary-search-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isValidBST(TreeNode root) {

		if (root == null)
			return true;

		if (!dfs(root.left, root.val, true) || !dfs(root.right, root.val, false))
			return false;

		return isValidBST(root.left) && isValidBST(root.right);

	}

	public boolean dfs(TreeNode root, int val, boolean less) {

		if (root == null)
			return true;
		if (!less) {
			if (root.val <= val)
				return false;
		} else if (root.val >= val)
			return false;

		return dfs(root.left, val, less) && dfs(root.right, val, less);
	}
}
