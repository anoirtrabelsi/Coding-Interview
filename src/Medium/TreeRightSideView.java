package Medium;

import java.util.*;

public class TreeRightSideView {

	// Binary Tree Right Side
	// View:https://leetcode.com/problems/binary-tree-right-side-view/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	//simple BFS:

	public List<Integer> rightSideView(TreeNode root) {

		List<Integer> result = new ArrayList<Integer>();

		if (root == null)
			return result;

		LinkedList<TreeNode> q = new LinkedList<TreeNode>();

		q.add(root);

		while (!q.isEmpty()) {

			result.add(q.get(q.size() - 1).val);

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

		return result;
	}

}
