package Easy;

import java.util.*;

public class ConvertGreaterTree {

	// Convert a Binary Tree to Greater Tree:

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode convertBST(TreeNode root) {

		Set<Integer> vals = new TreeSet<Integer>();

		getValues(root, vals);

		Map<Integer, Integer> map = greaterMap(vals);

		return convertBST(root, map);
	}

	public TreeNode convertBST(TreeNode root, Map<Integer, Integer> map) {
		if (root == null)
			return root;

		root.val = map.get(root.val);

		convertBST(root.left, map);
		convertBST(root.right, map);

		return root;
	}

	public Map<Integer, Integer> greaterMap(Set<Integer> vals) {

		Map<Integer, Integer> ret = new HashMap<Integer, Integer>();

		int sum = 0;

		for (int val : vals)
			sum += val;

		for (int val : vals) {
			ret.put(val, sum);
			sum -= val;
		}

		return ret;
	}

	public void getValues(TreeNode root, Set<Integer> vals) {

		if (root == null)
			return;

		vals.add(root.val);

		getValues(root.left, vals);
		getValues(root.right, vals);

	}

}
