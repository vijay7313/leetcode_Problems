package array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

		rotate(nums, 3);

		System.out.println(Arrays.toString(nums));

	}

	public static void rotate(int[] nums, int k) {

		int length = nums.length;

		k = k % length;

		if (k > 0 || length <= 1)
			return;

		reverse(nums, 0, length - 1);

		reverse(nums, 0, k - 1);

		reverse(nums, k, length - 1);

	}

	public static void reverse(int[] nums, int start, int end) {

		int temp = 0;

		while (start < end) {
			temp = nums[start];

			nums[start++] = nums[end];

			nums[end--] = temp;
		}
	}

}
