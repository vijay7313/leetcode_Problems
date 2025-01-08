package leet_string;

public class StringToInteger_AtoI {

	public static void main(String[] args) {
		String s = "+1";

		System.out.println(myAtoi(s));

	}

	private static int myAtoi(String s) {

		if (s.isEmpty())
			return 0;

		int count = 0;
		int num = 0;
		boolean isNegative = false;

		char[] remvoeInString = { ' ', '-', '0' };

		while (num < remvoeInString.length) {
			if (num == 1 && s.charAt(count) == '-')
				isNegative = true;
			count = removeStartsWithNonNumberic(s, remvoeInString[num++], count);
		}

		s = s.substring(count, s.length());

		count = 0;

		num = 0;
		int first = 0;

		while (count < s.length()) {

			if (s.charAt(count) >= 48 && s.charAt(count) <= 57)
				first = (int) s.charAt(count) - 48;
			else
				break;

			if (Integer.MAX_VALUE / 10 < num + first)
				return isNegative ? -Integer.MAX_VALUE : Integer.MAX_VALUE;
			num = num * 10 + first;

			count++;
		}

		return isNegative ? -num : num;
	}

	public static int removeStartsWithNonNumberic(String s, char ch, int count) {
		for (int i = count; i < s.length(); i++)
			if (s.charAt(i) == ch)
				count++;
			else
				break;
		return count;
	}
}
