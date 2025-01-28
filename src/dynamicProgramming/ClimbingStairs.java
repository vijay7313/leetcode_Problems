package dynamicProgramming;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(45));
	}

	public static int climbStairs(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		int prev1 = 1; // Ways to reach step 1
		int prev2 = 1; // Ways to reach step 0

		for (int i = 2; i <= n; i++) {
			int current = prev1 + prev2; // Current step ways
			prev2 = prev1; // Update for next step
			prev1 = current; // Update for next step
		}

		return prev1;
	}
}
