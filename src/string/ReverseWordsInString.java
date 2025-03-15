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

		int start = 0;

		int end = s.length() - 1;

		while (start <= end)
			if (s.charAt(end) == ' ')
				end--;
			else
				break;

		for (int i = end; i >= 0; i--)

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
