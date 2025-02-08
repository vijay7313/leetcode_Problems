package string;

/*
xaabacxcabaaxcabaax
klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc
a
aa
aaa
aaaa
abb
babad
cbbd
adam
tattarrattat
 */
public class LongestPalindromicSubstring {
	public static void main(String[] args) {

		String s = "tattarrattat";

		String result = longestPalindromeOofSquare(s); // o(n^2)

//		String result = longestPalindromeOofNcube(s); // o(n^3)

		System.out.println(result);

	}

	// Expand around center algorithm o(n^2)
	public static String longestPalindromeOofSquare(String s) {

		if (s == null || s.length() < 1)
			return "";

		int length = s.length();

		String longestPalindrome = "";

		String oddPalindrome = "";

		String evenPalindrome = "";

		for (int i = 0; i < length; i++) {

			oddPalindrome = expandAroundCenter(i, i, s, length);

			evenPalindrome = expandAroundCenter(i, i + 1, s, length);

			if (oddPalindrome.length() > longestPalindrome.length())
				longestPalindrome = oddPalindrome;

			if (evenPalindrome.length() > longestPalindrome.length())
				longestPalindrome = evenPalindrome;

		}

		return longestPalindrome;
	}

	// support for expand around center algorithm
	public static String expandAroundCenter(int left, int right, String s, int sLength) {

		while (left >= 0 && right < sLength && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);

	}

	// Brute force algorithm o(n^3)
	public static String longestPalindromeOofNcube(String s) {

		if (s == null || s.length() < 1)
			return "";

		String longestPalindrome = "";

		for (int i = 0; i < s.length(); i++)
			for (int j = s.length() - 1; j >= i; j--) {
				String ss = s.substring(i, j + 1);
				if (isPalindrome(ss, 0, ss.length() - 1) && longestPalindrome.length() < ss.length())
					longestPalindrome = ss;
			}
		return longestPalindrome;

	}

	// support for brute force algorithm
	public static boolean isPalindrome(String s, int start, int end) {

		while (start < end)
			if (s.charAt(start++) != s.charAt(end--))
				return false;
		return true;

	}
}
