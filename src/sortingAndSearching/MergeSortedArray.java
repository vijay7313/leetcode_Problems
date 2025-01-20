package sortingAndSearching;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		int nums1Length = nums1.length;
		int nums2Length = nums2.length;

		merged(nums1, nums1Length - nums2Length, nums2, nums2Length);

		System.out.println(Arrays.toString(nums1));
	}

	private static void merged(int[] nums1, int m, int[] nums2, int n) {
		int count = 0;
		for (int i = m; i < m + n; i++)
			nums1[i] = nums2[count++];

		int length = nums1.length;
		boolean sorted;

		for (int i = 0; i < length; i++) {
			sorted = true;

			for (int j = 1; j < length - i; j++)
				if (nums1[j] < nums1[j - 1]) {
					swap(nums1, j, j - 1);
					sorted = false;
				}

			if (sorted)
				return;
		}
	}

	private static void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}

}
