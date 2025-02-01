package Stack;

import java.util.Stack;

public class ReversePrefixOfWord {

	public static void main(String[] args) {

		String result = reversePrefix("abcdefd", 'd');

		System.out.println(result);
	}

	public static String reversePrefix(String word, char ch) {

		Stack<Character> stack = new Stack<>();

		int i;

		for (i = 0; i < word.length(); i++)
			if (word.charAt(i) == ch)
				break;

		if (i == word.length())
			return word;

		for (int j = 0; j <= i; j++)
			stack.push(word.charAt(j));

		StringBuilder s = new StringBuilder();

		while (!stack.isEmpty())
			s.append(stack.pop());

		for (int j = i + 1; j < word.length(); j++)
			s.append(word.charAt(j));

		return s.toString();
	}

}
