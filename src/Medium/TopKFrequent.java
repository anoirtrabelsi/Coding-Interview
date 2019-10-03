package Medium;

import java.util.*;

public class TopKFrequent {

	// Top K Frequent Elements:
	// https://leetcode.com/problems/top-k-frequent-elements/

	public List<Integer> topKFrequent(int[] nums, int k) {
		

		Map<Integer, Integer> count = new HashMap<Integer, Integer>();

		List<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++)
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return count.get(o2) - count.get(o1);
			}
		});

		for (int x : count.keySet())
			pq.add(x);

		while (k-- > 0)
			res.add(pq.poll());

		return res;

	}

}
