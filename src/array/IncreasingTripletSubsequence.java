package array;

// 2, 1, 5, 0, 4, 6 
//10, 2, 3, 1, 6
//9, 7, 2, 8, 3, 6, 5, 10
//8, 1, 6, 5, 10
//20,100,10,12,5,13
//1,5,0,4,1,3
//9,10,5,11,10,9,8
public class IncreasingTripletSubsequence {

	public static void main(String[] args) {

		int[] nums = { 9, 10, 5, 11, 10, 9, 8 };

//		boolean result = increasingTripletBruteForce(nums);

//		boolean result = increasingTripletQuadratic(nums);

		boolean result = increasingTripletLinear(nums);

		System.out.println(result);

	}

	public static boolean increasingTripletLinear(int[] nums) {

		if (nums.length < 3)
			return false;

		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++)

			if (first >= nums[i])
				first = nums[i];
			else if (second >= nums[i])
				second = nums[i];
			else
				return true;

		return false;

	}

	// the worst approach o(n^2)
	public static boolean increasingTripletQuadratic(int[] nums) {

		if (nums.length < 3)
			return false;

		int length = nums.length;

		for (int i = 1; i < length - 1; i++) {

			int back = i - 1;

			int forward = i + 1;

			int first = nums[back];

			int middle = nums[i];

			int third = nums[forward];

			while (back >= 0 && forward < length) {

				if (middle > nums[back])
					first = nums[back];
				else
					back--;

				if (middle < nums[forward])
					third = nums[forward];
				else
					forward++;

				if (first < middle && middle < third)
					return true;

			}
		}

		return false;

	}

	// the worst approach o(n^3)
	public static boolean increasingTripletBruteForce(int[] nums) {

		if (nums.length < 3)
			return false;

		int length = nums.length;

		for (int i = 0; i < length; i++)
			for (int j = i + 1; j < length; j++)
				if (nums[i] < nums[j])
					for (int k = j + 1; k < length; k++)
						if (nums[j] < nums[k])
							return true;

		return false;

	}
}
