package Easy;


public class UniValueTree {
	
	// Univalued Binary Tree: https://leetcode.com/problems/univalued-binary-tree/
	
	public boolean isUnivalTree(TreeNode root) {
		return isUnivalTree(root, root.val);
	}

	public boolean isUnivalTree(TreeNode root, int value) {
		if (root == null)
			return true;
		if (root.val != value)
			return false;
		return isUnivalTree(root.right, value) && isUnivalTree(root.left, value);
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
