package String;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";

		System.out.println(isAnagram(s.toCharArray(), t.toCharArray()));
	}

	public static boolean isAnagram(char[] s, char[] t) {

		Map<Character, Integer> map = new HashMap<>();

		int length;

		if (s.length == t.length)
			length = s.length;
		else
			return false;

		for (int i = 0; i < length; i++)
			if (map.containsKey(s[i]))
				map.put(s[i], map.get(s[i]) + 1);
			else
				map.put(s[i], 1);

		for (int i = 0; i < length; i++) {
			if (map.containsKey(t[i]))
				map.put(t[i], map.get(t[i]) - 1);
			else
				map.put(t[i], 1);

			if (map.get(t[i]) == 0)
				map.remove(t[i]);
		}

		if (map.isEmpty())
			return true;
		else
			return false;

	}

}
