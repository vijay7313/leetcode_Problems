package Stack;

import java.util.Stack;

public class MinStrLenAfterRemovingSubstrs {
	public static void main(String[] args) {

		String s = "ABFCACDB";
		int result = minLength(s);

		System.out.println(result);
	}

	public static int minLength(String s) {

		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray())

			if (ch == 'B' && !stack.isEmpty() && stack.peek() == 'A')
				stack.pop();
			else if (ch == 'D' && !stack.isEmpty() && stack.peek() == 'C')
				stack.pop();
			else
				stack.push(ch);

		return stack.size();
	}
}
