package Easy;

import java.util.*;

public class SymmetricTree {

	// Symmetric Tree: https://leetcode.com/problems/symmetric-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

	}

	public boolean isSymmetric(TreeNode root) {

		List<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {

			for (int i = 0; i < queue.size() / 2; i++) {
				TreeNode n1 = queue.get(i);
				TreeNode n2 = queue.get(queue.size() - 1 - i);

				if (n1 == null && n2 == null)
					continue;
				if (n1 == null || n2 == null)
					return false;

				if (n1.val != n2.val)
					return false;
			}

			List<TreeNode> tempQ = new LinkedList<TreeNode>();

			while (!queue.isEmpty()) {

				TreeNode node = queue.remove(0);

				if (node != null) {
					tempQ.add(node.left);
					tempQ.add(node.right);
				}
			}
			queue = tempQ;
		}

		return true;
	}

}
