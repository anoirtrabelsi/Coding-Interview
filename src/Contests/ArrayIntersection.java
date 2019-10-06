package Contests;

import java.util.*;

public class ArrayIntersection {

	// Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing
	// order, return a sorted array of only the integers that appeared in all three
	// arrays.

	// Eg: Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
	// Output: [1,5]
	// Explanation: Only 1 and 5 appeared in the three arrays.

	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {

		List<Integer> ret = new ArrayList<Integer>();

		Set<Integer> set2 = new HashSet<Integer>();

		for (int x : arr2)
			set2.add(x);

		Set<Integer> set3 = new HashSet<Integer>();

		for (int x : arr3)
			set3.add(x);

		for (int val : arr1) {
			if (set2.contains(val) && set3.contains(val))
				ret.add(val);
		}

		return ret;

	}

}
