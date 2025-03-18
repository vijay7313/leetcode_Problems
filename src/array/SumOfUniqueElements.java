package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SumOfUniqueElements {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1, 1 };
		int result = sumOfUnique(nums);
		System.out.println(result);

	}

	public static int sumOfUnique(int[] nums) {

		Map<Integer, Integer> set = new HashMap<>();

		for (int num : nums)
			if (set.containsKey(num))
				set.put(num, set.get(num) + 1);
			else
				set.put(num, 1);

		int sum = 0;

		for (Entry<Integer, Integer> entry : set.entrySet())

			if (entry.getValue() == 1)
				sum += entry.getKey();

		return sum;
	}
}
