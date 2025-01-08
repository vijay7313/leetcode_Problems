package String;

public class ReverseInteger {

	public static void main(String[] args) {

		int x = 1534236469;

		System.out.println(reverse(x));

	}

	private static int reverse(int x) {
		int result = 0;
		boolean isNegative = false;

		if (isNegative = x < 0)
			x *= -1;

		while (x != 0) {
			int rem = x % 10;

			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && rem > 7))
				return 0;
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && rem < 8))
				return 0;

			result = result * 10 + rem;
			x /= 10;
		}

		return isNegative ? -result : result;
	}
}
