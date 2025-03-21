package Stack;

import java.util.Stack;

public class ClearDigits {
	public static void main(String[] args) {

		String s = "abc";

		String result = clearDigits(s);

		System.out.println(result);
	}

	public static String clearDigits(String s) {

		Stack<Character> stack = new Stack<>();

		for (int num : s.toCharArray())
			if (97 <= num || num >= 122)
				stack.push((char) num);
			else
				stack.pop();

		StringBuilder str = new StringBuilder();

		for (char ch : stack)
			str.append(ch);

		return str.toString();
	}
}
