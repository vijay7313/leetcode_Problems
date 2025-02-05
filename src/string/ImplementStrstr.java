package string;

public class ImplementStrstr {

	public static void main(String[] args) {

		String haystack = "mississippi";

		String needle = "issip";

		System.out.println(strStr(haystack, needle));

	}

	public static int strStr(String haystack, String needle) {

		int length = haystack.length() - needle.length();

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
