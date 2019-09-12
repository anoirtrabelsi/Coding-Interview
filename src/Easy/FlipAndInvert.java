package Easy;

public class FlipAndInvert {

	// Flipping an Image: https://leetcode.com/problems/flipping-an-image/

	public int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++)
			flipAndInvertArray(A[i]);
		return A;
	}

	public void flipAndInvertArray(int[] A) {

		for (int i = 0; i < A.length / 2; i++) {
			int temp = A[i];
			A[i] = A[A.length - 1 - i];
			A[A.length - 1 - i] = temp;
		}

		for (int i = 0; i < A.length; i++) {
			A[i] = 1 - A[i];
		}
	}

}
