package Medium;

import java.util.*;

public class Trie {

	// Implement a Trie: https://leetcode.com/problems/implement-trie-prefix-tree/

	static class Node {

		Map<Character, Node> children;
		boolean isWord;

		public Node() {
			children = new HashMap<Character, Node>();
		}

	}

	private Node head;

	/** Initialize your data structure here. */

	public Trie() {
		head = new Node();
		// head.isWord = true;
	}

	/** Inserts a word into the trie. */

	public void insert(String word) {

		Node curr = head;

		int i = 0;

		while (i < word.length() && curr.children.containsKey(word.charAt(i))) {
			curr = curr.children.get(word.charAt(i));
			i++;
		}

		if (i == word.length())
			curr.isWord = true;

		for (int j = i; j < word.length(); j++) {
			char c = word.charAt(j);
			curr.children.put(c, new Node());

			curr = curr.children.get(c);

			if (j == word.length() - 1)
				curr.isWord = true;
		}

	}

	/** Returns if the word is in the trie. */

	public boolean search(String word) {

		Node curr = head;
		int i = 0;
		while (i < word.length() && curr.children.containsKey(word.charAt(i))) {
			curr = curr.children.get(word.charAt(i));
			i++;
		}
		return i == word.length() && curr.isWord;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		Node curr = head;
		int i = 0;
		while (i < prefix.length() && curr.children.containsKey(prefix.charAt(i))) {
			curr = curr.children.get(prefix.charAt(i));
			i++;
		}

		return i == prefix.length();
	}

}
