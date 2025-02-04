package string;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {

		int result = lengthOfLongestSubstring("abcabcbb");

		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String s) {
		int count = 1;
		int longCount = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) != s.charAt(i)) {
				count++;
				if (count > longCount)
					longCount = count;
			} else
				count = 1;

		}

		return longCount;
	}
}
