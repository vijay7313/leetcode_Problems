package hashTable;

import java.util.HashMap;
import java.util.Map;

public class CheckAllCharactersHaveEqualNumOfOccurrences {
	public static void main(String[] args) {

		String s = "vvvvvvvvvvvvvvvvvvv";

		boolean result = areOccurrencesEqual(s);

		System.out.println(result);

	}

	public static boolean areOccurrencesEqual(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray())
			if (!map.containsKey(ch))
				map.put(ch, 1);
			else
				map.put(ch, map.get(ch) + 1);

		int fre = -1;
		for (int count : map.values())
			if (fre == -1)
				fre = count;
			else if (fre != count)
				return false;

		return true;
	}
}
