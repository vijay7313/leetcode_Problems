package leet_array;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {

		int[] digits = { 9 };

		int[] result = plusOne(digits);

		System.out.println(Arrays.toString(result));

	}

	public static int[] plusOne(int[] digits) {

		int length = digits.length;
		if (length >= 1) {
			for (int i = length - 1; i >= 0; i--)
				if (digits[i] < 9) {
					digits[i] += 1;
					break;
				} else
					digits[i] = 0;

			if (digits[0] == 0) {
				int[] newInt = new int[length + 1];
				newInt[0] = 1;
				return newInt;
			}

		}

		return digits;
	}
}
