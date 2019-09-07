package Easy;
import java.util.*;

// My solution of Pascal's triangle : https://leetcode.com/problems/pascals-triangle/

public class PascalTriangle {

	public static void main(String[] args) {

		System.out.println(generate(Integer.parseInt(args[0])));

	}
	
	// solution method:
	
	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows == 0)
			return result;

		List<Integer> one = new ArrayList<Integer>();
		one.add(1);
		result.add(one);

		if (numRows <= 1)
			return result;

		one = new ArrayList<Integer>();
		one.add(1);
		one.add(1);

		result.add(one);

		while (numRows-- > 2) {
			List<Integer> last = result.get(result.size() - 1);

			List<Integer> curr = new ArrayList<Integer>();
			curr.add(1);

			for (int i = 0; i < last.size() - 1; i++) {
				curr.add(last.get(i) + last.get(i + 1));
			}

			curr.add(1);

			result.add(curr);
		}
		return result;
	}

}