package leet_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 }, nums2 = { 2, 2, 5 };

		int[] result = intersect(nums1, nums2);

		System.out.println(Arrays.toString(result));
	}

	private static int[] intersect(int[] nums1, int[] nums2) {

		if (nums1.length < 1 || nums2.length < 1)
			return new int[0];

		int[] returnArray = new int[Math.min(nums1.length, nums2.length)];

		int index = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums1)
			map.put(num, map.getOrDefault(num, 0) + 1);

		for (int num : nums2)
			if (map.containsKey(num) && map.get(num) > 0) {
				map.put(num, map.get(num) - 1);
				returnArray[index++] = num;
			}

		return Arrays.copyOf(returnArray, index);

	}
}
