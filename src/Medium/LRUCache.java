package Medium;

import java.util.*;

public class LRUCache {

	// LRU Cache: https://leetcode.com/problems/lru-cache/

	private int capacity;

	private Map<Integer, Integer> cache;

	private Queue<Integer> queue;

	public LRUCache(int capacity) {

		this.capacity = capacity;

		cache = new HashMap<Integer, Integer>();

		queue = new LinkedList<Integer>();
	}

	public int get(int key) {

		if (cache.containsKey(key)) {

			queue.remove(key);

			queue.add(key);
			return cache.get(key);
		}
		return -1;

	}

	public void put(int key, int value) {

		if (cache.size() < capacity || cache.containsKey(key)) {
			cache.put(key, value);
			if (cache.containsKey(key))
				queue.remove(key);
			queue.add(key);

		} else {

			int lru = queue.poll();
			cache.remove(lru);
			cache.put(key, value);
			queue.add(key);
		}
	}

}
