package leet_string;

public class ValidPalindrome {
	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";

		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		char[] chr = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();

		int start = 0;
		int end = chr.length - 1;

		while (start < end)
			if (chr[start++] != chr[end--])
				return false;

		return true;
	}
}
