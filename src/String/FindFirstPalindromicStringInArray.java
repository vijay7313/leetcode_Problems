package String;

public class FindFirstPalindromicStringInArray {
	public static void main(String[] args) {

		String[] words = { "abc", "car", "ada", "racecar", "cool" };

		String result = firstPalindrome(words);

		System.out.println(result);
	}

	public static String firstPalindrome(String[] words) {

		for (String word : words)
			if (palindrome(word))
				return word;

		return "";
	}

	public static boolean palindrome(String str) {

		int start = 0;
		int end = str.length() - 1;

		while (start < end)
			if (str.charAt(start++) != str.charAt(end--))
				return false;
		return true;
	}
}
