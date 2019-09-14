package Easy;

public class gcdStrings {

	// Greatest Common Divisor of Strings:
	// https://leetcode.com/problems/greatest-common-divisor-of-strings/

	public String gcdOfStrings(String str1, String str2) {

		// make sure str1.length() > str2.length();
		if (str1.length() < str2.length())
			return gcdOfStrings(str2, str1);
		
		if (!str1.startsWith(str2))
			return "";
		
		if (str2.length() == 0)
			return str1;
		
		return gcdOfStrings(str1.substring(str2.length()), str2);
		
	}

}
