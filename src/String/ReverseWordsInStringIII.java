package String;

import java.util.Stack;

public class ReverseWordsInStringIII {
	public static void main(String[] args) {

		String str = "Let's take LeetCode contest";

		String result = reverseWords(str);

		System.out.println(result);
	}

	public static String reverseWords(String s) {

		Stack<Character> stack = new Stack<>();

		StringBuffer str = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ' || i == s.length()) {
				reverse(str, stack);
				str.append(" ");
			} else {
				stack.push(s.charAt(i));
			}
		}
		reverse(str, stack);
		return str.toString();
	}

	public static void reverse(StringBuffer str, Stack<Character> stack) {
		while (!stack.isEmpty())
			str.append(stack.pop());

	}
}
