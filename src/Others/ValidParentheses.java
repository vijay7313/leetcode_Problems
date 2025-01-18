package Others;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		List<Character> leftBracket = Arrays.asList('(', '{', '[');

		List<Character> rightBracket = Arrays.asList(')', '}', ']');

		for (char ch : s.toCharArray())

			if (leftBracket.contains(ch))

				stack.push(ch);

			else

			if (stack.isEmpty())
				return false;

			else if (leftBracket.indexOf(stack.peek()) == rightBracket.indexOf(ch))
				stack.pop();
			else
				return false;

		if (stack.isEmpty())
			return true;
		else
			return false;
	}
}
