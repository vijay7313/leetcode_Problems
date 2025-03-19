package string;

public class SplitTwoStringsToMakePalindrome {
	public static void main(String[] args) {

		String a = "abdef", b = "fecab";

		boolean result = checkPalindromeFormation(a, b);

		System.out.println(result);
	}

	public static boolean checkPalindromeFormation(String a, String b) {

		if (a.length() == 1)
			return true;

		int aStart = 0;
		int aEnd = a.length() / 2;

		int bStart = b.length() / 2;
		int bEnd = b.length() - 1;

		while (aStart < aEnd && bStart <= bEnd && a.charAt(aStart) == b.charAt(bEnd)) {
			aStart++;
			bEnd--;
		}

		if (aStart == aEnd)
			return true;

		aStart = a.length() / 2;
		aEnd = a.length() - 1;

		bStart = 0;
		bEnd = a.length() / 2;

		while (aStart < aEnd && bStart <= bEnd && a.charAt(aStart) == b.charAt(bEnd)) {
			aStart++;
			bEnd--;
		}

		if (aStart == aEnd)
			return true;

		aStart = a.length() / 2;
		aEnd = a.length() - 1;

		bStart = 0;
		bEnd = (b.length() / 2) - 1;

		while (aStart <= aEnd && bStart <= bEnd && a.charAt(aStart) == b.charAt(bEnd)) {
			aStart++;
			bEnd--;
		}

		if (aStart == aEnd)
			return true;

		return false;
	}
}
