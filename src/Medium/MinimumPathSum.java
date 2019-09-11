package Medium;


public class MinimumPathSum {

	// Minimum path sum: https://leetcode.com/problems/minimum-path-sum/

	

	// Dynamic Programming:

	public int minPathSum(int[][] grid) {

		int[][] dp = new int[grid.length][grid[0].length];

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {

				dp[i][j] = grid[i][j];

				if (i > 0 && j > 0)
					dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
				else if (i > 0) {
					dp[i][j] += dp[i - 1][j];
				} else if (j > 0)
					dp[i][j] += dp[i][j - 1];

			}
		}
		return dp[grid.length - 1][grid[0].length - 1];
	}
	
	
	// Naive recursive approach:

		/*
		 * public int minPathSum(int[][] grid) { return min(grid, 0, 0); }
		 * 
		 * public int min(int[][] grid, int row, int col) {
		 * 
		 * if (row >= grid.length || col >= grid[0].length) return 0;
		 * 
		 * if (row == grid.length - 1 && col == grid[0].length - 1) return
		 * grid[row][col];
		 * 
		 * if (row == grid.length - 1) return grid[row][col] + min(grid, row, col + 1);
		 * if (col == grid[0].length - 1) return grid[row][col] + min(grid, row + 1,
		 * col);
		 * 
		 * return grid[row][col] + Math.min(min(grid, row, col + 1), min(grid, row + 1,
		 * col)); }
		 */

}
