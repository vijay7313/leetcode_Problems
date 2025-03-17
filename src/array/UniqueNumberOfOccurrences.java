package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueNumberOfOccurrences {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 1, 1, 3 };

		boolean result = uniqueOccurrences(arr);

		System.out.println(result);
	}

	public static boolean uniqueOccurrences(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr)
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);

		Set<Integer> set = new HashSet<>();

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (set.contains(entry.getValue()))
				return false;
			set.add(entry.getValue());
		}

		return true;
	}
}
