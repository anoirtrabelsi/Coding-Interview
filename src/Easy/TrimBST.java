package Easy;

public class TrimBST {

	// Trim a Binary Search Tree:
	// https://leetcode.com/problems/trim-a-binary-search-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode trimBST(TreeNode root, int L, int R) {

		TreeNode res = new TreeNode(Integer.MAX_VALUE);

		trimHelper(root, res, L, R);

		return res;

	}

	public void trimHelper(TreeNode root, TreeNode res, int L, int R) {

		if (root == null)
			return;

		if (root.val >= L && root.val <= R) {
			insert(res, root.val, L, R);
		}

		trimHelper(root.left, res, L, R);
		trimHelper(root.right, res, L, R);

	}

	public void insert(TreeNode node, int val, int L, int R) {

		if (node.val < L || node.val > R) {
			node.val = val;
			return;
		}

		if (val <= node.val && node.left == null) {
			node.left = new TreeNode(val);
			return;
		}

		if (val > node.val && node.right == null) {
			node.right = new TreeNode(val);
			return;
		}

		if (val <= node.val)
			insert(node.left, val, L, R);
		else
			insert(node.right, val, L, R);
	}
}