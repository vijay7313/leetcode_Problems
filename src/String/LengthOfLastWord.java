package String;

public class LengthOfLastWord {
	public static void main(String[] args) {

		String str = "   fly me   to   the moon  ";

		System.out.println(lengthOfLastWord(str));
	}

	public static int lengthOfLastWord(String s) {

		int size = 0;

		int end = s.length() - 1;

		while (s.charAt(end) == ' ')
			end--;

		for (int i = end; i >= 0; i--)
			if (s.charAt(i) != ' ')
				size++;
			else
				break;

		return size;
	}
}
