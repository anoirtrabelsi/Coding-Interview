package Easy;

public class DIStringMatch {

	// DI String Match: https://leetcode.com/problems/di-string-match/

	public int[] diStringMatch(String S) {

		int low = 0;
		int high = S.length();

		int[] result = new int[S.length() + 1];

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'I')
				result[i] = low++;
			else
				result[i] = high--;
		}
		
		result[S.length()] = low;
		
		return result;

	}

}
