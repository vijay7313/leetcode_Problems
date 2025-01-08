package leet_array;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 2, 4, 0, 6, 2, 0 };

		moveZeros(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void moveZeros(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++)
			if (nums[j] == 0)
				continue;
			else
				swap(nums, i++, j);
	}

	public static void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
}
