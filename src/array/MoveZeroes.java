package array;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 2, 0, 0, 1, 0, 9 };
		System.out.println(Arrays.toString(nums));
		moveZeroes(nums);

		System.out.println(Arrays.toString(nums));
	}

	public static void moveZeroes(int[] nums) {

		int first = 0;
		for (int second = 0; second < nums.length; second++)
			if (nums[second] != 0) {
				int temp = nums[first];
				nums[first++] = nums[second];
				nums[second] = temp;
			}

	}
}
