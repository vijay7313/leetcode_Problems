package String;

public class ReverseString {

	public static void main(String[] args) {

		char[] input = { 'h', 'e', 'l', 'l', 'o' };

		reverseString(input);

	}

	public static void reverseString(char[] input) {

		int start = 0;

		int end = input.length - 1;

		while (start < end) {
			char temp = input[start];
			input[start] = input[end];
			input[end] = temp;
		}
	}
}
