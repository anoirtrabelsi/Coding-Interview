package Contests;

import java.util.*;

//Given two binary search trees, return True if and only if there is a node in the first tree and a node 
//in the second tree whose values sum up to a given integer target.

//Eg: Input: root1 = [2,1,4], root2 = [1,0,3], target = 5
//Output: true
//Explanation: 2 and 3 sum up to 5.

public class TwoSumsBST {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {

		Set<Integer> tree1 = new HashSet<Integer>();
		Set<Integer> tree2 = new HashSet<Integer>();

		traverse(root1, tree1);
		traverse(root2, tree2);

		for (int x : tree1)
			if (tree2.contains(target - x))
				return true;

		return false;
	}

	public void traverse(TreeNode root, Set<Integer> vals) {

		if (root == null)
			return;

		vals.add(root.val);

		traverse(root.left, vals);
		traverse(root.right, vals);

	}

}
