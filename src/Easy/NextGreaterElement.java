package Easy;

import java.util.*;

public class NextGreaterElement {
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	      int[] result = new int[nums1.length];
	      int k=0;
        // HashMap that stores the indices of th elements of nums1:
	      Map<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();
	      for (int i=0; i<nums2.length; i++) {
	    	  mapIndex.put(nums2[i], i);
	      }
	      
	      for (int x : nums1) {
	    	  int index = mapIndex.get(x);
	    	  
            int i=index+1;
            
	    	  for (; i<nums2.length; i++) {
	    		  if (nums2[i] > x) {
	    			  result[k++] = nums2[i];
	    			  break;
	    		  }
	    		  
	    	  }
            // next greater element not found
	    	  if(i >= nums2.length)
  			  result[k++] = -1;
	      }
	      return result;
	 }

}
