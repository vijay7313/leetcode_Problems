package string;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "";

		int result = lengthOfLongestSubstring(str);

		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String str) {

		if (str.length() < 1)
			return 0;

		int count = 1, longCount = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			int j = i;
			count = 1;

			while (j < str.length() - 1) {

				if (str.charAt(i) != str.charAt(j + 1)) {
					j++;
					if (subStringCheck(str, i, j))
						count++;
					else
						break;
				}

				else {
					break;
				}

			}

			if (count > longCount) {
				longCount = count;
			}

		}
		return longCount;

	}

	public static boolean subStringCheck(String str, int i, int j) {
		int current = j;
		j--;

		while (i >= 0 && i <= j)
			if (str.charAt(current) != str.charAt(j))
				j--;
			else
				return false;

		return true;

	}
}
