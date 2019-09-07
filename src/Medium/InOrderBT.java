package Medium;

import java.util.*;

public class InOrderBT {

	// Binary Tree Inorder Traversal:
	// https://leetcode.com/problems/binary-tree-inorder-traversal/

	public void inOrder(TreeNode root, List<Integer> result) {

		if (root == null)
			return;

		inOrder(root.left, result);

		result.add(root.val);

		inOrder(root.right, result);
	}

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> res = new ArrayList<Integer>();

		inOrder(root, res);

		return res;
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
