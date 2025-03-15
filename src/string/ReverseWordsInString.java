package string;

import java.util.Stack;

public class ReverseWordsInString {
	public static void main(String[] args) {

		String str = "  hello world  ";

		String result = reverseWords(str);

		System.out.println(result);

	}

	public static String reverseWords(String s) {

		Stack<Character> stack = new Stack<>();

		StringBuffer str = new StringBuffer();

		for (int i = s.length() - 1; i >= 0; i--)

			if (s.charAt(i) != ' ')
				stack.push(s.charAt(i));
			else
				reverseWordFromStasck(str, stack);

		reverseWordFromStasck(str, stack);

		return str.deleteCharAt(str.length() - 1).toString();
	}

	public static void reverseWordFromStasck(StringBuffer str, Stack<Character> stack) {

		if (!stack.isEmpty()) {
			while (!stack.isEmpty())
				str.append(stack.pop());
			str.append(" ");
		}
	}
}
