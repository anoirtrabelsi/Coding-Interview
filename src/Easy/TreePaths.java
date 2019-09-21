package Easy;

import java.util.*;

public class TreePaths {

	// Binary Tree Paths: https://leetcode.com/problems/binary-tree-paths/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<String> binaryTreePaths(TreeNode root) {

		List<String> result = new ArrayList<String>();

		if (root == null)
			return result;

		binaryTreePathsHelper(root, result, "");

		return result;

	}

	public void binaryTreePathsHelper(TreeNode root, List<String> result, String curr) {

		curr += root.val;

		if (root.left == null && root.right == null) {
			result.add(curr);
			return;
		}

		if (root.left != null)
			binaryTreePathsHelper(root.left, result, curr + "->");

		if (root.right != null)
			binaryTreePathsHelper(root.right, result, curr + "->");

	}
}
