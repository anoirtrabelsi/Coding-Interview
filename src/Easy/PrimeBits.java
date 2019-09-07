package Easy;

public class PrimeBits {
	

	// Prime Number of Set Bits in Binary Representation:
	// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
	
	public static void main(String[] args) {
		System.out.println(countPrimeSetBits(1, 10));
	}
	
    public static int countPrimeSetBits(int L, int R) {
		 int res=0;
	     for (int i=L; i<=R; i++) {
	    	 if (prime(countSetBits(i)))
	    		 res++;
	     }
	     return res;
	  }
	 
	 
	 public static int countSetBits(int n) {
		 int count = 0;
		 while(n!=0) {
			 count+=n&1;
			 n= n>>1;
		 }
		 return count;
	 }
	 
	 public static boolean prime(int n) {
		 if (n<=1)
			 return false;
		 for(int i=2; i*i<=n; i++) {
			 if(n%i==0)
				 return false;
		 }
		 return true;
	 }


}
