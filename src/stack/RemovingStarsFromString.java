package stack;

import java.util.Stack;

public class RemovingStarsFromString {
	public static void main(String[] args) {
		String s = "leet**cod*e";

		String result = removeStars(s);

		System.out.println(result);
	}

	public static String removeStars(String s) {

		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray())
			if (ch != '*')
				stack.push(ch);
			else
				stack.pop();

		StringBuilder str = new StringBuilder();

		for (char ch : stack)
			str.append(ch);

		return str.toString();
	}
}
