package leet_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };

		int target = 6;

		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++)
			if (map.containsKey(target - nums[i]))
				return new int[] { map.get(target - nums[i]), i };
			else
				map.put(nums[i], i);

		return null;
	}
}
