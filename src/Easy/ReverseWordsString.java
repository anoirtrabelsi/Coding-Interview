package Easy;


public class ReverseWordsString {

	// Reverse words in a string:
	// https://leetcode.com/problems/reverse-words-in-a-string-iii/
	
	public static void main(String[] args) {
		ReverseWordsString r = new ReverseWordsString();
		
		System.out.println(r.reverseWords("Let's take LeetCode contest"));
	}
	
	public String reverseWords(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		for (String str: s.split((" ")))
			sb.append(reverseWord(str) + " ");
		
		sb.deleteCharAt(sb.length()-1);
		
		return sb.toString();
	}
	
	
	public String reverseWord(String s) {
		
		char[] arr = s.toCharArray();
		
		for (int i=0; i<arr.length/2; i++) {
			
			char temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		return new String(arr);
	}


	//Functional solution: Based on streams:
	
	/*public String reverseWords(String s) {

		return Arrays.stream(s.split((" "))).map(reverse).reduce("", (x, y) -> x +" "+ y).substring(1);
	}

	Function<String, String> reverse = (x) -> {
		if (x.length() == 1)
			return x;
		return x.charAt(x.length() - 1) + this.reverse.apply(x.substring(0, x.length() - 1));
	};*/
}
