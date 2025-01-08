package leet_string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

	// "dddccdbba"
	// "z"	
	// "aabb"
	// leetcode
	// loveleetcode

	public static void main(String[] args) {
		String s = "dddccdbba";

		System.out.println(firstUniqChar(s));
	}

	public static int firstUniqChar(String s) {

		int length = s.length();

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < length; i++) {
			if (map.containsKey(s.charAt(i)))
				continue;
			map.put(s.charAt(i), 1);
			for (int j = i + 1; j < length; j++)
				if (s.charAt(i) == s.charAt(j)) {
					map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
					break;
				}
			if (map.get(s.charAt(i)) == 1)
				return i;
		}

		return -1;

	}
}
