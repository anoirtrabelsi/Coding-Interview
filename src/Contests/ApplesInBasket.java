package Contests;

import java.util.*;

public class ApplesInBasket {

	// You have some apples, where arr[i] is the weight of the i-th apple. You also
	// have a basket that can carry up to 5000 units of weight.

	// Return the maximum number of apples you can put in the basket.

	// E.g: Input: arr = [100,200,150,1000]
	// Output: 4
	// Explanation: All 4 apples can be carried by the basket since their sum of
	// weights is 1450 < 5000.
	

	public static int maxNumberOfApples(int[] arr) {

		Arrays.sort(arr);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) 
			sum += arr[i];
		
		int res = arr.length;

		if (sum <= 5000)
			return res;
		
		int index = arr.length - 1;
		
		while (sum > 5000) {
			sum -= arr[index--];
			res--;
		}
		return res;
	}

}
