package dynamicProgramming;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] nums = { 5, 4, -1, 7, 8 };

		int result = maxSubArray(nums);

		System.out.println(result);
	}

	public static int maxSubArray(int[] nums) {

		int currentSum = nums[0], maxSum = nums[0];

		for (int i = 1; i < nums.length; i++) {

			currentSum = Math.max(nums[i], currentSum + nums[i]);

			if (maxSum < currentSum)
				maxSum = currentSum;
		}

		return maxSum;

	}
}
