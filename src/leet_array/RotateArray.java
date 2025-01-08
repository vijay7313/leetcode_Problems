package leet_array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 }; // Output: [5,6,7,1,2,3,4]

		rotate(nums, 3);

		System.out.println(Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {

		int length = nums.length;

		swap(nums, 0, length - 1);
		swap(nums, 0, k - 1);
		swap(nums, k, length - 1);

	}

	public static void swap(int nums[], int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start++] = nums[end];
			nums[end--] = temp;
		}
	}
}
