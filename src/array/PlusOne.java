package array;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {

		int[] digits = { 9, 8, 9 };

		System.out.println(Arrays.toString(plusOne(digits)));

	}

	private static int[] plusOne(int[] digits) {

		int length = digits.length;

		for (int i = length - 1; i >= 0; i--)
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			} else
				digits[i] = 0;

		digits = new int[length + 1];
		digits[0] = 1;
		return digits;

	}
}
