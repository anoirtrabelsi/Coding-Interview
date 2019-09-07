package Easy;

import java.util.*;

public class UniqueEmailAddress {

	// Unique Email Addresses: https://leetcode.com/problems/unique-email-addresses/

	public static void main(String[] args) {
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		
		System.out.println(numUniqueEmails(emails));
	}

	public static int numUniqueEmails(String[] emails) {

		Set<String> set = new HashSet<String>();

		for (int i = 0; i < emails.length; i++) {

			StringBuilder sb = new StringBuilder(emails[i]);

			for (int j = 0; j < sb.indexOf("@"); j++) {
				if (sb.charAt(j) == '.')
					sb.deleteCharAt(j);
				if (sb.charAt(j) == '+')
					sb.delete(j, sb.indexOf("@"));
			}
			set.add(sb.toString());
		}
		return set.size();
	}

}
