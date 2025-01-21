package Others;

public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		System.out.println(missingNumber(nums));

	}

	public static int missingNumber(int[] nums) {

		int arr = nums.length;

		int sumOfGivenArray = 0;

		arr = (arr * (arr + 1)) / 2;

		for (int number : nums)
			sumOfGivenArray += number;

		return arr - sumOfGivenArray;

	}
}
