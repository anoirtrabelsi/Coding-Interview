package Easy;

public class PathSumIII {

	// Path Sum: https://leetcode.com/problems/path-sum-iii/

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int pathFrom(TreeNode root, int sum) {
		if (root == null)
			return 0;

		int sumLeftRight = pathFrom(root.left, sum - root.val) + pathFrom(root.right, sum - root.val);

		return root.val == sum ? sumLeftRight + 1 : sumLeftRight;
	}

	public int pathSum(TreeNode root, int sum) {

		if (root == null)
			return 0;

		return pathFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}

}
