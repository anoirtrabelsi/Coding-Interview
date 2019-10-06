package Easy;

public class CountAndSay {

	// Count and say: https://leetcode.com/problems/count-and-say/submissions/

	public static String countAndSay(int n) {

		if (n == 1)
			return "1";

		String str = countAndSay(n - 1);

		StringBuilder sb = new StringBuilder();

		int index = 0;

		while (index < str.length()) {
			int num = 1;

			while (index < str.length() - 1 && str.charAt(index) == str.charAt(index + 1)) {
				num++;
				index++;
			}

			sb.append(num + "" + str.charAt(index));

			index++;
		}

		return sb.toString();
	}

}
