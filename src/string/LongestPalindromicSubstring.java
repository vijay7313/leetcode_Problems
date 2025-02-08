package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//xaabacxcabaaxcabaax
//klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc

public class LongestPalindromicSubstring {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		String s = "klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc";

		String result = longestPalindrome(s);

		System.out.println(result);

		long end = System.currentTimeMillis();

		System.out.println(end - start);

	}

	public static String longestPalindrome(String s) {

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
