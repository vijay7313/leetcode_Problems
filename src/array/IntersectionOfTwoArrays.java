package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = { 4, 9, 5 };

		int[] nums2 = { 9, 4, 9, 8, 4 };

		System.out.println(Arrays.toString(intersect(nums1, nums2)));

	}

	public static int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<>();

		int[] res = new int[Math.min(nums1.length, nums2.length)];

		int index = 0;
		for (int num : nums1)
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);

		for (int num : nums2)
			if (map.containsKey(num) && map.get(num) > 0) {
				res[index++] = num;
				map.put(num, map.get(num) - 1);
			}

		return Arrays.copyOf(res, index);

	}

}
