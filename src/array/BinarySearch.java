package array;

public class BinarySearch {
	public static void main(String[] args) {

		int[] nums = { -1, 0, 3, 5, 9, 12 };

		int result = search(nums, 9);

		System.out.println(result);
	}

	public static int search(int[] nums, int target) {

		int start = 0, end = nums.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (nums[mid] < target)
				start = mid + 1;
			else if (nums[mid] > target)
				end = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
