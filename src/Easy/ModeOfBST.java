package Easy;

import java.util.*;

public class ModeOfBST {

	// Mode of BST: https://leetcode.com/problems/find-mode-in-binary-search-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int[] findMode(TreeNode root) {

		if (root == null)
			return null;

		Map<Integer, Integer> count = new HashMap<Integer, Integer>();

		traverse(root, count);

		int max = Collections.max(count.values());

		List<Integer> res = new ArrayList<Integer>();

		for (int val : count.keySet()) {
			if (count.get(val) == max)
				res.add(val);
		}

		int[] result = new int[res.size()];

		for (int i = 0; i < res.size(); i++)
			result[i] = res.get(i);

		return result;

	}

	public void traverse(TreeNode root, Map<Integer, Integer> count) {

		if (root == null)
			return;

		count.put(root.val, count.getOrDefault(root.val, 0) + 1);

		traverse(root.left, count);
		traverse(root.right, count);

	}

}
