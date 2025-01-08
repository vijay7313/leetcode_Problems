package String;

public class StringToInteger_AtoI {

	public static void main(String[] args) {

		String s = "+-12";

		System.out.println(myAtoi(s));

	}

	public static int myAtoi(String s) {

		boolean isNegative = false;

		int length = s.length();

		int i = 0;
		while (i < length && s.charAt(i) == ' ')
			i++;

		if (i < length && s.charAt(i) == '-') {
			isNegative = true;
			i++;
		} else if (i < length && s.charAt(i) == '+')
			i++;

		while (i < length && s.charAt(i) == '0')
			i++;

		int res = 0;

		while (i < length && '0' <= s.charAt(i) && '9' >= s.charAt(i))

			if (intRangeCheck(res, s.charAt(i), isNegative))
				return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			else
				res = res * 10 + s.charAt(i++) - '0';

		return isNegative ? -res : res;

	}

	public static boolean intRangeCheck(int res, int ch, boolean isNegative) {
		if (isNegative)
			return -res < (Integer.MIN_VALUE + (ch - '0')) / 10;
		else
			return res > (Integer.MAX_VALUE - (ch - '0')) / 10;
	}
}
