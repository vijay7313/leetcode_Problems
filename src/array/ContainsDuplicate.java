package array;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {

		Arrays.sort(nums);

		for (int i = 1; i < nums.length; i++)
			if (nums[i] == nums[i - 1])
				return true;

		return false;

	}
}
