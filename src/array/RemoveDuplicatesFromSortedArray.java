package array;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		int length = removeDuplicates(nums);

		System.out.println(length);

		for (int i = 0; i < length; i++)
			System.out.print(nums[i] + " ");
	}

	public static int removeDuplicates(int[] nums) {

		int i = 0;

		for (int j = i + 1; j < nums.length; j++)
			if (nums[i] == nums[j])
				continue;
			else
				nums[++i] = nums[j];

		return i + 1;
	}
}
