package leet_string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";

		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {

		int sLength = s.length();
		int tLength = t.length();

		if (sLength != tLength && sLength > 0)
			return false;

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray())
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);

		for (char ch : t.toCharArray()) {
			if (map.containsKey(ch) && map.get(ch) > 0)
				map.put(ch, map.get(ch) - 1);
			else
				break;
			if (map.get(ch) == 0)
				map.remove(ch);
		}

		if (map.isEmpty())
			return true;
		else
			return false;
	}
}
