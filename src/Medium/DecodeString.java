package Medium;


public class DecodeString {

	// Decode String: https://leetcode.com/problems/decode-string/

	public static void main(String[] args) {

		DecodeString ds = new DecodeString();

		System.out.println(ds.decodeString("3[a]2[b2[d2[c]]]df2[abcd]f"));
	}

	public String decodeString(String s) {

		StringBuilder sb = new StringBuilder();

		decodeString(s, sb);

		return sb.toString();
	}

	public void decodeString(String s, StringBuilder sb) {

		int index = 0;
		int currNum = 0;

		while (index < s.length()) {

			char c = s.charAt(index);

			if (c >= '0' && c <= '9')
				currNum = currNum * 10 + c - '0';
			else if (c != '[' && c != ']') {
				currNum = 0;
				sb.append(c);
			}

			else if (c == '[') {

				int count = 1;
				int j = index + 1;
				for (; j < s.length(); j++) {
					if (s.charAt(j) == '[')
						count++;
					if (s.charAt(j) == ']')
						count--;
					if (count == 0)
						break;
				}
				for (int i = 0; i < currNum; i++) {

					String sub = s.substring(index + 1, j);

					decodeString(sub, sb);
				}

				index = j + 1;
				currNum = 0;
				continue;
			}
			index++;
		}

	}

}
