package Easy;

public class FloodFill {

	// Flood Fill: https://leetcode.com/problems/flood-fill/

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		dfs(image, sr, sc, newColor, image[sr][sc]);

		return image;

	}

	public void dfs(int[][] image, int row, int col, int newColor, int oldColor) {

		if (row >= image.length || row < 0 || col >= image[0].length || col < 0 || image[row][col] != oldColor
				|| image[row][col] == newColor)
			return;

		image[row][col] = newColor;

		dfs(image, row + 1, col, newColor, oldColor);
		dfs(image, row - 1, col, newColor, oldColor);
		dfs(image, row, col + 1, newColor, oldColor);
		dfs(image, row, col - 1, newColor, oldColor);

	}

}
