package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//o(n^2)
public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = { 1, -1, -1, 0 };

		sort(nums); // o(n log n)

		List<List<Integer>> list = threeSum(nums); // o(n^2)

		System.out.println(list);

	}

	private static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {

			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					list.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while (left < right && nums[left] == nums[left + 1])
						left++;

					while (left < right && nums[right] == nums[right - 1])
						right--;

					left++;
					right--;
				}

				else if (sum < 0)
					left++;
				else
					right--;

			}
		}
		return list;

	}

	private static void sort(int[] nums) {

		if (nums.length < 2)
			return;

		int middle = nums.length / 2;

		int[] left = new int[middle];

		int[] right = new int[nums.length - middle];

		for (int i = 0; i < middle; i++)
			left[i] = nums[i];

		for (int i = middle; i < nums.length; i++)
			right[i - middle] = nums[i];

		sort(left);
		sort(right);

		merge(left, right, nums);
	}

	private static void merge(int[] left, int[] right, int[] nums) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length)
			if (left[i] < right[j])
				nums[k++] = left[i++];
			else
				nums[k++] = right[j++];

		while (i < left.length)
			nums[k++] = left[i++];

		while (j < right.length)
			nums[k++] = right[j++];

	}
}
