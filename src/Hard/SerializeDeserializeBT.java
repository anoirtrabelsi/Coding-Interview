package Hard;

import java.util.*;

public class SerializeDeserializeBT {

	// Serialize Deserialize Binary Tree:
	// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// Encodes a tree to a single string.
	public static String serialize(TreeNode root) {

		StringBuilder sb = new StringBuilder();

		seerializeHelper(root, sb);

		return sb.toString().substring(0, sb.length() - 1);
	}

	public static void seerializeHelper(TreeNode root, StringBuilder sb) {

		if (root == null) {
			sb.append("X,");
			return;
		}

		sb.append(root.val + ",");

		seerializeHelper(root.left, sb);
		seerializeHelper(root.right, sb);
	}

	// Decodes your encoded data to tree.
	public static TreeNode deserialize(String data) {

		Queue<String> q = new LinkedList<String>();

		q.addAll(Arrays.asList(data.split(",")));

		return deserializeHelper(q);

	}

	public static TreeNode deserializeHelper(Queue<String> q) {

		TreeNode curr = null;

		String s = q.poll();

		if (s.equals("X"))
			return null;

		curr = new TreeNode(Integer.parseInt(s));

		curr.left = deserializeHelper(q);
		curr.right = deserializeHelper(q);

		return curr;

	}

}
