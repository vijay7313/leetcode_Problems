package Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
	public static void main(String[] args) {

		String s = "abbaca";

		String result = removeDuplicates(s);

		System.out.println(result);
	}

	public static String removeDuplicates(String s) {

		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray())
			if (!stack.isEmpty() && stack.peek() == ch)
				stack.pop();
			else
				stack.push(ch);

		StringBuilder str = new StringBuilder();

		for (char ch : stack)
			str.append(ch);

		return str.toString();
	}
}
