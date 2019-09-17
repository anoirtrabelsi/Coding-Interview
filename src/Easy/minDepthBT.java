package Easy;

public class minDepthBT {

	// Minimum Depth of Binary Tree:
	// https://leetcode.com/problems/minimum-depth-of-binary-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	

	public int minDepth(TreeNode root) {

		if (root == null)
			return 0;

		if (root.right == null)
			return 1 + minDepth(root.left);
		
		if (root.left == null)
			return 1 + minDepth(root.right);

		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

}
