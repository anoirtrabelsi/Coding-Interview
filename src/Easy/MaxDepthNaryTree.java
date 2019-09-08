package Easy;

import java.util.*;

public class MaxDepthNaryTree {

	// Maximum Depth of N-ary Tree:
	// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

	// Node inner class
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

	public int maxDepth(Node root) {
		
		if (root == null)
			return 0;
		
		int max = 0;
		
		for (Node n : root.children) {
			
			int currMax = maxDepth(n);
			max = Math.max(max, currMax);
		}

		return 1 + max;
	}
}
