package leet_string;

public class ReverseInteger {

	public static void main(String[] args) {

		int x = -1463847412;

		System.out.println(reverse(x));

	}

	public static int reverse(int x) {

		int rev = 0;
		while (x != 0) {
			int rem = x % 10;

			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7))
				return 0;

			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8))
				return 0;

			rev = rev * 10 + rem;
			x /= 10;
		}
		return rev;
	}

}
