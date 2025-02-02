package Stack;

import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {

		String s = "()(()()()";

		int count = longestValidParentheses(s);

		System.out.println(count);
	}

	private static int longestValidParentheses(String s) {

		int count = 0;

		int maxCount = 0;

		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {

			if (ch == '(') {
				stack.push(ch);
			}

			else if (ch == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
					count = count + 2;
					if (maxCount < count)
						maxCount = count;
				}
			} else
				count = 0;
		}
		return maxCount;
	}
}
