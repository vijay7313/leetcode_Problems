package String;

public class ValidPalindrome {

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";

		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {

		char[] str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

		int start = 0;
		int end = str.length - 1;
		while (start < end)
			if (str[start++] != str[end--])
				return false;

		return true;

	}
}
