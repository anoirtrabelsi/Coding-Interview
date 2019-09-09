package Easy;

import java.util.Arrays;

public class ValidAnagram {

	

	public boolean isAnagram(String s, String t) {
		
		if (s.length() != t.length())
			return false;
		
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		
		Arrays.sort(sChar);
		Arrays.sort(tChar);
		
		return Arrays.equals(sChar, tChar);
	}
	
	public boolean isAnagram_Leetcode(String s, String t) {

		if (s.length() != t.length())
			return false;

		int[] letters = new int[26];

		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i) - 'a']++;
			letters[t.charAt(i) - 'a']--;
		}

		for (int i =0; i<26; i++)
            if (letters[i] != 0)
                return false;
                
        return true;
	}

}
