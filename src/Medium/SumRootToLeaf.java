package Medium;

import java.util.*;


public class SumRootToLeaf {

	// Sum root to leaf numbers:
	// https://leetcode.com/problems/sum-root-to-leaf-numbers/

	public int sumNumbers(TreeNode root) {

		if (root == null)
			return 0;

		List<Integer> numbers = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		getNumbers(root, numbers, sb);

		return numbers.stream().mapToInt(i -> i).sum();
	}

	public void getNumbers(TreeNode root, List<Integer> numbers, StringBuilder currNum) {

		if (root.right == null && root.left == null) {
			currNum.append(root.val);

			int x = Integer.parseInt(currNum.toString());

			numbers.add(x);
			return;
		}

		currNum.append(root.val);
		if (root.left != null) {
			getNumbers(root.left, numbers, currNum);

			currNum.deleteCharAt(currNum.length() - 1);
		}

		if (root.right != null) {
			getNumbers(root.right, numbers, currNum);
			currNum.deleteCharAt(currNum.length() - 1);
		}

	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
