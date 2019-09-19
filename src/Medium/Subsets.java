package Medium;

import java.util.*;

public class Subsets {

	// Subsets: https://leetcode.com/problems/subsets/

	public static List<List<Integer>> subsets(int[] nums) {
	   
		List<List<Integer>> list = new ArrayList<>();
	    
	    helper(list, new ArrayList<Integer>(), nums, 0);
	    return list;
	}

	private static void helper(List<List<Integer>> list , List<Integer> curr, int [] nums, int start){
	    
		list.add(new ArrayList<>(curr));
	    
	    for(int i = start; i < nums.length; i++){
	        curr.add(nums[i]);
	     
	        helper(list, curr, nums, i + 1);
	        
	        curr.remove(curr.size() - 1);
	    }
	}
}
