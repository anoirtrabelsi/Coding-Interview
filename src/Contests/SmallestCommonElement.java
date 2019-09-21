package Contests;

import java.util.*;

public class SmallestCommonElement {

	// Given a matrix mat where every row is sorted in increasing order, return the
	// smallest common element in all rows.

	// If there is no common element, return -1.

	// E.g: Input: mat = [[1,2,3,4,5],[2,4,5,8,10],[3,5,7,9,11],[1,3,5,7,9]]
	// Output: 5

	public int smallestCommonElement(int[][] mat) {

		if (mat.length == 1)
			return mat[0][0];

		Set<Set<Integer>> set = new HashSet<Set<Integer>>();

		for (int i = 1; i < mat.length; i++) {
			Set<Integer> curr = new HashSet<Integer>();
			for (int x : mat[i])
				curr.add(x);
			set.add(curr);
		}

		int[] arr = mat[0];

		for (int i = 0; i < arr.length; i++) {
			int num = 0;
			for (Set<Integer> s : set) {
				if (!s.contains(arr[i]))
					break;
				else
					num++;
				
				if (num == set.size())
					return arr[i];
			}
		}

		return -1;
	}

}
