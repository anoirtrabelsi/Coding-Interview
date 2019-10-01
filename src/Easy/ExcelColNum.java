package Easy;

public class ExcelColNum {

	// Excel Sheet Column Number:
	// https://leetcode.com/problems/excel-sheet-column-number/

	public int titleToNumber(String s) {

		int res = 0;
		int pow = 1;

		for (int i = s.length() - 1; i >= 0; i--) {
			res += (s.charAt(i) - 64) * pow;
			pow *= 26;
		}

		return res;
	}

}
