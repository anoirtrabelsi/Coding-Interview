package Easy;

import java.util.*;

public class LeafSimilarTrees {

	// Leaf Similar Trees: https://leetcode.com/problems/leaf-similar-trees/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {

		// get leaf value sequence of first Tree:

		List<Integer> leafTree1 = new ArrayList<Integer>();
		List<Integer> leafTree2 = new ArrayList<Integer>();

		getLeaves(root1, leafTree1);
		getLeaves(root2, leafTree2);

		return leafTree1.equals(leafTree2);
	}

	public void getLeaves(TreeNode root, List<Integer> seq) {

		if (root == null)
			return;

		if (root.right == null && root.left == null) {
			seq.add(root.val);
			return;
		}

		getLeaves(root.left, seq);
		getLeaves(root.right, seq);

	}
}
