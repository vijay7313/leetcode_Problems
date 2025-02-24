package sortingAndSearchingMedium;

import java.util.Arrays;

// 0 -> red
// 1 -> white
// 2 -> blue
public class SortColors {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };

		System.out.println(Arrays.toString(nums));

		sortColors(nums);

		System.out.println(Arrays.toString(nums));
	}

	public static void sortColors(int[] nums) {
		int zero = 0;
		int one = 0;

		for (int num : nums)
			if (num == 0)
				zero++;
			else if (num == 1)
				one++;

		for (int i = 0; i < nums.length; i++)
			if (zero-- > 0)
				nums[i] = 0;
			else if (one-- > 0)
				nums[i] = 1;
			else
				nums[i] = 2;
	}
}
