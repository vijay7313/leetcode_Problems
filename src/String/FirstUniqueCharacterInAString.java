package String;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {

		String s = "dddccdbba";

		System.out.println(firstUniqChar(s.toCharArray()));
	}

	public static int firstUniqChar(char[] s) {
		int length = s.length;

		if (length == 1)
			return 0;

		Set<Character> set = new HashSet<>();

		for (int i = 0; i < length; i++) {
			if (i == length - 1 && !set.contains(s[i]))
				return i;
			for (int j = i + 1; j < length; j++)
				if (s[i] == s[j])
					break;
				else if (j == length - 1 && !set.contains(s[i]))
					return i;
			set.add(s[i]);
		}

		return -1;

	}
}
