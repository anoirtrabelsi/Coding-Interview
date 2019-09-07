package Easy;

public class DefangIP {
	
	//Defanging an IP Address: https://leetcode.com/problems/defanging-an-ip-address/
	
	public static void main(String[] args) {
		
		String ip = "255.100.50.0";
		
		System.out.println(defangIPaddr(ip));
	}
	
	
	 public static String defangIPaddr(String address) {
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i=0; i<address.length(); i++){
	            if (address.charAt(i) == '.')
	                sb.append("[.]");
	            else
	                sb.append(address.charAt(i));
	                
	        }
	        
	        return sb.toString();
	    }

}
