package leet_array;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1 };

		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {

		int length = nums.length;
		if (length > 1)
			for (int i = 0; i < length; i++)
				for (int j = i + 1; j < length; j++)
					if (nums[i] == nums[j])
						return true;
		return false;

	}

}
