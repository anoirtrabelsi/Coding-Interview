package Easy;

import java.util.*;

public class MajorityElement {

	// Majority Element: https://leetcode.com/problems/majority-element/

	public int majorityElement(int[] nums) {

		Map<Integer, Integer> count = new HashMap<Integer, Integer>();

		for (int x : nums)
			count.put(x, count.getOrDefault(x, 0) + 1);
		
		int max = Collections.max(count.values());
		
		for (int x : count.keySet())
			if (count.get(x) == max)
				return x;
		
		return -1;
	}

}
