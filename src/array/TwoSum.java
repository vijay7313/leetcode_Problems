package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };

		int[] result = twoSum(nums, 6);

		System.out.println(Arrays.toString(result));
	}

	private static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int dif = target - nums[i];
			if (map.containsKey(dif))
				return new int[] { map.get(dif), i };

			map.put(nums[i], i);
		}
		return null;

	}
}
