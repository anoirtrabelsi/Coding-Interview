package Medium;

import java.util.*;

public class ZigZagTraversal {

	// Tree Zig-Zag Traversal:
	// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		List<List<Integer>> ret = new ArrayList<List<Integer>>();

		if (root == null)
			return ret;

		int count = -1;

		LinkedList<TreeNode> q = new LinkedList<TreeNode>();

		q.add(root);

		while (!q.isEmpty()) {

			count++;
			List<Integer> level = new ArrayList<Integer>();

			if (count % 2 == 0)
				for (int i = 0; i < q.size(); i++)
					level.add(q.get(i).val);

			else
				for (int i = q.size() - 1; i >= 0; i--)
					level.add(q.get(i).val);

			ret.add(level);

			LinkedList<TreeNode> temp = new LinkedList<TreeNode>();

			while (!q.isEmpty()) {
				TreeNode curr = q.poll();
				if (curr.left != null)
					temp.add(curr.left);

				if (curr.right != null)
					temp.add(curr.right);
			}
			q = temp;
		}
		return ret;
	}

}
