package Easy;

import java.util.*;

public class ReverseVowels {

	// Reverse Vowels of a string:
	// https://leetcode.com/problems/reverse-vowels-of-a-string/

	public static String reverseVowels(String s) {

		StringBuilder sb = new StringBuilder(s);

		Set<Character> vowels = new HashSet<Character>();

		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		int start = 0;
		int end = s.length() - 1;

		while (start <= end) {

			while (start < end && !vowels.contains(Character.toLowerCase(s.charAt(start))))
				start++;

			while (start < end && !vowels.contains(Character.toLowerCase(s.charAt(end))))
				end--;

			char temp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);

			start++;
			end--;
		}

		return sb.toString();
	}
}
