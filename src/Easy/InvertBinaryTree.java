package Easy;

import java.util.*;
import java.util.Arrays;

public class InvertBinaryTree {

	// Invert Binary Tree: https://leetcode.com/problems/invert-binary-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

	}

	public static TreeNode invertTree(TreeNode root) {

		if (root == null || root.left == null && root.right == null)
			return root;

		TreeNode tempLeft = root.left;

		root.left = invertTree(root.right);

		root.right = invertTree(tempLeft);

		return root;
	}

	public int maxNumberOfApples(int[] arr) {

		Arrays.sort(arr);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int res = arr.length;

		if (sum <= 5000)
			return res;
		int index = arr.length - 1;
		while (sum > 5000) {
			sum -= arr[index--];
			res--;
		}
		return res;
	}

	public int smallestCommonElement(int[][] mat) {

		if (mat.length == 1)
			return mat[0][0];

		Set<Set<Integer>> set = new HashSet<Set<Integer>>();

		for (int i = 1; i < mat.length; i++) {
			Set<Integer> curr = new HashSet<Integer>();
			for (int x : mat[i])
				curr.add(x);
			set.add(curr);
		}

		int[] arr = mat[0];

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int num = 0;
			for (Set<Integer> s : set) {
				if (!s.contains(arr[i]))
					break;
				else
					num++;
				if (num == set.size())
					return arr[i];
			}
		}

		return -1;
	}

}
