package Easy;

public class Complement {

	// Number Complement: https://leetcode.com/problems/number-complement/

	// String method:

	/*
	 * public static int findComplement(int num) {
	 * 
	 * String bin = Integer.toBinaryString(num);
	 * 
	 * char [] chars = bin.toCharArray();
	 * 
	 * for (int i=0; i<chars.length; i++) { if (chars[i] == '0') chars[i] = '1';
	 * else chars[i] = '0'; }
	 * 
	 * return Integer.parseInt(new String(chars), 2); }
	 */

	// Bit Manipulation Method:

	public static int findComplement(int num) {
		return (~num) & (Integer.highestOneBit(num) << 1 - 1);
	}

}
