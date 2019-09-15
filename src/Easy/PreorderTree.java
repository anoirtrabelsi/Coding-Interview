package Easy;

import java.util.*;

public class PreorderTree {

	// N-ary Tree Preorder Traversal:
	// https://leetcode.com/problems/n-ary-tree-preorder-traversal/

	static class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}

	public void preorderHelper(Node root, List<Integer> result) {

		if (root == null)
			return;

		result.add(root.val);

		for (Node n : root.children)
			preorderHelper(n, result);
	}

	public List<Integer> preorder(Node root) {

		List<Integer> result = new ArrayList<Integer>();

		preorderHelper(root, result);

		return result;
	}

}
