package Easy;

public class RangeSumBST {

	//Range sum of a BST: https://leetcode.com/problems/range-sum-of-bst/

	public int rangeSumBST(TreeNode root, int L, int R) {
		if (root == null)
			return 0;

		if (root.val >= L && root.val <= R)
			return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);

		return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
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

