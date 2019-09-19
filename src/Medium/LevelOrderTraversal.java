package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	// Level Order Traversal of a binary tree:
	// https://leetcode.com/problems/binary-tree-level-order-traversal/

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (root == null)
			return result;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {

			// with streams, less efficient:
			// result.add(queue.stream().map(x -> x.val).collect(Collectors.toList()));

			List<Integer> l = new ArrayList<Integer>();
			for (TreeNode node : queue)
				l.add(node.val);

			result.add(l);

			Queue<TreeNode> tempQ = new LinkedList<TreeNode>();

			while (!queue.isEmpty()) {
				TreeNode curr = queue.poll();
				if (curr.left != null)
					tempQ.add(curr.left);
				if (curr.right != null)
					tempQ.add(curr.right);
			}

			queue = tempQ;
		}
		return result;
	}
}
