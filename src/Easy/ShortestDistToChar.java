package Easy;

import java.util.*;

public class ShortestDistToChar {

	// Shortest distance to character:
	// https://leetcode.com/problems/shortest-distance-to-a-character/

	public int[] shortestToChar(String S, char C) {

		List<Integer> positions = new ArrayList<Integer>();

		int[] result = new int[S.length()];

		for (int i = 0; i < S.length(); i++)
			if (S.charAt(i) == C)
				positions.add(i);

		for (int i = 0; i < result.length; i++) {
			if (S.charAt(i) == C)
				continue;

			int index = Collections.binarySearch(positions, i);

			int pos = -index - 1;
			if (pos == 0)
				result[i] = positions.get(pos) - i;
			else if (pos == positions.size())
				result[i] = i - positions.get(pos - 1);
			else
				result[i] = Math.min(positions.get(pos) - i, i - positions.get(pos - 1));

		}
		return result;
	}

}
