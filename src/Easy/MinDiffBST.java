package Easy;

import java.util.*;

public class MinDiffBST {

	// Minimum Distance Between BST Nodes:
	// https://leetcode.com/problems/minimum-distance-between-bst-nodes/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int minDiffInBST(TreeNode root) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		inOrder(root, list);
		
		int minDiff = Integer.MAX_VALUE;
		
		for (int i = 1; i<list.size();i++) 
			minDiff = Math.min(minDiff, list.get(i)-list.get(i-1));
		
		return minDiff;
	}

	public void inOrder(TreeNode root, List<Integer> list) {

		if (root == null)
			return;

		inOrder(root.left, list);
		list.add(root.val);
		inOrder(root.right, list);
	}

}
