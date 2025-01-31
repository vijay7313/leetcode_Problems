package array;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };

		int val = 2;

		int k = removeElement(nums, val);

		int[] newNums = Arrays.copyOf(nums, k);

		System.out.println(Arrays.toString(newNums));

	}

	public static int removeElement(int[] nums, int val) {

		int k = 0;

		for (int i = 0; i < nums.length; i++)
			if (nums[i] != val)
				nums[k++] = nums[i];

		return k;
	}

}
