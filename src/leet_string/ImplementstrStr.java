package leet_string;

public class ImplementstrStr {

	// haystack = "mississippi", needle = "issip";
	// haystack = "sadbutsad", needle = "sad";
	// haystack = "a", needle = "a";
	// haystack = "abc", needle = "c";
	// haystack = "aaaa", needle = "baaa";

	public static void main(String[] args) {
		String haystack = "aaaa", needle = "baaa";

		System.out.println(strStr(haystack, needle));

	}

	private static int strStr(String haystack, String needle) {

		int length = haystack.length() - needle.length();

		if (length == 0)
			return 0;
		if (haystack.length() < needle.length())
			return -1;

		for (int i = 0; i <= length; i++) {
			int j = 0;
			while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
				j++;
			if (j == needle.length())
				return i;
		}

		return -1;
	}

}
