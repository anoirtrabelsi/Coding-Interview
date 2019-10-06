package Medium;

import java.util.*;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> anagrams = new HashMap<String, List<String>>();

		for (String s : strs) {

			char[] chars = s.toCharArray();
			Arrays.sort(chars);

			String curr = new String(chars);

			if (!anagrams.containsKey(curr)) {

				List<String> list = new ArrayList<String>();
				list.add(s);

				anagrams.put(curr, list);
			} else {
				anagrams.get(curr).add(s);

			}

		}

		List<List<String>> res = new ArrayList<List<String>>();

		res.addAll(anagrams.values());

		return res;

		// streams are relatively slow xD
		// return anagrams.values().stream().collect(Collectors.toList());
	}

}
