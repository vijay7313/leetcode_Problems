package string;

//xaabacxcabaaxcabaax
//klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc

public class LongestPalindromicSubstring {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		String s = "klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc";

//		String result = longestPalindromeOofNcube(s); // o(n^3)

		String result = longestPalindromeOofNSquare(s); // 0(n^2)

		System.out.println(result);

		long end = System.currentTimeMillis();

		System.out.println(end - start);

	}

	public static String longestPalindromeOofNSquare(String s) {

		int lenght = s.length();

		String longestPalindrome = String.valueOf(s.charAt(0));

		for (int i = 1; i < lenght; i++) {

			boolean isPalindrome = false;

			int left = i - 1;
			int right = i + 1;

			while ((left >= 0 && right <= lenght - 1) && s.charAt(left--) == s.charAt(right++))
				isPalindrome = true;

			if (isPalindrome && longestPalindrome.length() < s.substring(left + 1, right).length())
				longestPalindrome = s.substring(left + 1, right);
		}
		return longestPalindrome;

	}

	// o(n^3)
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

	public static boolean isPalindrome(String s, int start, int end) {

		while (start < end)
			if (s.charAt(start++) != s.charAt(end--))
				return false;
		return true;

	}
}
